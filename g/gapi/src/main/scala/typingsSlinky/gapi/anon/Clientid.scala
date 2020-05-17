package typingsSlinky.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clientid extends js.Object {
  /**
    * The user to sign in as. -1 to toggle a multi-account chooser, 0 to default to the user's current account, and 1 to automatically sign in if the user is signed into Google Plus.
    */
  var authuser: js.UndefOr[Double] = js.native
  /**
    * The application's client ID.
    */
  var client_id: js.UndefOr[String] = js.native
  /**
    * If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user.
    */
  var immediate: js.UndefOr[Boolean] = js.native
  /**
    * The OAuth 2.0 response type property. Default: token
    */
  var response_type: js.UndefOr[String] = js.native
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[js.Any] = js.native
}

object Clientid {
  @scala.inline
  def apply(): Clientid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clientid]
  }
  @scala.inline
  implicit class ClientidOps[Self <: Clientid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthuser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authuser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthuser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authuser")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

