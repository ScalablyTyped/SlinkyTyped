package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSchemaVersionSummary extends js.Object {
  
  /**
    * The date the schema version was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  
  /**
    * The type of schema.
    */
  var Type: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Type] = js.native
}
object SearchSchemaVersionSummary {
  
  @scala.inline
  def apply(): SearchSchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaVersionSummary]
  }
  
  @scala.inline
  implicit class SearchSchemaVersionSummaryOps[Self <: SearchSchemaVersionSummary] (val x: Self) extends AnyVal {
    
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
    def setCreatedDate(value: js.Date): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("SchemaVersion", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
