package typingsSlinky.ethers.mod.ethers

import typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumberish
import typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.FixedNumber")
@js.native
class FixedNumber protected ()
  extends typingsSlinky.ethers.ethersMod.FixedNumber {
  def this(constructorGuard: js.Any, hex: String, value: String) = this()
  def this(constructorGuard: js.Any, hex: String, value: String, format: FixedFormat) = this()
}
/* static members */
@JSImport("ethers", "ethers.FixedNumber")
@js.native
object FixedNumber extends js.Object {
  
  def from(value: js.Any): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromBytes(value: BytesLike): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromString(value: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromValue(value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(
    value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber,
    decimals: js.UndefOr[BigNumberish],
    format: String
  ): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(
    value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber,
    decimals: js.UndefOr[BigNumberish],
    format: FixedFormat
  ): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber, decimals: BigNumberish): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
}
