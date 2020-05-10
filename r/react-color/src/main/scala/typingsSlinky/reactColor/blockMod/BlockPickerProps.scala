package typingsSlinky.reactColor.blockMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import typingsSlinky.reactColor.reactColorStrings.hide
import typingsSlinky.reactColor.reactColorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPickerProps extends ColorPickerProps[BlockPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.native
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  var triangle: js.UndefOr[hide | top] = js.native
  var width: js.UndefOr[String] = js.native
}

object BlockPickerProps {
  @scala.inline
  def apply(): BlockPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockPickerProps]
  }
  @scala.inline
  implicit class BlockPickerPropsOps[Self <: BlockPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTriangle(value: hide | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangle")(js.undefined)
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

