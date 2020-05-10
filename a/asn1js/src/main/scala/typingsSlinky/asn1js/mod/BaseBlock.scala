package typingsSlinky.asn1js.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "BaseBlock")
@js.native
class BaseBlock[T /* <: LocalValueBlock */] () extends LocalBaseBlock {
  def this(parameters: BaseBlockParams) = this()
  def this(parameters: BaseBlockParams, valueBlockType: Instantiable0[LocalValueBlock]) = this()
  var idBlock: LocalIdentificationBlock = js.native
  var lenBlock: LocalLengthBlock = js.native
  var valueBlock: T = js.native
  def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def toBER(): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
}

