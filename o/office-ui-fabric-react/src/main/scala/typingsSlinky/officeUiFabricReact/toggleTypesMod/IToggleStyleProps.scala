package typingsSlinky.officeUiFabricReact.toggleTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToggleStyleProps extends js.Object {
  /**
    * Component is checked.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Root element class name.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Component is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether label should be positioned inline with the toggle.
    */
  var inlineLabel: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user did not specify a on/off text. Influencing only when inlineLabel is used.
    */
  var onOffMissing: js.UndefOr[Boolean] = js.native
  /**
    * Theme values.
    */
  var theme: ITheme = js.native
}

object IToggleStyleProps {
  @scala.inline
  def apply(theme: ITheme): IToggleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToggleStyleProps]
  }
  @scala.inline
  implicit class IToggleStylePropsOps[Self <: IToggleStyleProps] (val x: Self) extends AnyVal {
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
    def withInlineLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOffMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOffMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffMissing")(js.undefined)
        ret
    }
  }
  
}

