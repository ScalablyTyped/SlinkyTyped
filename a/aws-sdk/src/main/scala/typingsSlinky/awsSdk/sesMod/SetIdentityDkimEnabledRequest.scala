package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityDkimEnabledRequest extends js.Object {
  /**
    * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
    */
  var DkimEnabled: Enabled = js.native
  /**
    * The identity for which DKIM signing should be enabled or disabled.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
}

object SetIdentityDkimEnabledRequest {
  @scala.inline
  def apply(DkimEnabled: Enabled, Identity: Identity): SetIdentityDkimEnabledRequest = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
  }
  @scala.inline
  implicit class SetIdentityDkimEnabledRequestOps[Self <: SetIdentityDkimEnabledRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDkimEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

