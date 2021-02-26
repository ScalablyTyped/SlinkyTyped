package typingsSlinky.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName = js.native
  
  /**
    * The retention duration of the memory store and the magnetic store.
    */
  var RetentionProperties: typingsSlinky.awsSdk.timestreamwriteMod.RetentionProperties = js.native
  
  /**
    * The name of the Timesream table.
    */
  var TableName: ResourceName = js.native
}
object UpdateTableRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, RetentionProperties: RetentionProperties, TableName: ResourceName): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], RetentionProperties = RetentionProperties.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRequestMutableBuilder[Self <: UpdateTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionProperties(value: RetentionProperties): Self = StObject.set(x, "RetentionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
