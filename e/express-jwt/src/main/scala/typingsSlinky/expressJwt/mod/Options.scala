package typingsSlinky.expressJwt.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* property */ StringDictionary[js.Any] {
  var credentialsRequired: js.UndefOr[Boolean] = js.native
  var getToken: js.UndefOr[GetTokenCallback] = js.native
  var isRevoked: js.UndefOr[IsRevokedCallback] = js.native
  var requestProperty: js.UndefOr[String] = js.native
  var secret: secretType | SecretCallback | SecretCallbackLong = js.native
  var userProperty: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(secret: secretType | SecretCallback | SecretCallbackLong): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretFunction4(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* header */ js.Any, /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSecretFunction3(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSecret(value: secretType | SecretCallback | SecretCallbackLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToken(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRevoked(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRevoked")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutIsRevoked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRevoked")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperty")(js.undefined)
        ret
    }
  }
  
}

