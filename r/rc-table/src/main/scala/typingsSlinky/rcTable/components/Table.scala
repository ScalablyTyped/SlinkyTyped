package typingsSlinky.rcTable.components

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.columnGroupMod.ColumnGroupProps
import typingsSlinky.rcTable.columnMod.ColumnProps
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.rowMod.FooterRowProps
import typingsSlinky.rcTable.tableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("rc-table/lib/Table", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[RecordType /* <: DefaultRecordType */](p: TableProps[RecordType]): SharedBuilder_TableProps_579858542[RecordType] = new SharedBuilder_TableProps_579858542[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[RecordType /* <: DefaultRecordType */](): SharedBuilder_TableProps_579858542[RecordType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TableProps_579858542[RecordType](js.Array(this.component, __props.asInstanceOf[TableProps[RecordType]]))
  }
  
  implicit def make[RecordType /* <: DefaultRecordType */](companion: Table.type): SharedBuilder_TableProps_579858542[RecordType] = new SharedBuilder_TableProps_579858542[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  object ColumnGroup {
    
    @JSImport("rc-table/lib/Table", "default.ColumnGroup")
    @js.native
    object component extends js.Object
    
    def withProps[RecordType](p: ColumnGroupProps[RecordType]): SharedBuilder_ColumnGroupProps_758530088[RecordType] = new SharedBuilder_ColumnGroupProps_758530088[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[RecordType](children: ReactElement | js.Array[ReactElement]): SharedBuilder_ColumnGroupProps_758530088[RecordType] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new SharedBuilder_ColumnGroupProps_758530088[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnGroupProps[RecordType]]))
    }
  }
  
  object Column {
    
    @JSImport("rc-table/lib/Table", "default.Column")
    @js.native
    object component extends js.Object
    
    def withProps[RecordType](p: ColumnProps[RecordType]): SharedBuilder_ColumnProps1734775747[RecordType] = new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[RecordType](): SharedBuilder_ColumnProps1734775747[RecordType] = {
      val __props = js.Dynamic.literal()
      new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnProps[RecordType]]))
    }
    
    implicit def make[RecordType](companion: Column.type): SharedBuilder_ColumnProps1734775747[RecordType] = new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Row {
    
    @JSImport("rc-table/lib/Table", "default.Summary.Row")
    @js.native
    object component extends js.Object
    
    def withProps(p: /* props */ FooterRowProps): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Row.type): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Cell {
    
    @JSImport("rc-table/lib/Table", "default.Summary.Cell")
    @js.native
    object component extends js.Object
    
    def withProps(p: /* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps): SharedBuilder_SummaryCellProps1018071789 = new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(index: Double): SharedBuilder_SummaryCellProps1018071789 = {
      val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, __props.asInstanceOf[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps]))
    }
  }
}
