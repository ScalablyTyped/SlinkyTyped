package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuItemStyles extends IButtonStyles {
  /**
    * Styles for a menu item that is an anchor link.
    */
  var anchorLink: IStyle = js.native
  /**
    * Default style for checkmark icons.
    */
  var checkmarkIcon: IStyle = js.native
  /**
    * Styles for a divider item of a ConextualMenu.
    */
  var divider: IStyle = js.native
  /**
    * Default icon color style for known icons.
    */
  var iconColor: IStyle = js.native
  /**
    * Styles for a menu item that is an anchor link.
    */
  var item: IStyle = js.native
  /**
    * Styles for the content inside the button/link of the menuItem.
    */
  var linkContent: IStyle = js.native
  /**
    * Styles for the submenu icon of a menu item.
    */
  var subMenuIcon: IStyle = js.native
}

object IMenuItemStyles {
  @scala.inline
  def apply(): IMenuItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItemStyles]
  }
  @scala.inline
  implicit class IMenuItemStylesOps[Self <: IMenuItemStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorLink(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorLink")(null)
        ret
    }
    @scala.inline
    def withCheckmarkIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmarkIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckmarkIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmarkIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckmarkIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmarkIcon")(null)
        ret
    }
    @scala.inline
    def withDivider(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withDividerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(null)
        ret
    }
    @scala.inline
    def withIconColor(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(null)
        ret
    }
    @scala.inline
    def withItem(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withItemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(null)
        ret
    }
    @scala.inline
    def withLinkContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContent")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContent")(null)
        ret
    }
    @scala.inline
    def withSubMenuIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuIcon")(null)
        ret
    }
  }
  
}

