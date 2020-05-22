package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateAccessLogsRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName = js.native
  /**
    *  The time at which the logs should end, inclusive. 
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    *  The time at which the logs should start, inclusive. 
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object GenerateAccessLogsRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName, endTime: js.Date = null, startTime: js.Date = null): GenerateAccessLogsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAccessLogsRequest]
  }
}

