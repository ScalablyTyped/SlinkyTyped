package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.anon.X
import typingsSlinky.asmcryptoJs.anon.Y
import typingsSlinky.asmcryptoJs.bignumMod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extgcdMod {
  
  @JSImport("asmcrypto.js/dist_es8/bignum/extgcd", "BigNumber_extGCD")
  @js.native
  def BigNumberExtGCD(a: BigNumber, b: BigNumber): Y = js.native
  
  @JSImport("asmcrypto.js/dist_es8/bignum/extgcd", "Number_extGCD")
  @js.native
  def NumberExtGCD(a: Double, b: Double): X = js.native
}
