package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIamConfig extends js.Object {
  /**
    * The signing region for AWS IAM authorization.
    */
  var signingRegion: js.UndefOr[String] = js.native
  /**
    * The signing service name for AWS IAM authorization.
    */
  var signingServiceName: js.UndefOr[String] = js.native
}

object AwsIamConfig {
  @scala.inline
  def apply(): AwsIamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamConfig]
  }
  @scala.inline
  implicit class AwsIamConfigOps[Self <: AwsIamConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSigningRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingServiceName")(js.undefined)
        ret
    }
  }
  
}

