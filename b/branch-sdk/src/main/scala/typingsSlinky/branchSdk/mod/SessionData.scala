package typingsSlinky.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionData extends js.Object {
  @JSName("~referring_link")
  var Tildereferring_link: js.UndefOr[String] = js.native
  var has_app: Boolean = js.native
  var identity: String = js.native
  var referring_identity: js.UndefOr[String] = js.native
}

object SessionData {
  @scala.inline
  def apply(has_app: Boolean, identity: String): SessionData = {
    val __obj = js.Dynamic.literal(has_app = has_app.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionData]
  }
  @scala.inline
  implicit class SessionDataOps[Self <: SessionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_app(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTildereferring_link(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("~referring_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTildereferring_link: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("~referring_link")(js.undefined)
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

