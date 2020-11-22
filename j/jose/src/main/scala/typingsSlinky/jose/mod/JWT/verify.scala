package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.anon.VerifyOptionscompletetrueAlgorithms
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.verify")
@js.native
object verify extends js.Object {
  
  def apply(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys): js.Object = js.native
  def apply(
    jwt: String,
    key: ConsumeKeyInput | EmbeddedVerifyKeys,
    options: VerifyOptionscompletetrueAlgorithms
  ): completeResult[Key] = js.native
  def apply(jwt: String, key: ConsumeKeyInputWithNone | EmbeddedVerifyKeys, options: VerifyOptions): js.Object = js.native
  def apply(jwt: String, key: NoneKey, options: VerifyOptionscompletetrueAlgorithms): completeResult[NoneKey] = js.native
}
