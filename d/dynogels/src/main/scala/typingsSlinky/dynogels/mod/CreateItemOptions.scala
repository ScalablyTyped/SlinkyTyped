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
import scala.scalajs.js.annotation._

@js.native
trait CreateItemOptions extends js.Object {
  var ConditionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionExpression] = js.native
  var ConditionalOperator: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionalOperator] = js.native
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.native
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  var ReturnItemCollectionMetrics: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.native
  var ReturnValues: js.UndefOr[ReturnValue] = js.native
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.native
  var overwrite: js.UndefOr[Boolean] = js.native
}

object CreateItemOptions {
  @scala.inline
  def apply(): CreateItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateItemOptions]
  }
  @scala.inline
  implicit class CreateItemOptionsOps[Self <: CreateItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionExpression(value: ConditionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalOperator(value: ConditionalOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withExpected(value: ExpectedAttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expected")(js.undefined)
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
    def withExpressionAttributeValues(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressionAttributeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionAttributeValues")(js.undefined)
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
    @scala.inline
    def withReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnItemCollectionMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnItemCollectionMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnItemCollectionMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnValues(value: ReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnValues")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

