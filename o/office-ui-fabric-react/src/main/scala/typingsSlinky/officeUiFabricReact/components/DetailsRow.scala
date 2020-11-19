package typingsSlinky.officeUiFabricReact.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.anon.EventName
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRow
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowStyleProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowStyles
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DetailsRow {
  
  @JSImport("office-ui-fabric-react", "DetailsRow")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def cellStyleProps(value: ICellStyleProps): this.type = set("cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkButtonAriaLabel(value: String): this.type = set("checkButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkboxCellClassName(value: String): this.type = set("checkboxCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkboxVisibility(value: CheckboxVisibility): this.type = set("checkboxVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapseAllVisibility(value: CollapseAllVisibility): this.type = set("collapseAllVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnsVarargs(value: IColumn*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def columns(value: js.Array[IColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDetailsRow | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDetailsRow]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IDetailsRow]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDropEvents(value: IDragDropEvents): this.type = set("dragDropEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragDropHelper(value: IDragDropHelper): this.type = set("dragDropHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableUpdateAnimations(value: Boolean): this.type = set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventsToRegisterVarargs(value: EventName*): this.type = set("eventsToRegister", js.Array(value :_*))
    
    @scala.inline
    def eventsToRegister(value: js.Array[EventName]): this.type = set("eventsToRegister", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): this.type = set("getCellValueKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def getRowAriaDescribedBy(value: /* item */ js.Any => String): this.type = set("getRowAriaDescribedBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def getRowAriaLabel(value: /* item */ js.Any => String): this.type = set("getRowAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def groupNestingDepth(value: Double): this.type = set("groupNestingDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDidMount(
      value: /* row */ js.UndefOr[typingsSlinky.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase] => Unit
    ): this.type = set("onDidMount", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderCheck(value: /* props */ IDetailsRowCheckProps => ReactElement): this.type = set("onRenderCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactElement
    ): this.type = set("onRenderItemColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def onWillUnmount(
      value: /* row */ js.UndefOr[typingsSlinky.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase] => Unit
    ): this.type = set("onWillUnmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowFieldsAsFunctionComponent(value: ReactComponentClass[IDetailsRowFieldsProps]): this.type = set("rowFieldsAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowFieldsAsComponentClass(value: ReactComponentClass[IDetailsRowFieldsProps]): this.type = set("rowFieldsAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowFieldsAs(value: ReactComponentClass[IDetailsRowFieldsProps]): this.type = set("rowFieldsAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowWidth(value: Double): this.type = set("rowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selection(value: ISelection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IDetailsRowStyleProps => DeepPartial[IDetailsRowStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useReducedRowRenderer(value: Boolean): this.type = set("useReducedRowRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewport(value: IViewport): this.type = set("viewport", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDetailsRowBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(item: js.Any, itemIndex: Double): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDetailsRowBaseProps]))
  }
}
