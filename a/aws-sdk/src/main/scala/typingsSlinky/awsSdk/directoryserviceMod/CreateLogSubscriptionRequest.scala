package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogSubscriptionRequest extends js.Object {
  /**
    * Identifier of the directory to which you want to subscribe and receive real-time logs to your specified CloudWatch log group.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
    */
  var LogGroupName: typingsSlinky.awsSdk.directoryserviceMod.LogGroupName = js.native
}

object CreateLogSubscriptionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, LogGroupName: LogGroupName): CreateLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], LogGroupName = LogGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogSubscriptionRequest]
  }
  @scala.inline
  implicit class CreateLogSubscriptionRequestOps[Self <: CreateLogSubscriptionRequest] (val x: Self) extends AnyVal {
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
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

