package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon CloudWatch destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon CloudWatch Log Group that you want to record events in.
    */
  var LogGroupArn: js.UndefOr[String] = js.native
}
object CloudWatchLogsDestination {
  
  @scala.inline
  def apply(): CloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsDestination]
  }
  
  @scala.inline
  implicit class CloudWatchLogsDestinationMutableBuilder[Self <: CloudWatchLogsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setLogGroupArn(value: String): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
  }
}
