package typingsSlinky.rcTable.components

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.columnGroupMod.ColumnGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColumnGroup {
  
  @scala.inline
  def apply[RecordType](children: ReactElement | js.Array[ReactElement]): SharedBuilder_ColumnGroupProps_758530088[RecordType] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_ColumnGroupProps_758530088[RecordType](js.Array(this.component, __props.asInstanceOf[ColumnGroupProps[RecordType]]))
  }
  
  @JSImport("rc-table", "ColumnGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps[RecordType](p: ColumnGroupProps[RecordType]): SharedBuilder_ColumnGroupProps_758530088[RecordType] = new SharedBuilder_ColumnGroupProps_758530088[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
