package typingsSlinky.reactDaterangePicker.mod

import typingsSlinky.reactDaterangePicker.reactDaterangePickerStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeProps[T]
  extends BaseProps[T]
     with Props[T] {
  var onSelect: js.UndefOr[js.Function1[/* value */ OnSelectCallbackParam, Unit]] = js.native
  var selectionType: js.UndefOr[range] = js.native
}

object RangeProps {
  @scala.inline
  def apply[T](): RangeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeProps[T]]
  }
  @scala.inline
  implicit class RangePropsOps[Self[t] <: RangeProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnSelect(value: /* value */ OnSelectCallbackParam => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: range): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
  }
  
}

