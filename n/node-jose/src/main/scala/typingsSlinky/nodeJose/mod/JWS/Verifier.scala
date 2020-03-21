package typingsSlinky.nodeJose.mod.JWS

import typingsSlinky.nodeJose.AnonAllowEmbeddedKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verifier extends js.Object {
  def verify(input: String): js.Promise[VerificationResult] = js.native
  def verify(input: String, opts: AnonAllowEmbeddedKey): js.Promise[VerificationResult] = js.native
}

