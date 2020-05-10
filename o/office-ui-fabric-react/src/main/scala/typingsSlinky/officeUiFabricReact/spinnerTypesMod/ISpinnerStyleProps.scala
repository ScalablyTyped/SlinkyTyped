package typingsSlinky.officeUiFabricReact.spinnerTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinnerStyleProps extends js.Object {
  /** CSS class name for the component attached to the root stylable area. */
  var className: js.UndefOr[String] = js.native
  /** Position of the label in regards to the spinner animation. */
  var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.native
  /** Size of the spinner animation. */
  var size: js.UndefOr[SpinnerSize] = js.native
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
}

object ISpinnerStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISpinnerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerStyleProps]
  }
  @scala.inline
  implicit class ISpinnerStylePropsOps[Self <: ISpinnerStyleProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLabelPosition(value: SpinnerLabelPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SpinnerSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

