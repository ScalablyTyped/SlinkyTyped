package typingsSlinky.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSubscription extends js.Object {
  /**
    * Identifier (ID) of the directory that you want to associate with the log subscription.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.native
  /**
    * The name of the log group.
    */
  var LogGroupName: js.UndefOr[typingsSlinky.awsDashSdk.clientsDirectoryserviceMod.LogGroupName] = js.native
  /**
    * The date and time that the log subscription was created.
    */
  var SubscriptionCreatedDateTime: js.UndefOr[js.Date] = js.native
}

object LogSubscription {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    LogGroupName: LogGroupName = null,
    SubscriptionCreatedDateTime: js.Date = null
  ): LogSubscription = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    if (SubscriptionCreatedDateTime != null) __obj.updateDynamic("SubscriptionCreatedDateTime")(SubscriptionCreatedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSubscription]
  }
}

