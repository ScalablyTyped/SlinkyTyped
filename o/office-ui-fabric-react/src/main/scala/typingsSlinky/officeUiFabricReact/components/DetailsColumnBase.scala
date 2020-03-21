package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.AnonItemIndex
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnRenderTooltipProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyleProps
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnStyles
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsColumnBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.DetailsColumnBase] {
  @JSImport("office-ui-fabric-react", "DetailsColumnBase")
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
    onRenderColumnHeaderTooltip: (/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IDetailsColumnRenderTooltipProps], ReactElement | Null]
    ]) => ReactElement | Null = null,
    parentId: String = null,
    setDraggedItemIndex: /* itemIndex */ Double => Unit = null,
    styles: IStyleFunctionOrObject[IDetailsColumnStyleProps, IDetailsColumnStyles] = null,
    theme: ITheme = null,
    updateDragInfo: (/* props */ AnonItemIndex, /* event */ js.UndefOr[MouseEvent]) => Unit = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.DetailsColumnBase] = {
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

