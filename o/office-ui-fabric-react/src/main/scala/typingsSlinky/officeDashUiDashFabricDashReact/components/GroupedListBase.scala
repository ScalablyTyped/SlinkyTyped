package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typingsSlinky.officeDashUiDashFabricDashReact.Anon_Callback
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroup
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupRenderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedList
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroupedListStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod.IListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupedListBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libGroupedListMod.GroupedListBase
    ] {
  @JSImport("office-ui-fabric-react/lib/GroupedList", "GroupedListBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    items: js.Array[_],
    onRenderCell: (js.UndefOr[Double], js.UndefOr[js.Any], js.UndefOr[Double]) => TagMod[Any],
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IGroupedList] = null,
    dragDropEvents: IDragDropEvents = null,
    dragDropHelper: IDragDropHelper = null,
    eventsToRegister: js.Array[Anon_Callback] = null,
    getGroupHeight: (/* group */ IGroup, /* groupIndex */ Double) => Double = null,
    groupProps: IGroupRenderProps = null,
    groups: js.Array[IGroup] = null,
    listProps: IListProps[_] = null,
    onGroupExpandStateChanged: /* isSomeGroupExpanded */ Boolean => Unit = null,
    onShouldVirtualize: /* props */ IListProps[_] => Boolean = null,
    selection: ISelection = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles] = null,
    theme: ITheme = null,
    usePageCache: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libGroupedListMod.GroupedListBase
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRenderCell = js.Any.fromFunction3(onRenderCell))
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dragDropEvents != null) __obj.updateDynamic("dragDropEvents")(dragDropEvents.asInstanceOf[js.Any])
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (eventsToRegister != null) __obj.updateDynamic("eventsToRegister")(eventsToRegister.asInstanceOf[js.Any])
    if (getGroupHeight != null) __obj.updateDynamic("getGroupHeight")(js.Any.fromFunction2(getGroupHeight))
    if (groupProps != null) __obj.updateDynamic("groupProps")(groupProps.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (onGroupExpandStateChanged != null) __obj.updateDynamic("onGroupExpandStateChanged")(js.Any.fromFunction1(onGroupExpandStateChanged))
    if (onShouldVirtualize != null) __obj.updateDynamic("onShouldVirtualize")(js.Any.fromFunction1(onShouldVirtualize))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(usePageCache)) __obj.updateDynamic("usePageCache")(usePageCache.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IGroupedListProps
}

