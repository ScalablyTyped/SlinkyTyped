package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.joseBooleans.`true`
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.jose.mod.EmbeddedVerifyKeys
import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.verify")
@js.native
object verify_true extends js.Object {
  
  def apply(jwt: String, key: ConsumeKeyInput | EmbeddedVerifyKeys, options: VerifyOptions[`true`]): completeResult[Key] = js.native
  def apply(jwt: String, key: NoneKey, options: VerifyOptions[`true`]): completeResult[NoneKey] = js.native
}
