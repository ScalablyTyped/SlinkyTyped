package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGlobalSecondaryIndexAction extends StObject {
  
  /**
    * The name of the global secondary index to be created.
    */
  var IndexName: typingsSlinky.awsSdk.dynamodbMod.IndexName = js.native
  
  /**
    * The key schema for the global secondary index.
    */
  var KeySchema: typingsSlinky.awsSdk.dynamodbMod.KeySchema = js.native
  
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: typingsSlinky.awsSdk.dynamodbMod.Projection = js.native
  
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProvisionedThroughput] = js.native
}
object CreateGlobalSecondaryIndexAction {
  
  @scala.inline
  def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): CreateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
  }
  
  @scala.inline
  implicit class CreateGlobalSecondaryIndexActionMutableBuilder[Self <: CreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
