package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobPresignedUrlConfig extends js.Object {
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds. Pre-signed URLs are generated when a request for the job document is received.
    */
  var expiresInSec: js.UndefOr[ExpiresInSeconds] = js.native
}

object AwsJobPresignedUrlConfig {
  @scala.inline
  def apply(): AwsJobPresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobPresignedUrlConfig]
  }
  @scala.inline
  implicit class AwsJobPresignedUrlConfigOps[Self <: AwsJobPresignedUrlConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresInSec(value: ExpiresInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresInSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresInSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresInSec")(js.undefined)
        ret
    }
  }
  
}

