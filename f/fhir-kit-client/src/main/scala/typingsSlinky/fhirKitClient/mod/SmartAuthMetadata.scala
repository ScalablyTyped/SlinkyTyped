package typingsSlinky.fhirKitClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartAuthMetadata extends js.Object {
  var authorizeUrl: js.UndefOr[String] = js.native
  var manageUrl: js.UndefOr[String] = js.native
  var registerUrl: js.UndefOr[String] = js.native
  var tokenUrl: js.UndefOr[String] = js.native
}

object SmartAuthMetadata {
  @scala.inline
  def apply(): SmartAuthMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartAuthMetadata]
  }
  @scala.inline
  implicit class SmartAuthMetadataOps[Self <: SmartAuthMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withManageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(js.undefined)
        ret
    }
  }
  
}

