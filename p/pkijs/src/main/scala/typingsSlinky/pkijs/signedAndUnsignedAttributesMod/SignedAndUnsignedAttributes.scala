package typingsSlinky.pkijs.signedAndUnsignedAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedAndUnsignedAttributes extends js.Object {
  var attributes: js.Array[typingsSlinky.pkijs.attributeMod.default]
  var encodedValue: scala.scalajs.js.typedarray.ArrayBuffer
  var `type`: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignedAndUnsignedAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[typingsSlinky.pkijs.attributeMod.default],
    encodedValue: scala.scalajs.js.typedarray.ArrayBuffer,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    `type`: String
  ): SignedAndUnsignedAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], encodedValue = encodedValue.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedAndUnsignedAttributes]
  }
}

