package typingsSlinky.nodeJose.mod

import typingsSlinky.nodeJose.mod.JWK.Key
import typingsSlinky.nodeJose.mod.JWK.KeyStore
import typingsSlinky.nodeJose.mod.JWS.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "canYouSee")
@js.native
object canYouSee extends js.Object {
  def apply(ks: KeyStore, opts: js.Object): Verifier = js.native
  def apply(ks: Key, opts: js.Object): Verifier = js.native
}

