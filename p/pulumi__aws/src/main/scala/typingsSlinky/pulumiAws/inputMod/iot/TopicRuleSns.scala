package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleSns extends js.Object {
  
  /**
    * The message format of the message to publish. Accepted values are "JSON" and "RAW".
    */
  var messageFormat: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: Input[String] = js.native
}
object TopicRuleSns {
  
  @scala.inline
  def apply(roleArn: Input[String], targetArn: Input[String]): TopicRuleSns = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleSns]
  }
  
  @scala.inline
  implicit class TopicRuleSnsOps[Self <: TopicRuleSns] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormat(value: Input[String]): Self = this.set("messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageFormat: Self = this.set("messageFormat", js.undefined)
  }
}
