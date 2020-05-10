package typingsSlinky.keycloakConnect.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var clientId: String = js.native
  var content: TokenContent = js.native
  var header: js.UndefOr[js.Any] = js.native
  var signature: js.UndefOr[Buffer] = js.native
  var signed: js.UndefOr[String] = js.native
  var token: String = js.native
  def hasApplicationRole(appName: String, roleName: String): Boolean = js.native
  def hasPermission(resource: String, scope: String): Boolean = js.native
  def hasRealmRole(roleName: String): Boolean = js.native
  def hasRole(roleName: String): Boolean = js.native
  def isExpired(): Boolean = js.native
}

object Token {
  @scala.inline
  def apply(
    clientId: String,
    content: TokenContent,
    hasApplicationRole: (String, String) => Boolean,
    hasPermission: (String, String) => Boolean,
    hasRealmRole: String => Boolean,
    hasRole: String => Boolean,
    isExpired: () => Boolean,
    token: String
  ): Token = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hasApplicationRole = js.Any.fromFunction2(hasApplicationRole), hasPermission = js.Any.fromFunction2(hasPermission), hasRealmRole = js.Any.fromFunction1(hasRealmRole), hasRole = js.Any.fromFunction1(hasRole), isExpired = js.Any.fromFunction0(isExpired), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TokenContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasApplicationRole(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasApplicationRole")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasPermission(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPermission")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasRealmRole(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRealmRole")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasRole(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRole")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsExpired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSigned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(js.undefined)
        ret
    }
  }
  
}

