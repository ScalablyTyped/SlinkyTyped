package typingsSlinky.pulumiAws.outputMod.iot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionRepublish extends js.Object {
  
  /**
    * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
    */
  var qos: js.UndefOr[Double] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
  
  /**
    * The name of the MQTT topic the message should be republished to.
    */
  var topic: String = js.native
}
object TopicRuleErrorActionRepublish {
  
  @scala.inline
  def apply(roleArn: String, topic: String): TopicRuleErrorActionRepublish = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionRepublish]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionRepublishOps[Self <: TopicRuleErrorActionRepublish] (val x: Self) extends AnyVal {
    
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
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQos(value: Double): Self = this.set("qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
  }
}
