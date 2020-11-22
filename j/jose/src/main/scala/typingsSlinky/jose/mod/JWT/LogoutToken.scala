package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.anon.VerifyOptionscompletetrueClockTolerance
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.LogoutToken")
@js.native
object LogoutToken extends js.Object {
  
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions with LogoutTokenVerifyOptions
  ): js.Object = js.native
  def verify(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptionscompletetrueClockTolerance
  ): completeResult[Key] = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueClockTolerance): completeResult[NoneKey] = js.native
}
