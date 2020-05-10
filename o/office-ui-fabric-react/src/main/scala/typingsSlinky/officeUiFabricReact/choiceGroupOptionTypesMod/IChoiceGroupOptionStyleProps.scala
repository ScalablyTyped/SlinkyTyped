package typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod

import typingsSlinky.officeUiFabricReact.AnonHeightWidth
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOptionStyleProps extends js.Object {
  /** Whether the option is checked or not. */
  var checked: js.UndefOr[Boolean] = js.native
  /** Whether the option is disabled or not. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** Whether the option is in focus or not. */
  var focused: js.UndefOr[Boolean] = js.native
  /** Whether the option has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.native
  /** Whether the option icon is an image. */
  var hasImage: js.UndefOr[Boolean] = js.native
  /** Whether the image width or height are higher than `71`. */
  var imageIsLarge: js.UndefOr[Boolean] = js.native
  /**
    * Image sizes used when `hasImage` or `hasIcon` style props are enabled.
    * @defaultvalue \{height: 32, width: 32\}
    */
  var imageSize: js.UndefOr[AnonHeightWidth] = js.native
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
}

object IChoiceGroupOptionStyleProps {
  @scala.inline
  def apply(theme: ITheme): IChoiceGroupOptionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOptionStyleProps]
  }
  @scala.inline
  implicit class IChoiceGroupOptionStylePropsOps[Self <: IChoiceGroupOptionStyleProps] (val x: Self) extends AnyVal {
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
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withHasIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHasImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasImage")(js.undefined)
        ret
    }
    @scala.inline
    def withImageIsLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageIsLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageIsLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageIsLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSize(value: AnonHeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(js.undefined)
        ret
    }
  }
  
}

