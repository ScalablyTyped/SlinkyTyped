package typingsSlinky.nodeJose.mod.JWE

import typingsSlinky.nodeJose.anon.ContentAlg
import typingsSlinky.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWE.createEncrypt")
@js.native
object createEncrypt extends js.Object {
  def apply(keys: js.Array[Key]): Encryptor = js.native
  def apply(keys: Key): Encryptor = js.native
  def apply(options: ContentAlg, key: Key): Encryptor = js.native
}

