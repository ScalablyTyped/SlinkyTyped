package typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwatchColorPickerStyleProps extends js.Object {
  /**
    * The distance between cells
    */
  var cellMargin: js.UndefOr[Double] = js.native
  /**
    * Custom className to apply to the container.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Theme to apply to the container
    */
  var theme: ITheme = js.native
}

object ISwatchColorPickerStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISwatchColorPickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerStyleProps]
  }
  @scala.inline
  implicit class ISwatchColorPickerStylePropsOps[Self <: ISwatchColorPickerStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
  }
  
}

