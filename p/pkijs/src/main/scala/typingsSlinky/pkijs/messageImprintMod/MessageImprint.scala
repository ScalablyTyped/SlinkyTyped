package typingsSlinky.pkijs.messageImprintMod

import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageImprint extends js.Object {
  var hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default
  var hashedMessage: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MessageImprint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    hashedMessage: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): MessageImprint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], hashedMessage = hashedMessage.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[MessageImprint]
  }
}

