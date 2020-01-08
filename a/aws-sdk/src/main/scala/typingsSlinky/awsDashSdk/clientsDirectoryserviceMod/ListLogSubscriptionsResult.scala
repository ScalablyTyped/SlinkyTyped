package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLogSubscriptionsResult extends js.Object {
  /**
    * A list of active LogSubscription objects for calling the AWS account.
    */
  var LogSubscriptions: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.LogSubscriptions] = js.native
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.native
}

object ListLogSubscriptionsResult {
  @scala.inline
  def apply(LogSubscriptions: LogSubscriptions = null, NextToken: NextToken = null): ListLogSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    if (LogSubscriptions != null) __obj.updateDynamic("LogSubscriptions")(LogSubscriptions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLogSubscriptionsResult]
  }
}

