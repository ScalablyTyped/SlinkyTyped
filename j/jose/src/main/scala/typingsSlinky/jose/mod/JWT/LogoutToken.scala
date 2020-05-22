package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.joseStrings.logout_token
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.LogoutToken")
@js.native
object LogoutToken extends js.Object {
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`] with VerifyProfileOptions[logout_token]
  ): js.Object = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[logout_token]): completeResult[NoneKey] = js.native
  @JSName("verify")
  def verify_completeResult(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptions[`true`] with VerifyProfileOptions[logout_token]
  ): completeResult[Key] = js.native
}

