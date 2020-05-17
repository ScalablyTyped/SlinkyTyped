package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionOffer extends js.Object {
  var createdAt: js.Date = js.native
  var expiresAt: js.UndefOr[js.Date] = js.native
  var id: String = js.native
  var mayManage: js.UndefOr[Boolean] = js.native
  var mayRead: js.UndefOr[Boolean] = js.native
  var mayWrite: js.UndefOr[Boolean] = js.native
  var realmUrl: String = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var statusMessage: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var updatedAt: js.Date = js.native
}

object PermissionOffer {
  @scala.inline
  def apply(createdAt: js.Date, id: String, realmUrl: String, updatedAt: js.Date): PermissionOffer = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], realmUrl = realmUrl.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionOffer]
  }
  @scala.inline
  implicit class PermissionOfferOps[Self <: PermissionOffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealmUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realmUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMayManage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayManage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayManage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayManage")(js.undefined)
        ret
    }
    @scala.inline
    def withMayRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayRead")(js.undefined)
        ret
    }
    @scala.inline
    def withMayWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayWrite")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

