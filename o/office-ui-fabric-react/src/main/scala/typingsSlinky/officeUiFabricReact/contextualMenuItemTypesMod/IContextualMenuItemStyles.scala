package typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemStyles extends IButtonStyles {
  /**
    * Styles for a menu item that is an anchor link.
    */
  var anchorLink: IStyle = js.native
  /**
    * Default style for checkmark icons.
    */
  var checkmarkIcon: IStyle = js.native
  /**
    * Styles for a divider item of a ContextualMenu.
    */
  var divider: IStyle = js.native
  /**
    * Default icon color style for known icons.
    */
  var iconColor: IStyle = js.native
  /**
    * Styles for the icon element of a menu item.
    */
  @JSName("icon")
  var icon_IContextualMenuItemStyles: IStyle = js.native
  /**
    * Styles for a menu item that is an anchor link.
    */
  var item: IStyle = js.native
  /**
    * Styles for the label of a menu item.
    */
  @JSName("label")
  var label_IContextualMenuItemStyles: IStyle = js.native
  /**
    * Styles for the content inside the button/link of the menuItem.
    */
  var linkContent: IStyle = js.native
  /**
    * Styles for a menu item that is a link.
    */
  var linkContentMenu: IStyle = js.native
  /**
    * Style for the root element.
    */
  @JSName("root")
  var root_IContextualMenuItemStyles: IStyle = js.native
  /**
    * Styles for the secondary text of a menu item.
    */
  @JSName("secondaryText")
  var secondaryText_IContextualMenuItemStyles: IStyle = js.native
  /**
    * Styles for the container of a split menu item.
    */
  var splitContainer: IStyle = js.native
  /**
    * Styles for the menu portion of a split menu item.
    */
  var splitMenu: IStyle = js.native
  /**
    * Styles for the primary portion of a split menu item.
    */
  var splitPrimary: IStyle = js.native
  /**
    * Styles for the submenu icon of a menu item.
    */
  var subMenuIcon: IStyle = js.native
}

object IContextualMenuItemStyles {
  @scala.inline
  def apply(): IContextualMenuItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualMenuItemStyles]
  }
  @scala.inline
  implicit class IContextualMenuItemStylesOps[Self <: IContextualMenuItemStyles] (val x: Self) extends AnyVal {
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
    def withLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(null)
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
    def withLinkContentMenu(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkContentMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContentMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkContentMenuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContentMenu")(null)
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
    def withSecondaryText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(null)
        ret
    }
    @scala.inline
    def withSplitContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitContainer")(null)
        ret
    }
    @scala.inline
    def withSplitMenu(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitMenuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitMenu")(null)
        ret
    }
    @scala.inline
    def withSplitPrimary(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitPrimaryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPrimary")(null)
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

