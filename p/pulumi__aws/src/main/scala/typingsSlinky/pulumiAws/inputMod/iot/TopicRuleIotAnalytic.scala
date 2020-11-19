package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleIotAnalytic extends js.Object {
  
  /**
    * Name of AWS IOT Analytics channel.
    */
  var channelName: Input[String] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
}
object TopicRuleIotAnalytic {
  
  @scala.inline
  def apply(channelName: Input[String], roleArn: Input[String]): TopicRuleIotAnalytic = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleIotAnalytic]
  }
  
  @scala.inline
  implicit class TopicRuleIotAnalyticOps[Self <: TopicRuleIotAnalytic] (val x: Self) extends AnyVal {
    
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
    def setChannelName(value: Input[String]): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
}
