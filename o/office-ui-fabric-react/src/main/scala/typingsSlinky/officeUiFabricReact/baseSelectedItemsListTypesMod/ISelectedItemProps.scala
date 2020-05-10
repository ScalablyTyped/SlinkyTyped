package typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod

import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedItemProps[T] extends IPickerItemProps[T] {
  def onCopyItem(item: T): Unit = js.native
}

object ISelectedItemProps {
  @scala.inline
  def apply[T](IPickerItemProps: IPickerItemProps[T], onCopyItem: T => Unit): ISelectedItemProps[T] = {
    val __obj = js.Dynamic.literal(onCopyItem = js.Any.fromFunction1(onCopyItem))
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.asInstanceOf[ISelectedItemProps[T]]
  }
  @scala.inline
  implicit class ISelectedItemPropsOps[Self[t] <: ISelectedItemProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnCopyItem(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

