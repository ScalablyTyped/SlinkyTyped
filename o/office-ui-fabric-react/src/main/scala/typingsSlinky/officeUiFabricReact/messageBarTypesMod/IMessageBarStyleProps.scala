package typingsSlinky.officeUiFabricReact.messageBarTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBarStyleProps extends js.Object {
  /**
    * Whether the MessageBar contains any action elements.
    */
  var actions: js.UndefOr[Boolean] = js.native
  /**
    * Additional CSS class(es).
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether the single line MessageBar is being expanded.
    */
  var expandSingleLine: js.UndefOr[Boolean] = js.native
  /**
    * Whether the MessageBar is rendered in multi line (as opposed to single line) mode.
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /**
    * Type of the MessageBar.
    */
  var messageBarType: js.UndefOr[MessageBarType] = js.native
  /**
    * Whether the MessageBar contains a dismiss button.
    */
  var onDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme = js.native
  /**
    * Whether the text is truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.native
}

object IMessageBarStyleProps {
  @scala.inline
  def apply(theme: ITheme): IMessageBarStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBarStyleProps]
  }
  @scala.inline
  implicit class IMessageBarStylePropsOps[Self <: IMessageBarStyleProps] (val x: Self) extends AnyVal {
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
    def withActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
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
    def withExpandSingleLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSingleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandSingleLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSingleLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBarType(value: MessageBarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBarType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBarType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(js.undefined)
        ret
    }
  }
  
}

