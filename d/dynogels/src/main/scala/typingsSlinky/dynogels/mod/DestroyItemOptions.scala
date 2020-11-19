package typingsSlinky.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.dynamodbMod.ConditionExpression
import typingsSlinky.awsSdk.dynamodbMod.ConditionalOperator
import typingsSlinky.awsSdk.dynamodbMod.ExpectedAttributeMap
import typingsSlinky.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity
import typingsSlinky.awsSdk.dynamodbMod.ReturnItemCollectionMetrics
import typingsSlinky.awsSdk.dynamodbMod.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestroyItemOptions extends js.Object {
  
  var ConditionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionExpression] = js.native
  
  var ConditionalOperator: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionalOperator] = js.native
  
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
  
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  
  var ReturnItemCollectionMetrics: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.native
  
  var ReturnValues: js.UndefOr[ReturnValue] = js.native
}
object DestroyItemOptions {
  
  @scala.inline
  def apply(): DestroyItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyItemOptions]
  }
  
  @scala.inline
  implicit class DestroyItemOptionsOps[Self <: DestroyItemOptions] (val x: Self) extends AnyVal {
    
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
    def setConditionExpression(value: ConditionExpression): Self = this.set("ConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionExpression: Self = this.set("ConditionExpression", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = this.set("ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalOperator: Self = this.set("ConditionalOperator", js.undefined)
    
    @scala.inline
    def setExpected(value: ExpectedAttributeMap): Self = this.set("Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpected: Self = this.set("Expected", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = this.set("ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeNames: Self = this.set("ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: StringDictionary[js.Any]): Self = this.set("ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionAttributeValues: Self = this.set("ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = this.set("ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnItemCollectionMetrics: Self = this.set("ReturnItemCollectionMetrics", js.undefined)
    
    @scala.inline
    def setReturnValues(value: ReturnValue): Self = this.set("ReturnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValues: Self = this.set("ReturnValues", js.undefined)
  }
}
