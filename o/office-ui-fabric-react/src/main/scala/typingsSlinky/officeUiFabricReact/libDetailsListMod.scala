package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.anon.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.anon.CollapseAllVisibility
import typingsSlinky.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/DetailsList", JSImport.Namespace)
@js.native
object libDetailsListMod extends js.Object {
  
  val DetailsHeader: ReactComponentClass[IDetailsHeaderBaseProps] = js.native
  
  val DetailsList: ReactComponentClass[IDetailsListProps] = js.native
  
  val DetailsRow: ReactComponentClass[IDetailsRowBaseProps] = js.native
  
  val DetailsRowCheck: ReactComponentClass[IDetailsRowCheckProps] = js.native
  
  val DetailsRowFields: ReactComponentClass[IDetailsRowFieldsProps] = js.native
  
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility with Double
      ] = js.native
    
    /* 1 */ val always: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always with Double = js.native
    
    /* 2 */ val hidden: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden with Double = js.native
    
    /* 0 */ val onHover: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover with Double = js.native
  }
  
  @js.native
  object CollapseAllVisibility extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
  @js.native
  object ColumnActionsMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode with Double
      ] = js.native
    
    /* 1 */ val clickable: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable with Double = js.native
    
    /* 0 */ val disabled: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled with Double = js.native
    
    /* 2 */ val hasDropdown: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
  }
  
  @js.native
  object ColumnDragEndLocation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation with Double
      ] = js.native
    
    /* 2 */ val header: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header with Double = js.native
    
    /* 0 */ val outside: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside with Double = js.native
    
    /* 1 */ val surface: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface with Double = js.native
  }
  
  @js.native
  object ConstrainMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode with Double] = js.native
    
    /* 1 */ val horizontalConstrained: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    
    /* 0 */ val unconstrained: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained with Double = js.native
  }
  
  @js.native
  class DetailsColumnBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @js.native
  class DetailsHeaderBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  /* static members */
  @js.native
  object DetailsHeaderBase extends js.Object {
    
    var defaultProps: CollapseAllVisibility = js.native
  }
  
  @js.native
  class DetailsListBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  /* static members */
  @js.native
  object DetailsListBase extends js.Object {
    
    var defaultProps: CheckboxVisibility = js.native
  }
  
  @js.native
  object DetailsListLayoutMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode with Double
      ] = js.native
    
    /* 0 */ val fixedColumns: typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    
    /* 1 */ val justified: typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified with Double = js.native
  }
  
  @js.native
  class DetailsRowBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility with Double
      ] = js.native
    
    /* 1 */ val hidden: typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden with Double = js.native
    
    /* 0 */ val none: typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none with Double = js.native
    
    /* 2 */ val visible: typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible with Double = js.native
  }
  
  @js.native
  class Selection[TItem] protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
  
  @js.native
  class SelectionZone protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    
    var defaultProps: IsSelectedOnFocus = js.native
    
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
}
