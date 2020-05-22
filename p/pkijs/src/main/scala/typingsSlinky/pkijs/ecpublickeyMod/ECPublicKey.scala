package typingsSlinky.pkijs.ecpublickeyMod

import org.scalajs.dom.crypto.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPublicKey extends js.Object {
  var namedCurve: String
  var x: js.typedarray.ArrayBuffer
  var y: js.typedarray.ArrayBuffer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECPublicKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    namedCurve: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    x: js.typedarray.ArrayBuffer,
    y: js.typedarray.ArrayBuffer
  ): ECPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), namedCurve = namedCurve.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPublicKey]
  }
}

