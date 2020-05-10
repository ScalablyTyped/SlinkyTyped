package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSubscription extends js.Object {
  /**
    * Identifier (ID) of the directory that you want to associate with the log subscription.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The name of the log group.
    */
  var LogGroupName: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.LogGroupName] = js.native
  /**
    * The date and time that the log subscription was created.
    */
  var SubscriptionCreatedDateTime: js.UndefOr[js.Date] = js.native
}

object LogSubscription {
  @scala.inline
  def apply(): LogSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSubscription]
  }
  @scala.inline
  implicit class LogSubscriptionOps[Self <: LogSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionCreatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionCreatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionCreatedDateTime")(js.undefined)
        ret
    }
  }
  
}

