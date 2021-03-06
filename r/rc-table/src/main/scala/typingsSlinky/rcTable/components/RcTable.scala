package typingsSlinky.rcTable.components

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.columnGroupMod.ColumnGroupProps
import typingsSlinky.rcTable.columnMod.ColumnProps
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.interfaceMod.DefaultRecordType
import typingsSlinky.rcTable.rowMod.FooterRowProps
import typingsSlinky.rcTable.tableMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTable {
  
  @scala.inline
  def apply[RecordType /* <: DefaultRecordType */](): SharedBuilder_TableProps_579858542[RecordType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TableProps_579858542[RecordType](js.Array(this.component, __props.asInstanceOf[TableProps[RecordType]]))
  }
  
  object Cell {
    
    @scala.inline
    def apply(index: Double): SharedBuilder_SummaryCellProps1018071789 = {
      val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, __props.asInstanceOf[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps]))
    }
    
    @JSImport("rc-table", "default.Summary.Cell")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: /* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps): SharedBuilder_SummaryCellProps1018071789 = new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Column {
    
    @scala.inline
    def apply[RecordType](): SharedBuilder_ColumnProps1734775747[RecordType] = {
      val __props = js.Dynamic.literal()
      new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnProps[RecordType]]))
    }
    
    @JSImport("rc-table", "default.Column")
    @js.native
    val component: js.Object = js.native
    
    implicit def make[RecordType](companion: Column.type): SharedBuilder_ColumnProps1734775747[RecordType] = new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps[RecordType](p: ColumnProps[RecordType]): SharedBuilder_ColumnProps1734775747[RecordType] = new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object ColumnGroup {
    
    @scala.inline
    def apply[RecordType](children: ReactElement | js.Array[ReactElement]): SharedBuilder_ColumnGroupProps_758530088[RecordType] = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new SharedBuilder_ColumnGroupProps_758530088[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnGroupProps[RecordType]]))
    }
    
    @JSImport("rc-table", "default.ColumnGroup")
    @js.native
    val component: js.Object = js.native
    
    def withProps[RecordType](p: ColumnGroupProps[RecordType]): SharedBuilder_ColumnGroupProps_758530088[RecordType] = new SharedBuilder_ColumnGroupProps_758530088[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Row {
    
    @JSImport("rc-table", "default.Summary.Row")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Row.type): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* props */ FooterRowProps): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-table", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[RecordType /* <: DefaultRecordType */](companion: RcTable.type): SharedBuilder_TableProps_579858542[RecordType] = new SharedBuilder_TableProps_579858542[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[RecordType /* <: DefaultRecordType */](p: TableProps[RecordType]): SharedBuilder_TableProps_579858542[RecordType] = new SharedBuilder_TableProps_579858542[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
