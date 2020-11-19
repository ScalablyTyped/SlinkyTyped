package typingsSlinky.jose.mod.JWE

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.mod.ConsumeKeyInput
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWE.decrypt")
@js.native
object decrypt_false extends js.Object {
  
  def apply(jwe: String, key: ConsumeKeyInput, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: FlattenedJWE, key: ConsumeKeyInput, options: DecryptOptions[`false`]): Buffer = js.native
  def apply(jwe: GeneralJWE, key: ConsumeKeyInput, options: DecryptOptions[`false`]): Buffer = js.native
}
