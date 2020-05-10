package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.BigNumber
import typingsSlinky.ethers.typesMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/bytes", JSImport.Namespace)
@js.native
object bytesMod extends js.Object {
  val AddressZero: /* "0x0000000000000000000000000000000000000000" */ String = js.native
  val HashZero: /* "0x0000000000000000000000000000000000000000000000000000000000000000" */ String = js.native
  def arrayify(value: Arrayish): js.typedarray.Uint8Array = js.native
  def arrayify(value: BigNumber): js.typedarray.Uint8Array = js.native
  def concat(objects: js.Array[Arrayish]): js.typedarray.Uint8Array = js.native
  def hexDataLength(data: String): Double = js.native
  def hexDataSlice(data: String, offset: Double): String = js.native
  def hexDataSlice(data: String, offset: Double, length: Double): String = js.native
  def hexStripZeros(value: String): String = js.native
  def hexZeroPad(value: String, length: Double): String = js.native
  def hexlify(value: Double): String = js.native
  def hexlify(value: Arrayish): String = js.native
  def hexlify(value: BigNumber): String = js.native
  def isArrayish(value: js.Any): Boolean = js.native
  def isHexString(value: js.Any): Boolean = js.native
  def isHexString(value: js.Any, length: Double): Boolean = js.native
  def joinSignature(signature: Signature): String = js.native
  def padZeros(value: Arrayish, length: Double): js.typedarray.Uint8Array = js.native
  def splitSignature(signature: Arrayish): Signature = js.native
  def splitSignature(signature: Signature): Signature = js.native
  def stripZeros(value: Arrayish): js.typedarray.Uint8Array = js.native
}

