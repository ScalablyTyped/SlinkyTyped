package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to insert, update, insert_or_update, and replace operations.
  */
@js.native
trait SchemaWrite extends js.Object {
  
  /**
    * The names of the columns in table to be written.  The list of columns
    * must contain enough columns to allow Cloud Spanner to derive values for
    * all primary key columns in the row(s) to be modified.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The table whose rows will be written.
    */
  var table: js.UndefOr[String] = js.native
  
  /**
    * The values to be written. `values` can contain more than one list of
    * values. If it does, then multiple rows are written, one for each entry in
    * `values`. Each list in `values` must have exactly as many entries as
    * there are entries in columns above. Sending multiple lists is equivalent
    * to sending multiple `Mutation`s, each containing one `values` entry and
    * repeating table and columns. Individual values in each list are encoded
    * as described here.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object SchemaWrite {
  
  @scala.inline
  def apply(): SchemaWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrite]
  }
  
  @scala.inline
  implicit class SchemaWriteOps[Self <: SchemaWrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
