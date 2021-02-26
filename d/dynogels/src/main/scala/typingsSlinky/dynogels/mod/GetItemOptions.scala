package typingsSlinky.dynogels.mod

import typingsSlinky.awsSdk.dynamodbMod.AttributeName
import typingsSlinky.awsSdk.dynamodbMod.AttributeNameList
import typingsSlinky.awsSdk.dynamodbMod.ConsistentRead
import typingsSlinky.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsSlinky.awsSdk.dynamodbMod.ProjectionExpression
import typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetItemOptions extends StObject {
  
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.native
  
  var ConsistentRead: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConsistentRead] = js.native
  
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  var ProjectionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ProjectionExpression] = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
}
object GetItemOptions {
  
  @scala.inline
  def apply(): GetItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemOptions]
  }
  
  @scala.inline
  implicit class GetItemOptionsMutableBuilder[Self <: GetItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesToGet(value: AttributeNameList): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    @scala.inline
    def setAttributesToGetVarargs(value: AttributeName*): Self = StObject.set(x, "AttributesToGet", js.Array(value :_*))
    
    @scala.inline
    def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
  }
}
