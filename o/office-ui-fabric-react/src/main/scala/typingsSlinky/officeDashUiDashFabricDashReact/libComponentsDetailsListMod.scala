package typingsSlinky.officeDashUiDashFabricDashReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atUifabricUtilities.libSelectionSelectionMod.ISelectionOptions
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotTypesMod.IDetailsColumnProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod.IDetailsRowCheckProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowBaseProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowFieldsDotTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneState
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList", JSImport.Namespace)
@js.native
object libComponentsDetailsListMod extends js.Object {
  @js.native
  class DetailsColumnBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsColumnDotBaseMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @js.native
  class DetailsHeaderBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotBaseMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  
  @js.native
  class DetailsListBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotBaseMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  
  @js.native
  class DetailsRowBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotBaseMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  
  @js.native
  class Selection ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectionMod.Selection {
    def this(options: ISelectionOptions) = this()
  }
  
  @js.native
  class SelectionZone protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesSelectionMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  
  val DetailsHeader: ReactComponentClass[IDetailsHeaderBaseProps] = js.native
  val DetailsList: ReactComponentClass[IDetailsListProps] = js.native
  val DetailsRow: ReactComponentClass[IDetailsRowBaseProps] = js.native
  val DetailsRowCheck: ReactComponentClass[IDetailsRowCheckProps] = js.native
  val DetailsRowFields: ReactComponentClass[IDetailsRowFieldsProps] = js.native
  val SELECTION_CHANGE: change = js.native
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ SyntheticMouseEvent[HTMLElement], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = js.native
  @js.native
  object CheckboxVisibility extends js.Object {
    /* 1 */ val always: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.always with Double = js.native
    /* 2 */ val hidden: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.hidden with Double = js.native
    /* 0 */ val onHover: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility.onHover with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.CheckboxVisibility with Double
      ] = js.native
  }
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object ColumnActionsMode extends js.Object {
    /* 1 */ val clickable: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.clickable with Double = js.native
    /* 0 */ val disabled: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.disabled with Double = js.native
    /* 2 */ val hasDropdown: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnActionsMode with Double
      ] = js.native
  }
  
  @js.native
  object ColumnDragEndLocation extends js.Object {
    /* 2 */ val header: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.header with Double = js.native
    /* 0 */ val outside: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.outside with Double = js.native
    /* 1 */ val surface: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation.surface with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ColumnDragEndLocation with Double
      ] = js.native
  }
  
  @js.native
  object ConstrainMode extends js.Object {
    /* 1 */ val horizontalConstrained: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    /* 0 */ val unconstrained: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode.unconstrained with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.ConstrainMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object DetailsHeaderBase extends js.Object {
    var defaultProps: Anon_CollapseAllVisibility = js.native
  }
  
  /* static members */
  @js.native
  object DetailsListBase extends js.Object {
    var defaultProps: Anon_CheckboxVisibility = js.native
  }
  
  @js.native
  object DetailsListLayoutMode extends js.Object {
    /* 0 */ val fixedColumns: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    /* 1 */ val justified: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode.justified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.DetailsListLayoutMode with Double
      ] = js.native
  }
  
  @js.native
  object DetailsRowGlobalClassNames extends js.Object {
    var cell: String = js.native
    var cellAnimation: String = js.native
    var cellCheck: String = js.native
    var cellMeasurer: String = js.native
    var check: String = js.native
    var compact: String = js.native
    var fields: String = js.native
    var isCheckVisible: String = js.native
    var isContentUnselectable: String = js.native
    var isRowHeader: String = js.native
    var isSelected: String = js.native
    var listCellFirstChild: String = js.native
    var root: String = js.native
  }
  
  @js.native
  object SelectAllVisibility extends js.Object {
    /* 1 */ val hidden: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.hidden with Double = js.native
    /* 0 */ val none: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.none with Double = js.native
    /* 2 */ val visible: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsHeaderDotTypesMod.SelectAllVisibility with Double
      ] = js.native
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionDirection with Double
      ] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    var defaultProps: Anon_IsSelectedOnFocus = js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
}

