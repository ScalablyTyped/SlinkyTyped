package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.anon.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.anon.CollapseAllVisibility
import typingsSlinky.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsSlinky.officeUiFabricReact.detailsColumnTypesMod.IDetailsColumnProps
import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.IDetailsHeaderBaseProps
import typingsSlinky.officeUiFabricReact.detailsListBaseMod.IDetailsListState
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typingsSlinky.officeUiFabricReact.detailsRowBaseMod.IDetailsRowState
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowStyleProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowStyles
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDetailsListMod {
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "CheckboxVisibility")
  @js.native
  object CheckboxVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility with Double
      ] = js.native
    
    /* 1 */ val always: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always with Double = js.native
    
    /* 2 */ val hidden: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden with Double = js.native
    
    /* 0 */ val onHover: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "CollapseAllVisibility")
  @js.native
  object CollapseAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
    
    /* 0 */ val hidden: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    
    /* 1 */ val visible: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "ColumnActionsMode")
  @js.native
  object ColumnActionsMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode with Double
      ] = js.native
    
    /* 1 */ val clickable: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.clickable with Double = js.native
    
    /* 0 */ val disabled: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.disabled with Double = js.native
    
    /* 2 */ val hasDropdown: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnActionsMode.hasDropdown with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "ColumnDragEndLocation")
  @js.native
  object ColumnDragEndLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation with Double
      ] = js.native
    
    /* 2 */ val header: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.header with Double = js.native
    
    /* 0 */ val outside: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.outside with Double = js.native
    
    /* 1 */ val surface: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ColumnDragEndLocation.surface with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "ConstrainMode")
  @js.native
  object ConstrainMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode with Double] = js.native
    
    /* 1 */ val horizontalConstrained: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode.horizontalConstrained with Double = js.native
    
    /* 0 */ val unconstrained: typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode.unconstrained with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_CELL_STYLE_PROPS")
  @js.native
  val DEFAULT_CELL_STYLE_PROPS: ICellStyleProps = js.native
  
  object DEFAULT_ROW_HEIGHTS {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_ROW_HEIGHTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_ROW_HEIGHTS.compactRowHeight")
    @js.native
    def compactRowHeight: Double = js.native
    @scala.inline
    def compactRowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compactRowHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DEFAULT_ROW_HEIGHTS.rowHeight")
    @js.native
    def rowHeight: Double = js.native
    @scala.inline
    def rowHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsColumnBase")
  @js.native
  class DetailsColumnBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsColumnBase {
    def this(props: IDetailsColumnProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeader")
  @js.native
  val DetailsHeader: ReactComponentClass[IDetailsHeaderBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeaderBase")
  @js.native
  class DetailsHeaderBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsHeaderBase {
    def this(props: IDetailsHeaderBaseProps) = this()
  }
  /* static members */
  object DetailsHeaderBase {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeaderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsHeaderBase.defaultProps")
    @js.native
    def defaultProps: CollapseAllVisibility = js.native
    @scala.inline
    def defaultProps_=(x: CollapseAllVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsList")
  @js.native
  val DetailsList: ReactComponentClass[IDetailsListProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase")
  @js.native
  class DetailsListBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsListBase {
    def this(props: IDetailsListProps) = this()
  }
  /* static members */
  object DetailsListBase {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase.defaultProps")
    @js.native
    def defaultProps: CheckboxVisibility = js.native
    @scala.inline
    def defaultProps_=(x: CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsListLayoutMode")
  @js.native
  object DetailsListLayoutMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode with Double
      ] = js.native
    
    /* 0 */ val fixedColumns: typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns with Double = js.native
    
    /* 1 */ val justified: typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRow")
  @js.native
  val DetailsRow: ReactComponentClass[IDetailsRowBaseProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowBase")
  @js.native
  class DetailsRowBase protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.DetailsRowBase {
    def this(props: IDetailsRowBaseProps) = this()
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowCheck")
  @js.native
  val DetailsRowCheck: ReactComponentClass[IDetailsRowCheckProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowFields")
  @js.native
  val DetailsRowFields: ReactComponentClass[IDetailsRowFieldsProps] = js.native
  
  object DetailsRowGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cell")
    @js.native
    def cell: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cellAnimation")
    @js.native
    def cellAnimation: String = js.native
    @scala.inline
    def cellAnimation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cellCheck")
    @js.native
    def cellCheck: String = js.native
    @scala.inline
    def cellCheck_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellCheck")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.cellMeasurer")
    @js.native
    def cellMeasurer: String = js.native
    @scala.inline
    def cellMeasurer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cell_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cell")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.check")
    @js.native
    def check: String = js.native
    @scala.inline
    def check_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("check")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.compact")
    @js.native
    def compact: String = js.native
    @scala.inline
    def compact_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compact")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.fields")
    @js.native
    def fields: String = js.native
    @scala.inline
    def fields_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isCheckVisible")
    @js.native
    def isCheckVisible: String = js.native
    @scala.inline
    def isCheckVisible_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCheckVisible")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isContentUnselectable")
    @js.native
    def isContentUnselectable: String = js.native
    @scala.inline
    def isContentUnselectable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isContentUnselectable")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isRowHeader")
    @js.native
    def isRowHeader: String = js.native
    @scala.inline
    def isRowHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.isSelected")
    @js.native
    def isSelected: String = js.native
    @scala.inline
    def isSelected_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.listCellFirstChild")
    @js.native
    def listCellFirstChild: String = js.native
    @scala.inline
    def listCellFirstChild_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listCellFirstChild")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "DetailsRowGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectAllVisibility")
  @js.native
  object SelectAllVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility with Double
      ] = js.native
    
    /* 1 */ val hidden: typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.hidden with Double = js.native
    
    /* 0 */ val none: typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.none with Double = js.native
    
    /* 2 */ val visible: typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility.visible with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "Selection")
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
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone")
  @js.native
  class SelectionZone protected ()
    extends typingsSlinky.officeUiFabricReact.detailsListMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  object SelectionZone {
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone.defaultProps")
    @js.native
    def defaultProps: IsSelectedOnFocus = js.native
    @scala.inline
    def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/DetailsList", "SelectionZone.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "buildColumns")
  @js.native
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
  
  @JSImport("office-ui-fabric-react/lib/DetailsList", "getDetailsRowStyles")
  @js.native
  def getDetailsRowStyles(props: IDetailsRowStyleProps): IDetailsRowStyles = js.native
}
