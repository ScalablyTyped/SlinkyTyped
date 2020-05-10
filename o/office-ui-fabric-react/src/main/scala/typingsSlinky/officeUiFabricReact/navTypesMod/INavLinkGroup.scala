package typingsSlinky.officeUiFabricReact.navTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavLinkGroup extends js.Object {
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.native
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var collapseAriaLabel: js.UndefOr[String] = js.native
  /**
    * If true, the group should render collapsed by default
    */
  var collapseByDefault: js.UndefOr[Boolean] = js.native
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var expandAriaLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) Any additional properties to apply to a group.
    */
  var groupData: js.UndefOr[js.Any] = js.native
  /**
    * Links to render within this group
    */
  var links: js.Array[INavLink] = js.native
  /**
    * Text to render as the header of a group
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback invoked when a group header is clicked
    */
  var onHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* isCollapsing */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
}

object INavLinkGroup {
  @scala.inline
  def apply(links: js.Array[INavLink]): INavLinkGroup = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavLinkGroup]
  }
  @scala.inline
  implicit class INavLinkGroupOps[Self <: INavLinkGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[INavLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupData")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* isCollapsing */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderClick")(js.undefined)
        ret
    }
  }
  
}

