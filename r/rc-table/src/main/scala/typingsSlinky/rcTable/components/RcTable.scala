package typingsSlinky.rcTable.components

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.columnGroupMod.ColumnGroupProps
import typingsSlinky.rcTable.columnMod.ColumnProps
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.rowMod.FooterRowProps
import typingsSlinky.rcTable.tableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTable {
  @JSImport("rc-table", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[/* <: typingsSlinky.rcTable.interfaceMod.DefaultRecordType */ RecordType](p: TableProps[RecordType]): SharedBuilder_TableProps_175475921[RecordType] = new SharedBuilder_TableProps_175475921[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.rcTable.interfaceMod.DefaultRecordType */ RecordType](): SharedBuilder_TableProps_175475921[RecordType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_TableProps_175475921[RecordType](js.Array(this.component, __props.asInstanceOf[TableProps[RecordType]]))
  }
  implicit def make[/* <: typingsSlinky.rcTable.interfaceMod.DefaultRecordType */ RecordType](companion: RcTable.type): SharedBuilder_TableProps_175475921[RecordType] = new SharedBuilder_TableProps_175475921[RecordType](js.Array(this.component, js.Dictionary.empty))()
  object ColumnGroup {
    @JSImport("rc-table", "default.ColumnGroup")
    @js.native
    object component extends js.Object
    
    def withProps[RecordType](p: ColumnGroupProps[RecordType]): SharedBuilder_ColumnGroupProps1804316134[RecordType] = new SharedBuilder_ColumnGroupProps1804316134[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[RecordType](children: ReactElement | js.Array[ReactElement]): SharedBuilder_ColumnGroupProps1804316134[RecordType] = {
        val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        new SharedBuilder_ColumnGroupProps1804316134[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnGroupProps[RecordType]]))
    }
  }
  
  object Column {
    @JSImport("rc-table", "default.Column")
    @js.native
    object component extends js.Object
    
    def withProps[RecordType](p: ColumnProps[RecordType]): SharedBuilder_ColumnProps177095460[RecordType] = new SharedBuilder_ColumnProps177095460[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply[RecordType](): SharedBuilder_ColumnProps177095460[RecordType] = {
        val __props = js.Dynamic.literal()
        new SharedBuilder_ColumnProps177095460[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnProps[RecordType]]))
    }
    implicit def make[RecordType](companion: Column.type): SharedBuilder_ColumnProps177095460[RecordType] = new SharedBuilder_ColumnProps177095460[RecordType](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Row {
    @JSImport("rc-table", "default.Summary.Row")
    @js.native
    object component extends js.Object
    
    def withProps(p: /* props */ FooterRowProps): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Row.type): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Cell {
    @JSImport("rc-table", "default.Summary.Cell")
    @js.native
    object component extends js.Object
    
    def withProps(p: /* hasClassNameIndexChildrenColSpanRowSpan */ SummaryCellProps): SharedBuilder_SummaryCellProps1018071789 = new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(index: Double): SharedBuilder_SummaryCellProps1018071789 = {
        val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
        new SharedBuilder_SummaryCellProps1018071789(js.Array(this.component, __props.asInstanceOf[/* hasClassNameIndexChildrenColSpanRowSpan */ SummaryCellProps]))
    }
  }
  
}

