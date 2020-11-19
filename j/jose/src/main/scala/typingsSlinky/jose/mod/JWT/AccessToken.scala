package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.joseStrings.atPlussignJWT
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.AccessToken")
@js.native
object AccessToken extends js.Object {
  
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions[`false`] with VerifyProfileOptions[atPlussignJWT]
  ): js.Object = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]): completeResult[NoneKey] = js.native
  @JSName("verify")
  def verify_completeResult(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptions[`true`] with VerifyProfileOptions[atPlussignJWT]
  ): completeResult[Key] = js.native
}
