package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFederatedId extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var federatedId: js.UndefOr[String] = js.native
  var photoUrl: js.UndefOr[String] = js.native
  var providerId: js.UndefOr[String] = js.native
}

object AnonFederatedId {
  @scala.inline
  def apply(): AnonFederatedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFederatedId]
  }
  @scala.inline
  implicit class AnonFederatedIdOps[Self <: AnonFederatedId] (val x: Self) extends AnyVal {
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
  }
  
}

