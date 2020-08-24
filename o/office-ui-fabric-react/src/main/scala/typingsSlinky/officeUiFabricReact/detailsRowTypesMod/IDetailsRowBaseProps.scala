package typingsSlinky.officeUiFabricReact.detailsRowTypesMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.anon.EventName
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowBaseMod.DetailsRowBase
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsCheckboxProps
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropEvents
import typingsSlinky.officeUiFabricReact.dragdropInterfacesMod.IDragDropHelper
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility
import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsList.types.IDetailsListProps, 'onRenderItemColumn' | 'getCellValueKey'> */
/* Inlined parent office-ui-fabric-react.office-ui-fabric-react/lib/Utilities.IBaseProps<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRow> */
/* Inlined parent office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsItemProps */
@js.native
trait IDetailsRowBaseProps extends js.Object {
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  /**
    * Optional pre-rendered content per column. Preferred over onRender or onRenderItemColumn if provided.
    */
  var cellsByColumn: js.UndefOr[StringDictionary[ReactElement]] = js.native
  /**
    * Check button's aria label
    */
  var checkButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * Class name for the checkbox cell
    */
  var checkboxCellClassName: js.UndefOr[String] = js.native
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  /**
    * Overriding class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Collapse all visibility
    */
  var collapseAllVisibility: js.UndefOr[CollapseAllVisibility] = js.native
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  /**
    * Whether to render in compact mode
    */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Ref of the component
    */
  var componentRef: js.UndefOr[IRefObject[IDetailsRow]] = js.native
  /**
    * Handling drag and drop events
    */
  var dragDropEvents: js.UndefOr[IDragDropEvents] = js.native
  /**
    * Helper for the drag and drop
    */
  var dragDropHelper: js.UndefOr[IDragDropHelper] = js.native
  /** Whether to animate updates */
  var enableUpdateAnimations: js.UndefOr[Boolean] = js.native
  /**
    * A list of events to register
    */
  var eventsToRegister: js.UndefOr[js.Array[EventName]] = js.native
  var getCellValueKey: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      String
    ]
  ] = js.native
  /**
    * Callback for getting the row aria-describedby
    */
  var getRowAriaDescribedBy: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  /**
    * Callback for getting the row aria label
    */
  var getRowAriaLabel: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.native
  /**
    * How much to indent
    */
  var indentWidth: js.UndefOr[Double] = js.native
  /**
    * Data source for this component
    */
  var item: js.Any = js.native
  /**
    * Index of the collection of items of the DetailsList
    */
  var itemIndex: Double = js.native
  /**
    * Callback for did mount for parent
    */
  var onDidMount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.native
  /**
    * Callback for rendering a checkbox
    */
  var onRenderCheck: js.UndefOr[js.Function1[/* props */ IDetailsRowCheckProps, ReactElement]] = js.native
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.native
  var onRenderItemColumn: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* column */ js.UndefOr[IColumn], 
      ReactElement
    ]
  ] = js.native
  /**
    * Callback for will mount for parent
    */
  var onWillUnmount: js.UndefOr[js.Function1[/* row */ js.UndefOr[DetailsRowBase], Unit]] = js.native
  /**
    * DOM element into which to render row field
    */
  var rowFieldsAs: js.UndefOr[ReactComponentClass[IDetailsRowFieldsProps]] = js.native
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.native
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
  /**
    * Selection mode
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /**
    * Overriding styles to this row
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]] = js.native
  /**
    * Theme provided by styled() function
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.native
  /**
    * Rerender DetailsRow only when props changed. Might cause regression when depending on external updates.
    * @defaultvalue false
    */
  var useReducedRowRenderer: js.UndefOr[Boolean] = js.native
  /**
    * View port of the virtualized list
    *
    * @deprecated use rowWidth instead
    */
  var viewport: js.UndefOr[IViewport] = js.native
}

