package typingsSlinky.dynogels.mod

import typingsSlinky.awsSdk.dynamodbMod.AttributeNameList
import typingsSlinky.awsSdk.dynamodbMod.ConsistentRead
import typingsSlinky.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsSlinky.awsSdk.dynamodbMod.ProjectionExpression
import typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetItemOptions extends js.Object {
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
  implicit class GetItemOptionsOps[Self <: GetItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributesToGet(value: AttributeNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributesToGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesToGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributesToGet")(js.undefined)
        ret
    }
    @scala.inline
    def withConsistentRead(value: ConsistentRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistentRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistentRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistentRead")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionExpression(value: ProjectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnConsumedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnConsumedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnConsumedCapacity")(js.undefined)
        ret
    }
  }
  
}

