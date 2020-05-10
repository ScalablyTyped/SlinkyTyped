package typingsSlinky.awsSdkClientS3Node.typesBucketLoggingStatusMod

import typingsSlinky.awsSdkClientS3Node.typesLoggingEnabledMod.LoggingEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLoggingStatus extends js.Object {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesLoggingEnabledMod.LoggingEnabled] = js.native
}

object BucketLoggingStatus {
  @scala.inline
  def apply(): BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLoggingStatus]
  }
  @scala.inline
  implicit class BucketLoggingStatusOps[Self <: BucketLoggingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingEnabled(value: LoggingEnabled): Self = {
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

