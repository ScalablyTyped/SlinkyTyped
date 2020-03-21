package typingsSlinky.jose.mod.JWS

import typingsSlinky.jose.joseBooleans.`false`
import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.verify")
@js.native
object verify_false extends js.Object {
  def apply(jws: String, key: ConsumeKeyInputWithNone, options: VerifyOptions[`false`, `false`]): Buffer = js.native
  def apply(jws: FlattenedJWS, key: ConsumeKeyInputWithNone, options: VerifyOptions[`false`, `false`]): Buffer = js.native
  def apply(jws: GeneralJWS, key: ConsumeKeyInputWithNone, options: VerifyOptions[`false`, `false`]): Buffer = js.native
}

