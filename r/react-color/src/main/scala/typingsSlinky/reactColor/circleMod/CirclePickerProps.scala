package typingsSlinky.reactColor.circleMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirclePickerProps extends ColorPickerProps[CirclePicker] {
  var circleSize: js.UndefOr[Double] = js.native
  var circleSpacing: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  var width: js.UndefOr[String] = js.native
}

object CirclePickerProps {
  @scala.inline
  def apply(): CirclePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirclePickerProps]
  }
  @scala.inline
  implicit class CirclePickerPropsOps[Self <: CirclePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwatchHover")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSwatchHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwatchHover")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

