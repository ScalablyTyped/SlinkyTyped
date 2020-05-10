package typingsSlinky.firebaseFirestore.apiCredentialsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseFirestore.authUserMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /** Extra header values to be passed along with a request */
  var authHeaders: StringDictionary[String] = js.native
  /** Type of token. */
  var `type`: TokenType = js.native
  /**
    * The user with which the token is associated (used for persisting user
    * state on disk, etc.).
    */
  var user: User = js.native
}

object Token {
  @scala.inline
  def apply(authHeaders: StringDictionary[String], `type`: TokenType, user: User): Token = {
    val __obj = js.Dynamic.literal(authHeaders = authHeaders.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

