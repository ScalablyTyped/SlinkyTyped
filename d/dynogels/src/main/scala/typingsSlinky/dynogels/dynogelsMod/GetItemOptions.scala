package typingsSlinky.dynogels.dynogelsMod

import typingsSlinky.awsDashSdk.clientsDynamodbMod.AttributeNameList
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ExpressionAttributeNameMap
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ProjectionExpression
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemOptions extends js.Object {
  var AttributesToGet: js.UndefOr[AttributeNameList] = js.undefined
  var ConsistentRead: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ConsistentRead] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.undefined
  var ProjectionExpression: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ProjectionExpression] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
}

object GetItemOptions {
  @scala.inline
  def apply(
    AttributesToGet: AttributeNameList = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined,
    ExpressionAttributeNames: ExpressionAttributeNameMap = null,
    ProjectionExpression: ProjectionExpression = null,
    ReturnConsumedCapacity: ReturnConsumedCapacity = null
  ): GetItemOptions = {
    val __obj = js.Dynamic.literal()
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead.asInstanceOf[js.Any])
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames.asInstanceOf[js.Any])
    if (ProjectionExpression != null) __obj.updateDynamic("ProjectionExpression")(ProjectionExpression.asInstanceOf[js.Any])
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemOptions]
  }
}

