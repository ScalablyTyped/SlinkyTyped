package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.anon.VerifyOptionscompletetrueAudience
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.IdToken")
@js.native
object IdToken extends js.Object {
  
  def verify(
    jwt: String,
    key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys,
    options: VerifyOptions with IdTokenVerifyOptions
  ): js.Object = js.native
  def verify(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrueAudience): completeResult[Key] = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAudience): completeResult[NoneKey] = js.native
}
