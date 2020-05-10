package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLoggingStatus extends js.Object {
  var LoggingEnabled: js.UndefOr[typingsSlinky.awsSdk.s3Mod.LoggingEnabled] = js.native
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

