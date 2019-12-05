package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libIClassNamesMod.IClassNames
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typingsSlinky.officeDashUiDashFabricDashReact.Anon_Callback
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupFooterDotTypesMod.IGroupFooterProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod.IGroupHeaderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupShowAllDotTypesMod.IGroupShowAllProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroup
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupRenderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListSectionMod.IGroupedListSectionProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod.IListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupedListSection
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListSectionMod.GroupedListSection
    ] {
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupedListSection", "GroupedListSection")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: js.Array[_],
    onRenderCell: (js.UndefOr[Double], js.UndefOr[js.Any], js.UndefOr[Double]) => TagMod[Any],
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: () => Unit = null,
    dragDropEvents: IDragDropEvents = null,
    dragDropHelper: IDragDropHelper = null,
    eventsToRegister: js.Array[Anon_Callback] = null,
    footerProps: IGroupFooterProps = null,
    getGroupItemLimit: /* group */ IGroup => Double = null,
    group: IGroup = null,
    groupIndex: Int | Double = null,
    groupNestingDepth: Int | Double = null,
    groupProps: IGroupRenderProps = null,
    groupedListClassNames: IClassNames[IGroupedListStyles] = null,
    groups: js.Array[IGroup] = null,
    headerProps: IGroupHeaderProps = null,
    listProps: IListProps[_] = null,
    onRenderGroupFooter: (/* props */ js.UndefOr[IGroupFooterProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IGroupFooterProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onRenderGroupHeader: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IGroupHeaderProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onRenderGroupShowAll: (/* props */ js.UndefOr[IGroupShowAllProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IGroupShowAllProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onShouldVirtualize: /* props */ IListProps[_] => Boolean = null,
    selection: ISelection = null,
    selectionMode: SelectionMode = null,
    showAllProps: IGroupShowAllProps = null,
    viewport: IViewport = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListSectionMod.GroupedListSection
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRenderCell = js.Any.fromFunction3(onRenderCell))
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction0(componentRef))
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (eventsToRegister != null) __obj.updateDynamic("eventsToRegister")(eventsToRegister.asInstanceOf[js.Any])
    if (footerProps != null) __obj.updateDynamic("footerProps")(footerProps.asInstanceOf[js.Any])
    if (getGroupItemLimit != null) __obj.updateDynamic("getGroupItemLimit")(js.Any.fromFunction1(getGroupItemLimit))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupNestingDepth != null) __obj.updateDynamic("groupNestingDepth")(groupNestingDepth.asInstanceOf[js.Any])
    if (groupProps != null) __obj.updateDynamic("groupProps")(groupProps.asInstanceOf[js.Any])
    if (groupedListClassNames != null) __obj.updateDynamic("groupedListClassNames")(groupedListClassNames.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (headerProps != null) __obj.updateDynamic("headerProps")(headerProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (onRenderGroupFooter != null) __obj.updateDynamic("onRenderGroupFooter")(js.Any.fromFunction2(onRenderGroupFooter))
    if (onRenderGroupHeader != null) __obj.updateDynamic("onRenderGroupHeader")(js.Any.fromFunction2(onRenderGroupHeader))
    if (onRenderGroupShowAll != null) __obj.updateDynamic("onRenderGroupShowAll")(js.Any.fromFunction2(onRenderGroupShowAll))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1(onShouldVirtualize))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showAllProps != null) __obj.updateDynamic("showAllProps")(showAllProps.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IGroupedListSectionProps
}

