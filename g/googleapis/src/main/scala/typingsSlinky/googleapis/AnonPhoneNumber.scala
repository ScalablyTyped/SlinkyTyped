package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPhoneNumber extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var federatedId: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var providerId: js.UndefOr[String] = js.native
  var rawId: js.UndefOr[String] = js.native
  var screenName: js.UndefOr[String] = js.native
}

object AnonPhoneNumber {
  @scala.inline
  def apply(): AnonPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPhoneNumber]
  }
  @scala.inline
  implicit class AnonPhoneNumberOps[Self <: AnonPhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFederatedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federatedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFederatedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federatedId")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRawId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawId")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(js.undefined)
        ret
    }
  }
  
}

