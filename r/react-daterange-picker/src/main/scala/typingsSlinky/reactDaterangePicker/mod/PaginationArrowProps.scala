package typingsSlinky.reactDaterangePicker.mod

import typingsSlinky.reactDaterangePicker.reactDaterangePickerStrings.next
import typingsSlinky.reactDaterangePicker.reactDaterangePickerStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationArrowProps[T]
  extends typingsSlinky.react.mod.Props[T] {
  var direction: js.UndefOr[next | previous] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onTrigger: js.UndefOr[js.Function0[Unit]] = js.native
}

object PaginationArrowProps {
  @scala.inline
  def apply[T](): PaginationArrowProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationArrowProps[T]]
  }
  @scala.inline
  implicit class PaginationArrowPropsOps[Self[t] <: PaginationArrowProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDirection(value: next | previous): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTrigger(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrigger")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTrigger: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrigger")(js.undefined)
        ret
    }
  }
  
}

