package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.anon.X
import typingsSlinky.asmcryptoJs.anon.Y
import typingsSlinky.asmcryptoJs.bignumMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/bignum/extgcd", JSImport.Namespace)
@js.native
object extgcdMod extends js.Object {
  @JSName("BigNumber_extGCD")
  def BigNumberExtGCD(a: BigNumber, b: BigNumber): Y = js.native
  @JSName("Number_extGCD")
  def NumberExtGCD(a: Double, b: Double): X = js.native
}

