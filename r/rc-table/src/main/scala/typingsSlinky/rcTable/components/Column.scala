package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.columnMod.ColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  @JSImport("rc-table", "Column")
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

