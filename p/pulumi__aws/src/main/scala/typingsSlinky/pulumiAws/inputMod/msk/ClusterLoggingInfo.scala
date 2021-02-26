package typingsSlinky.pulumiAws.inputMod.msk

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterLoggingInfo extends StObject {
  
  /**
    * Configuration block for Broker Logs settings for logging info. See below.
    */
  var brokerLogs: Input[ClusterLoggingInfoBrokerLogs] = js.native
}
object ClusterLoggingInfo {
  
  @scala.inline
  def apply(brokerLogs: Input[ClusterLoggingInfoBrokerLogs]): ClusterLoggingInfo = {
    val __obj = js.Dynamic.literal(brokerLogs = brokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfo]
  }
  
  @scala.inline
  implicit class ClusterLoggingInfoMutableBuilder[Self <: ClusterLoggingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerLogs(value: Input[ClusterLoggingInfoBrokerLogs]): Self = StObject.set(x, "brokerLogs", value.asInstanceOf[js.Any])
  }
}
