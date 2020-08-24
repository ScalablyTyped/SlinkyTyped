package typingsSlinky.ethersprojectBignumber

import typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumberish
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/bignumber", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BigNumber protected ()
    extends typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber {
    def this(constructorGuard: js.Any, hex: String) = this()
  }
  
  @js.native
  class FixedFormat protected ()
    extends typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat {
    def this(constructorGuard: js.Any, signed: Boolean, width: Double, decimals: Double) = this()
  }
  
  @js.native
  class FixedNumber protected ()
    extends typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber {
    def this(constructorGuard: js.Any, hex: String, value: String) = this()
    def this(
      constructorGuard: js.Any,
      hex: String,
      value: String,
      format: typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat
    ) = this()
  }
  
  def formatFixed(value: BigNumberish): String = js.native
  def formatFixed(value: BigNumberish, decimals: String): String = js.native
  def formatFixed(value: BigNumberish, decimals: BigNumberish): String = js.native
  def parseFixed(value: String): typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber = js.native
  def parseFixed(value: String, decimals: BigNumberish): typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber = js.native
  /* static members */
  @js.native
  object BigNumber extends js.Object {
    def from(value: js.Any): typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber = js.native
    def isBigNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/bignumber.BigNumber */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FixedFormat extends js.Object {
    def from(value: js.Any): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat = js.native
  }
  
  /* static members */
  @js.native
  object FixedNumber extends js.Object {
    def from(value: js.Any): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def from(value: js.Any, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def from(value: js.Any, format: typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromBytes(value: BytesLike): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromBytes(value: BytesLike, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromBytes(value: BytesLike, format: typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromString(value: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromString(value: String, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromString(value: String, format: typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(
      value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: js.UndefOr[BigNumberish],
      format: String
    ): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(
      value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber,
      decimals: js.UndefOr[BigNumberish],
      format: typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat
    ): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def fromValue(value: typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber, decimals: BigNumberish): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
    def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
  }
  
}

