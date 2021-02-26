package typingsSlinky.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionIotAnalytics extends StObject {
  
  /**
    * Name of AWS IOT Analytics channel.
    */
  var channelName: String = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
}
object TopicRuleErrorActionIotAnalytics {
  
  @scala.inline
  def apply(channelName: String, roleArn: String): TopicRuleErrorActionIotAnalytics = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionIotAnalytics]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionIotAnalyticsMutableBuilder[Self <: TopicRuleErrorActionIotAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
