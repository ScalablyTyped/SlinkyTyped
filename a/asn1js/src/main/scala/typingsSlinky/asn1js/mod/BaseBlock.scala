package typingsSlinky.asn1js.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "BaseBlock")
@js.native
class BaseBlock[T /* <: LocalValueBlock */] () extends LocalBaseBlock {
  def this(parameters: BaseBlockParams) = this()
  def this(parameters: js.UndefOr[scala.Nothing], valueBlockType: Instantiable0[LocalValueBlock]) = this()
  def this(parameters: BaseBlockParams, valueBlockType: Instantiable0[LocalValueBlock]) = this()
  
  def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  
  var idBlock: LocalIdentificationBlock = js.native
  
  var lenBlock: LocalLengthBlock = js.native
  
  def toBER(): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
  
  var valueBlock: T = js.native
}
