package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.AnonCallback
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroup
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedList
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListStyleProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupedListStyles
import typingsSlinky.officeUiFabricReact.listTypesMod.IListProps
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupedList
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react", "GroupedList")
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
    eventsToRegister: js.Array[AnonCallback] = null,
    getGroupHeight: (/* group */ IGroup, /* groupIndex */ Double) => Double = null,
    groupProps: IGroupRenderProps = null,
    groups: js.Array[IGroup] = null,
    listProps: IListProps[_] = null,
    onGroupExpandStateChanged: /* isSomeGroupExpanded */ Boolean => Unit = null,
    onShouldVirtualize: /* props */ IListProps[_] => Boolean = null,
    selection: ISelection[IObjectWithKey] = null,
    selectionMode: SelectionMode = null,
    styles: IStyleFunctionOrObject[IGroupedListStyleProps, IGroupedListStyles] = null,
    theme: ITheme = null,
    usePageCache: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
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

