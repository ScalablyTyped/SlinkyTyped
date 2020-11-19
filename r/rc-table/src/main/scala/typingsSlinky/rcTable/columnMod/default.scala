package typingsSlinky.rcTable.columnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-table/lib/sugar/Column", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  def apply[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
}
