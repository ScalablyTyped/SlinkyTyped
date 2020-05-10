package typingsSlinky.reactColor.mod

import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPickerProps[A] extends ClassAttributes[A] {
  var color: js.UndefOr[Color] = js.native
  var onChange: js.UndefOr[ColorChangeHandler] = js.native
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.native
}

object ColorPickerProps {
  @scala.inline
  def apply[A](): ColorPickerProps[A] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerProps[A]]
  }
  @scala.inline
  implicit class ColorPickerPropsOps[Self[a] <: ColorPickerProps[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withColor(value: Color): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* color */ ColorResult => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeComplete(value: /* color */ ColorResult => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeComplete: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeComplete")(js.undefined)
        ret
    }
  }
  
}

