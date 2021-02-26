package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionDynamodbv2 extends StObject {
  
  /**
    * Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
    */
  var putItem: js.UndefOr[Input[TopicRuleErrorActionDynamodbv2PutItem]] = js.native
  
  /**
    * The IAM role ARN that allows access to the CloudWatch alarm.
    */
  var roleArn: Input[String] = js.native
}
object TopicRuleErrorActionDynamodbv2 {
  
  @scala.inline
  def apply(roleArn: Input[String]): TopicRuleErrorActionDynamodbv2 = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionDynamodbv2]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionDynamodbv2MutableBuilder[Self <: TopicRuleErrorActionDynamodbv2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPutItem(value: Input[TopicRuleErrorActionDynamodbv2PutItem]): Self = StObject.set(x, "putItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutItemUndefined: Self = StObject.set(x, "putItem", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
