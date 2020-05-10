package typingsSlinky.auth0Angular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuth0ClientOptions extends js.Object {
  /**
    * Client identifier of your Auth0 application
    */
  var clientID: String = js.native
  /**
    * Domain of your Auth0 account
    */
  var domain: String = js.native
  /**
    * Login state if you're using ui-router
    */
  var loginState: js.UndefOr[String] = js.native
  /**
    * Login url if you're using ngRoute
    */
  var loginUrl: js.UndefOr[String] = js.native
  /**
    * Use single signon
    */
  var sso: js.UndefOr[Boolean] = js.native
}

object IAuth0ClientOptions {
  @scala.inline
  def apply(clientID: String, domain: String): IAuth0ClientOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuth0ClientOptions]
  }
  @scala.inline
  implicit class IAuth0ClientOptionsOps[Self <: IAuth0ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginState")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSso(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sso")(js.undefined)
        ret
    }
  }
  
}

