package typingsSlinky.officeUiFabricReact.groupedListTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupRenderProps extends js.Object {
  /**
    * Flag to indicate whether to ignore the collapsing icon on header.
    * @defaultvalue CollapseAllVisibility.visible
    */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.native
  /** Information to pass in to the group footer. */
  var footerProps: js.UndefOr[IGroupFooterProps] = js.native
  /** Grouping item limit. */
  var getGroupItemLimit: js.UndefOr[js.Function1[/* group */ IGroup, Double]] = js.native
  /** Information to pass in to the group header. */
  var headerProps: js.UndefOr[IGroupHeaderProps] = js.native
  /** Boolean indicating if all groups are in collapsed state. */
  var isAllGroupsCollapsed: js.UndefOr[Boolean] = js.native
  /**
    * Override which allows the caller to provide a custom footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IGroupFooterProps]] = js.native
  /**
    * Override which allows the caller to provide a custom header.
    */
  var onRenderHeader: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
  /**
    * Override which allows the caller to provide a custom Show All link.
    */
  var onRenderShowAll: js.UndefOr[IRenderFunction[IGroupShowAllProps]] = js.native
  /** Callback for when all groups are expanded or collapsed. */
  var onToggleCollapseAll: js.UndefOr[js.Function1[/* isAllCollapsed */ Boolean, Unit]] = js.native
  /**
    * Override which allows the caller to provide a custom aria role
    */
  var role: js.UndefOr[String] = js.native
  /** Information to pass in to the group Show all footer. */
  var showAllProps: js.UndefOr[IGroupShowAllProps] = js.native
  /**
    * Boolean indicating if empty groups are shown
    * @defaultvalue false
    */
  var showEmptyGroups: js.UndefOr[Boolean] = js.native
}

object IGroupRenderProps {
  @scala.inline
  def apply(): IGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupRenderProps]
  }
  @scala.inline
  implicit class IGroupRenderPropsOps[Self <: IGroupRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseAllVisibility(value: CollapseAllVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAllVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseAllVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAllVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterProps(value: IGroupFooterProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroupItemLimit(value: /* group */ IGroup => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupItemLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroupItemLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupItemLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderProps(value: IGroupHeaderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAllGroupsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllGroupsCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllGroupsCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllGroupsCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderFooter(
      value: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupFooterProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderHeader(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderShowAll(
      value: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupShowAllProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderShowAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderShowAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderShowAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleCollapseAll(value: /* isAllCollapsed */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleCollapseAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggleCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleCollapseAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllProps(value: IGroupShowAllProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllProps")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptyGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptyGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyGroups")(js.undefined)
        ret
    }
  }
  
}

