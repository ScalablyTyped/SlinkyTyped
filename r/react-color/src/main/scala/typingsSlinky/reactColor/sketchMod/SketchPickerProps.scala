package typingsSlinky.reactColor.sketchMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchPickerProps extends ColorPickerProps[SketchPicker] {
  var disableAlpha: js.UndefOr[Boolean] = js.native
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  var presetColors: js.UndefOr[js.Array[String]] = js.native
  var width: js.UndefOr[String] = js.native
}

object SketchPickerProps {
  @scala.inline
  def apply(): SketchPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchPickerProps]
  }
  @scala.inline
  implicit class SketchPickerPropsOps[Self <: SketchPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAlpha")(js.undefined)
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
    def withPresetColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresetColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetColors")(js.undefined)
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

