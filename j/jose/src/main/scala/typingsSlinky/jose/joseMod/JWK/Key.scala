package typingsSlinky.jose.joseMod.JWK

import typingsSlinky.jose.joseMod._ProduceKeyInput
import typingsSlinky.jose.joseMod.keyObjectTypes
import typingsSlinky.jose.joseMod.keyOperation
import typingsSlinky.jose.joseMod.keyType
import typingsSlinky.node.cryptoMod.KeyObject
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.Key")
@js.native
class Key () extends _ProduceKeyInput {
  var alg: js.UndefOr[String] = js.native
  var keyObject: KeyObject = js.native
  var key_ops: js.UndefOr[js.Array[keyOperation]] = js.native
  var kid: String = js.native
  var kty: keyType = js.native
  var `private`: Boolean = js.native
  var public: Boolean = js.native
  var secret: Boolean = js.native
  var thumbprint: String = js.native
  var `type`: keyObjectTypes = js.native
  var use: js.UndefOr[typingsSlinky.jose.joseMod.use] = js.native
  var x5c: js.UndefOr[js.Array[String]] = js.native
  var x5t: js.UndefOr[String] = js.native
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
  def toPEM(): String = js.native
  def toPEM(`private`: Boolean): String = js.native
  def toPEM(`private`: Boolean, encoding: pemEncodingOptions): String = js.native
}

