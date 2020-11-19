package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for google.bigtable.admin.v2.BigtableTableAdmin.ListTables
  */
@js.native
trait SchemaListTablesResponse extends js.Object {
  
  /**
    * Set if not all tables could be returned in a single response. Pass this
    * value to `page_token` in another request to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The tables present in the requested instance.
    */
  var tables: js.UndefOr[js.Array[SchemaTable]] = js.native
}
object SchemaListTablesResponse {
  
  @scala.inline
  def apply(): SchemaListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTablesResponse]
  }
  
  @scala.inline
  implicit class SchemaListTablesResponseOps[Self <: SchemaListTablesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: SchemaTable*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[SchemaTable]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
}
