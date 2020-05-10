package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalOctetStringValueBlock")
@js.native
class LocalOctetStringValueBlock ()
  extends LocalConstructedValueBlock
     with ILocalHexBlock {
  def this(params: LocalOctetStringValueBlockParams) = this()
  var isConstructed: scala.Boolean = js.native
  /* InferMemberOverrides */
  override def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Unit with Double = js.native
  /* InferMemberOverrides */
  override def toBER(): js.typedarray.ArrayBuffer = js.native
  /* InferMemberOverrides */
  override def toBER(sizeOnly: scala.Boolean): js.typedarray.ArrayBuffer = js.native
  /**
    * Convertion for the block to JSON object
    * 
    * @returns {JsonLocalBaseBlock}
    * 
    * @memberOf LocalBaseBlock
    */
  /* InferMemberOverrides */
  override def toJSON(): JsonLocalBaseBlock with js.Any = js.native
}

