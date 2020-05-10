package typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalSecondaryIndexActionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be updated.</p>
    */
  var IndexName: String = js.native
  /**
    * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ProvisionedThroughput: typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
}

object UpdateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
  }
  @scala.inline
  implicit class UpdateGlobalSecondaryIndexActionOps[Self <: UpdateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionedThroughput(value: ProvisionedThroughput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

