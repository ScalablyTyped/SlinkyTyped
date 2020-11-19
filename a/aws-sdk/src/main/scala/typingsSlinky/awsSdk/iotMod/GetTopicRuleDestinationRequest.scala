package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopicRuleDestinationRequest extends js.Object {
  
  /**
    * The ARN of the topic rule destination.
    */
  var arn: AwsArn = js.native
}
object GetTopicRuleDestinationRequest {
  
  @scala.inline
  def apply(arn: AwsArn): GetTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicRuleDestinationRequest]
  }
  
  @scala.inline
  implicit class GetTopicRuleDestinationRequestOps[Self <: GetTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: AwsArn): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
}
