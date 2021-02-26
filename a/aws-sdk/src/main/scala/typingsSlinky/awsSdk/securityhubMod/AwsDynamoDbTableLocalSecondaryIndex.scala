package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableLocalSecondaryIndex extends StObject {
  
  /**
    * The ARN of the index.
    */
  var IndexArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the index.
    */
  var IndexName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The complete key schema for the index.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.native
  
  /**
    * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.native
}
object AwsDynamoDbTableLocalSecondaryIndex {
  
  @scala.inline
  def apply(): AwsDynamoDbTableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableLocalSecondaryIndex]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableLocalSecondaryIndexMutableBuilder[Self <: AwsDynamoDbTableLocalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexArn(value: NonEmptyString): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
    
    @scala.inline
    def setIndexName(value: NonEmptyString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: AwsDynamoDbTableProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
  }
}
