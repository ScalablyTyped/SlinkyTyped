package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.anon.VerifyOptionscompletetrueComplete
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
    options: VerifyOptions with AccessTokenVerifyOptions
  ): js.Object = js.native
  def verify(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptionscompletetrueComplete): completeResult[Key] = js.native
  def verify(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueComplete): completeResult[NoneKey] = js.native
}
