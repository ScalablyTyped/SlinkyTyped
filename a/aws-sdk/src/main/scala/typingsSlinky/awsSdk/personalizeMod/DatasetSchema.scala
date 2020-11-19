package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetSchema extends js.Object {
  
  /**
    * The date and time (in Unix time) that the schema was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The date and time (in Unix time) that the schema was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the schema.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The schema.
    */
  var schema: js.UndefOr[AvroSchema] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
}
object DatasetSchema {
  
  @scala.inline
  def apply(): DatasetSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSchema]
  }
  
  @scala.inline
  implicit class DatasetSchemaOps[Self <: DatasetSchema] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: js.Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSchema(value: AvroSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("schemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("schemaArn", js.undefined)
  }
}
