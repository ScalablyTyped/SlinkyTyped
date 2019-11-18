package typingsSlinky.mobx.libTypesObservablesetMod

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.mobxStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetDidChange[T] extends js.Object {
  var newValue: js.UndefOr[T] = js.undefined
  var `object`: js.UndefOr[ObservableSet[T]] = js.undefined
  var oldValue: js.UndefOr[T] = js.undefined
  var `type`: js.UndefOr[add | delete] = js.undefined
}

object ISetDidChange {
  @scala.inline
  def apply[T](
    newValue: T = null,
    `object`: ObservableSet[T] = null,
    oldValue: T = null,
    `type`: add | delete = null
  ): ISetDidChange[T] = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetDidChange[T]]
  }
}

