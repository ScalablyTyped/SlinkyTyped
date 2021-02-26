package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.columnMod.ColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  @scala.inline
  def apply[RecordType](): SharedBuilder_ColumnProps1734775747[RecordType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnProps[RecordType]]))
  }
  
  @JSImport("rc-table", "Column")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[RecordType](companion: Column.type): SharedBuilder_ColumnProps1734775747[RecordType] = new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[RecordType](p: ColumnProps[RecordType]): SharedBuilder_ColumnProps1734775747[RecordType] = new SharedBuilder_ColumnProps1734775747[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