object IDetailsRowBaseProps {
  @scala.inline
  def apply(item: js.Any, itemIndex: Double): IDetailsRowBaseProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowBaseProps]
  }
  @scala.inline
  implicit class IDetailsRowBasePropsOps[Self <: IDetailsRowBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = this.set("cellStyleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellStyleProps: Self = this.set("cellStyleProps", js.undefined)
    @scala.inline
    def setCellsByColumn(value: StringDictionary[ReactElement]): Self = this.set("cellsByColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellsByColumn: Self = this.set("cellsByColumn", js.undefined)
    @scala.inline
    def setCheckButtonAriaLabel(value: String): Self = this.set("checkButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckButtonAriaLabel: Self = this.set("checkButtonAriaLabel", js.undefined)
    @scala.inline
    def setCheckboxCellClassName(value: String): Self = this.set("checkboxCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxCellClassName: Self = this.set("checkboxCellClassName", js.undefined)
    @scala.inline
    def setCheckboxVisibility(value: CheckboxVisibility): Self = this.set("checkboxVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxVisibility: Self = this.set("checkboxVisibility", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollapseAllVisibility(value: CollapseAllVisibility): Self = this.set("collapseAllVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseAllVisibility: Self = this.set("collapseAllVisibility", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDetailsRow | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IDetailsRow]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentRef(value: IRefObject[IDetailsRow]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDragDropEvents(value: IDragDropEvents): Self = this.set("dragDropEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragDropEvents: Self = this.set("dragDropEvents", js.undefined)
    @scala.inline
    def setDragDropHelper(value: IDragDropHelper): Self = this.set("dragDropHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragDropHelper: Self = this.set("dragDropHelper", js.undefined)
    @scala.inline
    def setEnableUpdateAnimations(value: Boolean): Self = this.set("enableUpdateAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUpdateAnimations: Self = this.set("enableUpdateAnimations", js.undefined)
    @scala.inline
    def setEventsToRegisterVarargs(value: EventName*): Self = this.set("eventsToRegister", js.Array(value :_*))
    @scala.inline
    def setEventsToRegister(value: js.Array[EventName]): Self = this.set("eventsToRegister", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsToRegister: Self = this.set("eventsToRegister", js.undefined)
    @scala.inline
    def setGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = this.set("getCellValueKey", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetCellValueKey: Self = this.set("getCellValueKey", js.undefined)
    @scala.inline
    def setGetRowAriaDescribedBy(value: /* item */ js.Any => String): Self = this.set("getRowAriaDescribedBy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRowAriaDescribedBy: Self = this.set("getRowAriaDescribedBy", js.undefined)
    @scala.inline
    def setGetRowAriaLabel(value: /* item */ js.Any => String): Self = this.set("getRowAriaLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRowAriaLabel: Self = this.set("getRowAriaLabel", js.undefined)
    @scala.inline
    def setGroupNestingDepth(value: Double): Self = this.set("groupNestingDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupNestingDepth: Self = this.set("groupNestingDepth", js.undefined)
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    @scala.inline
    def setOnDidMount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = this.set("onDidMount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidMount: Self = this.set("onDidMount", js.undefined)
    @scala.inline
    def setOnRenderCheck(value: /* props */ IDetailsRowCheckProps => ReactElement): Self = this.set("onRenderCheck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRenderCheck: Self = this.set("onRenderCheck", js.undefined)
    @scala.inline
    def setOnRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = this.set("onRenderDetailsCheckbox", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderDetailsCheckbox: Self = this.set("onRenderDetailsCheckbox", js.undefined)
    @scala.inline
    def setOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => ReactElement
    ): Self = this.set("onRenderItemColumn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnRenderItemColumn: Self = this.set("onRenderItemColumn", js.undefined)
    @scala.inline
    def setOnWillUnmount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = this.set("onWillUnmount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillUnmount: Self = this.set("onWillUnmount", js.undefined)
    @scala.inline
    def setRowFieldsAsFunctionComponent(value: ReactComponentClass[IDetailsRowFieldsProps]): Self = this.set("rowFieldsAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowFieldsAsComponentClass(value: ReactComponentClass[IDetailsRowFieldsProps]): Self = this.set("rowFieldsAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowFieldsAs(value: ReactComponentClass[IDetailsRowFieldsProps]): Self = this.set("rowFieldsAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowFieldsAs: Self = this.set("rowFieldsAs", js.undefined)
    @scala.inline
    def setRowWidth(value: Double): Self = this.set("rowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowWidth: Self = this.set("rowWidth", js.undefined)
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDetailsRowStyleProps => DeepPartial[IDetailsRowStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUseFastIcons(value: Boolean): Self = this.set("useFastIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFastIcons: Self = this.set("useFastIcons", js.undefined)
    @scala.inline
    def setUseReducedRowRenderer(value: Boolean): Self = this.set("useReducedRowRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseReducedRowRenderer: Self = this.set("useReducedRowRenderer", js.undefined)
    @scala.inline
    def setViewport(value: IViewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

