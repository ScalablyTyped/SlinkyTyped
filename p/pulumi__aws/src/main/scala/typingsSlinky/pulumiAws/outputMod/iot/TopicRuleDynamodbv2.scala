package typingsSlinky.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleDynamodbv2 extends js.Object {
  
  /**
    * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
    */
  var putItem: js.UndefOr[TopicRuleDynamodbv2PutItem] = js.native
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: String = js.native
}
object TopicRuleDynamodbv2 {
  
  @scala.inline
  def apply(roleArn: String): TopicRuleDynamodbv2 = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodbv2]
  }
  
  @scala.inline
  implicit class TopicRuleDynamodbv2Ops[Self <: TopicRuleDynamodbv2] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutItem(value: TopicRuleDynamodbv2PutItem): Self = this.set("putItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePutItem: Self = this.set("putItem", js.undefined)
  }
}
