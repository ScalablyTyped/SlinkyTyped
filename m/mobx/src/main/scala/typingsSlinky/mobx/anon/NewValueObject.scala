package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.observablesetMod.ISetDidChange
import typingsSlinky.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueObject[T] extends ISetDidChange[T] {
  var newValue: T
  var `object`: ObservableSet[T]
  var `type`: add
}

object NewValueObject {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): NewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueObject[T]]
  }
}

