package typingsSlinky.officeUiFabricReact.detailsRowTypesMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.AnonEventName
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
import typingsSlinky.std.Partial
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
  var cellsByColumn: js.UndefOr[StringDictionary[TagMod[Any]]] = js.native
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
  var eventsToRegister: js.UndefOr[js.Array[AnonEventName]] = js.native
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
      TagMod[Any]
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
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellStyleProps(value: ICellStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellStyleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellStyleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCellsByColumn(value: StringDictionary[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellsByColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellsByColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxVisibility(value: CheckboxVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(js.undefined)
        ret
    }
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
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
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
    def withComponentRefFunction1(value: /* ref */ IDetailsRow | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IDetailsRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IDetailsRow]): Self = {
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
    def withDragDropEvents(value: IDragDropEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDropEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDropHelper(value: IDragDropHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDropHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUpdateAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUpdateAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUpdateAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsToRegister(value: js.Array[AnonEventName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsToRegister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsToRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsToRegister")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellValueKey(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValueKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetCellValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowAriaDescribedBy(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaDescribedBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowAriaLabel(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRowAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNestingDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNestingDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupNestingDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupNestingDepth")(js.undefined)
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
    def withOnDidMount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidMount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCheck(value: /* props */ IDetailsRowCheckProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderDetailsCheckbox(
      value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderDetailsCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderDetailsCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderItemColumn(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRenderItemColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderItemColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWillUnmount(value: /* row */ js.UndefOr[DetailsRowBase] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillUnmount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWillUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWillUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFieldsAsFunctionComponent(value: ReactComponentClass[IDetailsRowFieldsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFieldsAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFieldsAsComponentClass(value: ReactComponentClass[IDetailsRowFieldsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFieldsAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFieldsAs(value: ReactComponentClass[IDetailsRowFieldsProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFieldsAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFieldsAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFieldsAs")(js.undefined)
        ret
    }
    @scala.inline
    def withRowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: ISelection[IObjectWithKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
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
    def withStylesFunction1(value: IDetailsRowStyleProps => Partial[IDetailsRowStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDetailsRowStyleProps, IDetailsRowStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
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
    def withUseFastIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFastIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withUseReducedRowRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useReducedRowRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseReducedRowRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useReducedRowRenderer")(js.undefined)
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

