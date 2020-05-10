package typingsSlinky.keycloakConnect.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  var __raw: String = js.native
  var access_token: Token = js.native
  var expires_in: Double = js.native
  var id_token: Token = js.native
  var refresh_token: Token = js.native
  var token_type: String = js.native
  def isExpired(): Boolean = js.native
  def store(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Unit = js.native
  def update(grant: Grant): Unit = js.native
}

object Grant {
  @scala.inline
  def apply(
    __raw: String,
    access_token: Token,
    expires_in: Double,
    id_token: Token,
    isExpired: () => Boolean,
    refresh_token: Token,
    store: (Request_[ParamsDictionary, _, _, Query], Response_[_]) => Unit,
    token_type: String,
    update: Grant => Unit
  ): Grant = {
    val __obj = js.Dynamic.literal(__raw = __raw.asInstanceOf[js.Any], access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], isExpired = js.Any.fromFunction0(isExpired), refresh_token = refresh_token.asInstanceOf[js.Any], store = js.Any.fromFunction2(store), token_type = token_type.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Grant]
  }
  @scala.inline
  implicit class GrantOps[Self <: Grant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__raw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess_token(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId_token(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefresh_token(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: (Request_[ParamsDictionary, _, _, Query], Response_[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToken_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: Grant => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

