package typingsSlinky.officeUiFabricReact.pickerItemTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerItemProps[T] extends AllHTMLAttributes[HTMLElement] {
  /**
    * Optional callback to access the IPickerItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPickerItem]] = js.native
  /** Index number of the item in the array of picked items. */
  var index: Double = js.native
  /** The item of Type T (Persona, Tag, or any other custom item provided). */
  var item: T = js.native
  /** Unique key for each picked item. */
  var key: js.UndefOr[String | Double] = js.native
  /**
    * Internal Use only, gives a callback to the renderer to call when an item has changed.
    * This allows the base picker to keep track of changes in the items.
    */
  var onItemChange: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, Unit]] = js.native
  /** Callback issued when the item is removed from the array of picked items. */
  var onRemoveItem: js.UndefOr[js.Function0[Unit]] = js.native
  /** Aria-label for the picked item remove button. */
  var removeButtonAriaLabel: js.UndefOr[String] = js.native
}

object IPickerItemProps {
  @scala.inline
  def apply[T](index: Double, item: T): IPickerItemProps[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerItemProps[T]]
  }
  @scala.inline
  implicit class IPickerItemPropsOps[Self[t] <: IPickerItemProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IPickerItem | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IPickerItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IPickerItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemChange(value: (/* item */ T, /* index */ Double) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnItemChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoveItem(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRemoveItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButtonAriaLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButtonAriaLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonAriaLabel")(js.undefined)
        ret
    }
  }
  
}

