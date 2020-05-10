package typingsSlinky.officeUiFabricReact.messageBarTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBarStyles extends js.Object {
  /**
    * Style set for the optional element containing the action elements.
    */
  var actions: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the element containing the icon, text, and optional dismiss button.
    */
  var content: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the element containing the dismiss button.
    */
  var dismissSingleLine: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the optional dismiss button.
    */
  var dismissal: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the icon used to expand and collapse the MessageBar.
    */
  var expand: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the element containing the expand icon.
    */
  var expandSingleLine: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the icon.
    */
  var icon: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the element containing the icon.
    */
  var iconContainer: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the text.
    */
  var innerText: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the element containing the text.
    */
  var text: js.UndefOr[IStyle] = js.native
}

object IMessageBarStyles {
  @scala.inline
  def apply(): IMessageBarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBarStyles]
  }
  @scala.inline
  implicit class IMessageBarStylesOps[Self <: IMessageBarStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: IStyle): Self = {
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
    def withActionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(null)
        ret
    }
    @scala.inline
    def withContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(null)
        ret
    }
    @scala.inline
    def withDismissSingleLine(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissSingleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissSingleLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissSingleLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissSingleLineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissSingleLine")(null)
        ret
    }
    @scala.inline
    def withDismissal(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal")(null)
        ret
    }
    @scala.inline
    def withExpand(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(null)
        ret
    }
    @scala.inline
    def withExpandSingleLine(value: IStyle): Self = {
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
    def withExpandSingleLineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSingleLine")(null)
        ret
    }
    @scala.inline
    def withIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIconContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainer")(null)
        ret
    }
    @scala.inline
    def withInnerText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

