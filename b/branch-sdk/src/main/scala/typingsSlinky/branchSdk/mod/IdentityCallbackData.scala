package typingsSlinky.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityCallbackData extends js.Object {
  var identity_id: String = js.native
  var link: String = js.native
  var referring_data_parsed: js.UndefOr[js.Object] = js.native
  var referring_identity: js.UndefOr[String] = js.native
}

object IdentityCallbackData {
  @scala.inline
  def apply(identity_id: String, link: String): IdentityCallbackData = {
    val __obj = js.Dynamic.literal(identity_id = identity_id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityCallbackData]
  }
  @scala.inline
  implicit class IdentityCallbackDataOps[Self <: IdentityCallbackData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferring_data_parsed(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referring_data_parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferring_data_parsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referring_data_parsed")(js.undefined)
        ret
    }
    @scala.inline
    def withReferring_identity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referring_identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferring_identity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referring_identity")(js.undefined)
        ret
    }
  }
  
}

