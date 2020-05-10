package typingsSlinky.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthCredentials extends js.Object {
  /**
    * If set, will only work with routes that set `access.entity` to `app`.
    */
  var app: js.UndefOr[AppCredentials] = js.native
  /**
    * The application scopes to be granted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set, will only work with routes that set `access.entity` to `user`.
    */
  var user: js.UndefOr[UserCredentials] = js.native
}

object AuthCredentials {
  @scala.inline
  def apply(): AuthCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthCredentials]
  }
  @scala.inline
  implicit class AuthCredentialsOps[Self <: AuthCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: AppCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Array[String]): Self = {
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
    @scala.inline
    def withUser(value: UserCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

