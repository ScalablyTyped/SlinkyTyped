package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "RawData")
@js.native
class RawData () extends js.Object {
  def this(params: RawDataParams) = this()
  var data: js.typedarray.ArrayBuffer = js.native
  def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def toBER(): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
}

