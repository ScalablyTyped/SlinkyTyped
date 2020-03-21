package typingsSlinky.nodeJose.mod.JWS

import typingsSlinky.nodeJose.AnonAlgorithms
import typingsSlinky.nodeJose.mod.JWK.Key
import typingsSlinky.nodeJose.mod.JWK.KeyStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWS.createVerify")
@js.native
object createVerify extends js.Object {
  /**
    * Using a keystore.
    */
  def apply(): Verifier = js.native
  def apply(input: String): Verifier = js.native
  def apply(input: String, opts: AnonAlgorithms): Verifier = js.native
  def apply(input: js.Object): Verifier = js.native
  def apply(input: js.Object, opts: AnonAlgorithms): Verifier = js.native
  def apply(input: Key): Verifier = js.native
  def apply(input: KeyStore): Verifier = js.native
  def apply(input: KeyStore, opts: AnonAlgorithms): Verifier = js.native
  def apply(input: Key, opts: AnonAlgorithms): Verifier = js.native
}

