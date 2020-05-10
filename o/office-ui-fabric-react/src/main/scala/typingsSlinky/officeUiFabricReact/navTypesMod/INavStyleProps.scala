package typingsSlinky.officeUiFabricReact.navTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Inherited from INavProps
    * A collection of link groups to display in the navigation bar
    */
  var groups: js.Array[INavLinkGroup] | Null = js.native
  /**
    * is button
    */
  var isButtonEntry: js.UndefOr[Boolean] = js.native
  /**
    * is element disabled
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * is element expanded boolean
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
    * is element a group boolean
    */
  var isGroup: js.UndefOr[Boolean] = js.native
  /**
    * is element a link boolean
    */
  var isLink: js.UndefOr[Boolean] = js.native
  /**
    * is element on top boolean
    */
  var isOnTop: js.UndefOr[Boolean] = js.native
  /**
    * is element selected boolean
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * left padding value
    */
  var leftPadding: js.UndefOr[Double] = js.native
  /**
    * left padding when expanded value
    */
  var leftPaddingExpanded: js.UndefOr[Double] = js.native
  /**
    * Nav height value
    */
  var navHeight: js.UndefOr[Double] = js.native
  /**
    * position value
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * right padding value
    */
  var rightPadding: js.UndefOr[Double] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object INavStyleProps {
  @scala.inline
  def apply(theme: ITheme): INavStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavStyleProps]
  }
  @scala.inline
  implicit class INavStylePropsOps[Self <: INavStyleProps] (val x: Self) extends AnyVal {
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
    def withGroups(value: js.Array[INavLinkGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(null)
        ret
    }
    @scala.inline
    def withIsButtonEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButtonEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsButtonEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButtonEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftPaddingExpanded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPaddingExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftPaddingExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPaddingExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withNavHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRightPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPadding")(js.undefined)
        ret
    }
  }
  
}

