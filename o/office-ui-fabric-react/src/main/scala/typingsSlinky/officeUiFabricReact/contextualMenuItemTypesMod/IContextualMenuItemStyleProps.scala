package typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemStyleProps extends js.Object {
  /**
    * Whether or not the menu item is checked.
    */
  var checked: Boolean = js.native
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether or not the menu item is disabled.
    */
  var disabled: Boolean = js.native
  /**
    * The optional class name to apply to the divider element.
    */
  var dividerClassName: js.UndefOr[String] = js.native
  /**
    * Whether or not the menu item is expanded.
    */
  var expanded: Boolean = js.native
  /**
    * The optional class name to apply to the icon element.
    */
  var iconClassName: js.UndefOr[String] = js.native
  /**
    * Indicates if a menu item is an anchor link.
    */
  var isAnchorLink: Boolean = js.native
  /**
    * The optional class name to apply to the item element.
    */
  var itemClassName: js.UndefOr[String] = js.native
  /**
    * Indicates if the icon used is of the known set of icons.
    */
  var knownIcon: Boolean = js.native
  /**
    * Whether or not the primary section of a split menu item is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The optional class name to apply to the sub-menu if present.
    */
  var subMenuClassName: js.UndefOr[String] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}

object IContextualMenuItemStyleProps {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    expanded: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    theme: ITheme
  ): IContextualMenuItemStyleProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isAnchorLink = isAnchorLink.asInstanceOf[js.Any], knownIcon = knownIcon.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemStyleProps]
  }
  @scala.inline
  implicit class IContextualMenuItemStylePropsOps[Self <: IContextualMenuItemStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAnchorLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnchorLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnownIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownIcon")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDividerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDividerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSubMenuClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuClassName")(js.undefined)
        ret
    }
  }
  
}

