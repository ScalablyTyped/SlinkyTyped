package typingsSlinky.officeUiFabricReact.navTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavStyles extends js.Object {
  /**
    * Style set for the chevron button inside the composite
    * link and group elements.
    */
  var chevronButton: IStyle = js.native
  /**
    * Style set for the chevron icon inside the composite
    * link and group elements.
    */
  var chevronIcon: IStyle = js.native
  /**
    * Style set for the composite link container div element
    */
  var compositeLink: IStyle = js.native
  /**
    * Style set for the group root div.
    */
  var group: IStyle = js.native
  /**
    * Style set for the group content div inside group.
    */
  var groupContent: IStyle = js.native
  /**
    * Style set for the link element extending the
    * root style set for ActionButton component.
    */
  var link: IStyle = js.native
  /**
    * Style set for the link text container div element.
    */
  var linkText: IStyle = js.native
  /**
    * Style set for the nav links li element.
    */
  var navItem: IStyle = js.native
  /**
    * Style set for the nav links ul element.
    */
  var navItems: IStyle = js.native
  /**
    * Style set for the root element.
    */
  var root: IStyle = js.native
}

object INavStyles {
  @scala.inline
  def apply(): INavStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavStyles]
  }
  @scala.inline
  implicit class INavStylesOps[Self <: INavStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChevronButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChevronButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronButton")(js.undefined)
        ret
    }
    @scala.inline
    def withChevronButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronButton")(null)
        ret
    }
    @scala.inline
    def withChevronIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChevronIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withChevronIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronIcon")(null)
        ret
    }
    @scala.inline
    def withCompositeLink(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCompositeLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeLink")(null)
        ret
    }
    @scala.inline
    def withGroup(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(null)
        ret
    }
    @scala.inline
    def withGroupContent(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContent")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContent")(null)
        ret
    }
    @scala.inline
    def withLink(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(null)
        ret
    }
    @scala.inline
    def withLinkText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkText")(null)
        ret
    }
    @scala.inline
    def withNavItem(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItem")(js.undefined)
        ret
    }
    @scala.inline
    def withNavItemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItem")(null)
        ret
    }
    @scala.inline
    def withNavItems(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNavItemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navItems")(null)
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
  }
  
}

