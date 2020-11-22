package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.ethers.mod.ethers.FixedNumber
import typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumber
import typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumberish
import typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedFormat
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFixedNumber
  extends Instantiable3[/* constructorGuard */ js.Any, /* hex */ String, /* value */ String, FixedNumber] {
  
  def from(value: js.Any): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def from(value: js.Any, format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromBytes(value: BytesLike): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromBytes(value: BytesLike, format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromString(value: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromString(value: String, format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def fromValue(value: BigNumber): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: String): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: js.UndefOr[BigNumberish], format: FixedFormat): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  def fromValue(value: BigNumber, decimals: BigNumberish): typingsSlinky.ethersprojectBignumber.fixednumberMod.FixedNumber = js.native
  
  def isFixedNumber(value: js.Any): /* is @ethersproject/bignumber.@ethersproject/bignumber/lib/fixednumber.FixedNumber */ Boolean = js.native
}
