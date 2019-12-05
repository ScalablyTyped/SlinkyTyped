package typingsSlinky.nodeDashJose.nodeDashJoseMod.JWS

import typingsSlinky.nodeDashJose.Anon_Alg
import typingsSlinky.nodeDashJose.nodeDashJoseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWS.createSign")
@js.native
object createSign extends js.Object {
  def apply(keys: js.Array[Key]): Signer = js.native
  def apply(keys: Key): Signer = js.native
  def apply(options: Anon_Alg, key: js.Array[Key]): Signer = js.native
  def apply(options: Anon_Alg, key: Key): Signer = js.native
}

