package typingsSlinky.awsSdkClientS3Node.typesBucketLoggingStatusMod

import typingsSlinky.awsSdkClientS3Node.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledBucketLoggingStatus extends BucketLoggingStatus {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  @JSName("LoggingEnabled")
  var LoggingEnabled_UnmarshalledBucketLoggingStatus: js.UndefOr[UnmarshalledLoggingEnabled] = js.native
}

object UnmarshalledBucketLoggingStatus {
  @scala.inline
  def apply(): UnmarshalledBucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledBucketLoggingStatus]
  }
  @scala.inline
  implicit class UnmarshalledBucketLoggingStatusOps[Self <: UnmarshalledBucketLoggingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingEnabled(value: UnmarshalledLoggingEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingEnabled")(js.undefined)
        ret
    }
  }
  
}

