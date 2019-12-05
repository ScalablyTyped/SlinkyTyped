package typingsSlinky.asn1js.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "RawData")
@js.native
class RawData () extends js.Object {
  def this(params: RawDataParams) = this()
  var data: scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def fromBER(inputBuffer: scala.scalajs.js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def toBER(): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

