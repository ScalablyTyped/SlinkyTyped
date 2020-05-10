package typingsSlinky.officeUiFabricReact.groupedListTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupDividerProps extends js.Object {
  /** Custom className */
  var className: js.UndefOr[String] = js.native
  /** Boolean value to indicate if the component should render in compact mode. Set to false by default */
  var compact: js.UndefOr[Boolean] = js.native
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  /** Props for expand/collapse button
    * @deprecated Use {@link IGroupHeaderProps.expandButtonProps} instead.
    */
  var expandButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
  /** Text to display for the group footer. */
  var footerText: js.UndefOr[String] = js.native
  /** The group to be rendered by the header. */
  var group: js.UndefOr[IGroup] = js.native
  /** The index of the group. */
  var groupIndex: js.UndefOr[Double] = js.native
  /** The indent level of the group. */
  var groupLevel: js.UndefOr[Double] = js.native
  /** Stores parent group's children. */
  var groups: js.UndefOr[js.Array[IGroup]] = js.native
  /**
    * Width corresponding to a single level.
    * This is multiplied by the groupLevel to get the full spacer width for the group.
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /** Determines if the group selection check box is shown for collapsed groups. */
  var isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.native
  /** Callback to determine if a group has missing items and needs to load them from the server. */
  var isGroupLoading: js.UndefOr[js.Function1[/* group */ IGroup, Boolean]] = js.native
  /**
    * Deprecated at v.65.1 and will be removed by v 1.0. Use `selected` instead.
    * @deprecated Use `selected` instead.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /** Text shown on group headers to indicate the group is being loaded. */
  var loadingText: js.UndefOr[String] = js.native
  /** Callback for when the group header is clicked. */
  var onGroupHeaderClick: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  /** Override which allows the caller to provider a custom renderer for the GroupHeader title. */
  var onRenderTitle: js.UndefOr[IRenderFunction[IGroupHeaderProps]] = js.native
  /** Callback for when the group is expanded or collapsed. */
  var onToggleCollapse: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  /** Callback for when the group is selected. */
  var onToggleSelectGroup: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  /** Callback for when the group "Show All" link is clicked */
  var onToggleSummarize: js.UndefOr[js.Function1[/* group */ IGroup, Unit]] = js.native
  /** If all items in the group are selected. */
  var selected: js.UndefOr[Boolean] = js.native
  /** The selection mode of the list the group lives within. */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /** Text to display for the group "Show All" link. */
  var showAllLinkText: js.UndefOr[String] = js.native
  /** Theme provided by the Higher Order Component */
  var theme: js.UndefOr[ITheme] = js.native
  /** A reference to the viewport in which the header is rendered. */
  var viewport: js.UndefOr[IViewport] = js.native
}

object IGroupDividerProps {
  @scala.inline
  def apply(): IGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupDividerProps]
  }
  @scala.inline
  implicit class IGroupDividerPropsOps[Self <: IGroupDividerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerText")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: IGroup): Self = {
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
    def withGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[IGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCollapsedGroupSelectVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsedGroupSelectVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollapsedGroupSelectVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsedGroupSelectVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGroupLoading(value: /* group */ IGroup => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsGroupLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupLoading")(js.undefined)
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
    def withLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGroupHeaderClick(value: /* group */ IGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupHeaderClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGroupHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupHeaderClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderTitle(
      value: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleCollapse(value: /* group */ IGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggleCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleSelectGroup(value: /* group */ IGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleSelectGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggleSelectGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleSelectGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggleSummarize(value: /* group */ IGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleSummarize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggleSummarize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggleSummarize")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllLinkText")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: IViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

