package typingsSlinky.officeUiFabricReact.dialogTypesMod

import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * Default max-width for the dialog box.
    * @defaultvalue '340px'
    */
  var dialogDefaultMaxWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Default min-width for the dialog box.
    * @defaultvalue '288px'
    */
  var dialogDefaultMinWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Whether the dialog is hidden.
    * @defaultvalue false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object IDialogStyleProps {
  @scala.inline
  def apply(theme: ITheme): IDialogStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogStyleProps]
  }
  @scala.inline
  implicit class IDialogStylePropsOps[Self <: IDialogStyleProps] (val x: Self) extends AnyVal {
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
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogDefaultMaxWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogDefaultMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogDefaultMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogDefaultMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogDefaultMinWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogDefaultMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogDefaultMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogDefaultMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
  }
  
}

