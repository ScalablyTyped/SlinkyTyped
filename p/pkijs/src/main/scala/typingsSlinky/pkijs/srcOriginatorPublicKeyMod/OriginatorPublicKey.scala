package typingsSlinky.pkijs.srcOriginatorPublicKeyMod

import typingsSlinky.asn1js.asn1jsMod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorPublicKey extends js.Object {
  var algorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default
  var publicKey: BitString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorPublicKey {
  @scala.inline
  def apply(
    algorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    publicKey: BitString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OriginatorPublicKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OriginatorPublicKey]
  }
}

