package typingsSlinky.nodeJose.mod.JWS

import typingsSlinky.nodeJose.anon.Algorithms
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
  def apply(input: String, opts: Algorithms): Verifier = js.native
  def apply(input: js.Object): Verifier = js.native
  def apply(input: js.Object, opts: Algorithms): Verifier = js.native
  def apply(input: Key): Verifier = js.native
  def apply(input: KeyStore): Verifier = js.native
  def apply(input: KeyStore, opts: Algorithms): Verifier = js.native
  def apply(input: Key, opts: Algorithms): Verifier = js.native
}

