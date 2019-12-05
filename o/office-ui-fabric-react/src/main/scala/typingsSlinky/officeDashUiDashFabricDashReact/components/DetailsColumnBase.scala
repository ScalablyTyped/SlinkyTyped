package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.officeDashUiDashFabricDashReact.Anon_ItemIndex
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.ICellStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod.ITooltipHostProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod.IDragDropHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsColumnBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libDetailsListMod.DetailsColumnBase
    ] {
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsColumnBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    column: IColumn,
    columnIndex: Double,
    cellStyleProps: ICellStyleProps = null,
    componentRef: () => Unit = null,
    dragDropHelper: IDragDropHelper = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDropped: js.UndefOr[Boolean] = js.undefined,
    onColumnClick: (/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn) => Unit = null,
    onColumnContextMenu: (/* column */ IColumn, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[ITooltipHostProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ITooltipHostProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    parentId: String = null,
    setDraggedItemIndex: /* itemIndex */ Double => Unit = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null,
    theme: ITheme = null,
    updateDragInfo: (/* props */ Anon_ItemIndex, /* event */ js.UndefOr[MouseEvent]) => Unit = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libDetailsListMod.DetailsColumnBase
  ] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction0(componentRef))
    if (dragDropHelper != null) __obj.updateDynamic("dragDropHelper")(dragDropHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDropped)) __obj.updateDynamic("isDropped")(isDropped.asInstanceOf[js.Any])
    if (onColumnClick != null) __obj.updateDynamic("onColumnClick")(js.Any.fromFunction2(onColumnClick))
    if (onColumnContextMenu != null) __obj.updateDynamic("onColumnContextMenu")(js.Any.fromFunction2(onColumnContextMenu))
    if (onRenderColumnHeaderTooltip != null) __obj.updateDynamic("onRenderColumnHeaderTooltip")(js.Any.fromFunction2(onRenderColumnHeaderTooltip))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (setDraggedItemIndex != null) __obj.updateDynamic("setDraggedItemIndex")(js.Any.fromFunction1(setDraggedItemIndex))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (updateDragInfo != null) __obj.updateDynamic("updateDragInfo")(js.Any.fromFunction2(updateDragInfo))
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDetailsColumnProps
}

