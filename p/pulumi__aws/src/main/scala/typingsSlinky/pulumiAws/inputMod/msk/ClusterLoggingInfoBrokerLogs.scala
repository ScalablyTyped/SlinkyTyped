package typingsSlinky.pulumiAws.inputMod.msk

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterLoggingInfoBrokerLogs extends StObject {
  
  var cloudwatchLogs: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsCloudwatchLogs]] = js.native
  
  var firehose: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsFirehose]] = js.native
  
  var s3: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsS3]] = js.native
}
object ClusterLoggingInfoBrokerLogs {
  
  @scala.inline
  def apply(): ClusterLoggingInfoBrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogs]
  }
  
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsMutableBuilder[Self <: ClusterLoggingInfoBrokerLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLogs(value: Input[ClusterLoggingInfoBrokerLogsCloudwatchLogs]): Self = StObject.set(x, "cloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLogsUndefined: Self = StObject.set(x, "cloudwatchLogs", js.undefined)
    
    @scala.inline
    def setFirehose(value: Input[ClusterLoggingInfoBrokerLogsFirehose]): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    @scala.inline
    def setS3(value: Input[ClusterLoggingInfoBrokerLogsS3]): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
