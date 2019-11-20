package typingsSlinky.mobx

import typingsSlinky.mobx.libTypesObservablesetMod.ISetWillChange
import typingsSlinky.mobx.libTypesObservablesetMod.ObservableSet
import typingsSlinky.mobx.mobxStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteObjectOldValue[T] extends ISetWillChange[T] {
  var `object`: ObservableSet[T]
  var oldValue: T
  var `type`: delete
}

object Anon_DeleteObjectOldValue {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): Anon_DeleteObjectOldValue[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteObjectOldValue[T]]
  }
}

