package typingsSlinky.asn1js.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalLengthBlock")
@js.native
class LocalLengthBlock () extends LocalBaseBlock {
  def this(params: LocalLengthBlockParams) = this()
  var isIndefiniteForm: scala.Boolean = js.native
  var length: Double = js.native
  var longFormUsed: scala.Boolean = js.native
  def fromBER(inputBuffer: scala.scalajs.js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Unit = js.native
  def toBER(): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

