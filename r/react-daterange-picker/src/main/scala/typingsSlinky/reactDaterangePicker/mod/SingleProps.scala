package typingsSlinky.reactDaterangePicker.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDaterangePicker.reactDaterangePickerStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleProps[T]
  extends BaseProps[T]
     with Props[T] {
  var onSelect: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.native
  var selectionType: js.UndefOr[single] = js.native
}

object SingleProps {
  @scala.inline
  def apply[T](): SingleProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleProps[T]]
  }
  @scala.inline
  implicit class SinglePropsOps[Self[t] <: SingleProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnSelect(value: /* value */ Moment => Unit): Self[T] = {
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
    def withSelectionType(value: single): Self[T] = {
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

