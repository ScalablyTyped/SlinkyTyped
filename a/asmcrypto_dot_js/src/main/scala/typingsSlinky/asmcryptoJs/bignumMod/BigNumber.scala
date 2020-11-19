package typingsSlinky.asmcryptoJs.bignumMod

import typingsSlinky.asmcryptoJs.anon.BitLength
import typingsSlinky.asmcryptoJs.anon.Gcd
import typingsSlinky.asmcryptoJs.anon.Quotient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
@js.native
class BigNumber () extends js.Object {
  def this(num: js.typedarray.Uint8Array) = this()
  
  def add(that: BigNumber): BigNumber = js.native
  
  var bitLength: Double = js.native
  
  def clamp(b: Double): BigNumber = js.native
  
  def compare(that: BigNumber): Double = js.native
  
  def divide(that: BigNumber): Quotient = js.native
  
  def isMillerRabinProbablePrime(rounds: Double): Boolean = js.native
  
  def isProbablePrime(): Boolean = js.native
  def isProbablePrime(paranoia: Double): Boolean = js.native
  
  var limbs: js.typedarray.Uint32Array = js.native
  
  def multiply(that: BigNumber): BigNumber = js.native
  
  def negate(): BigNumber = js.native
  
  var sign: Double = js.native
  
  def slice(f: Double): BigNumber = js.native
  def slice(f: Double, b: Double): BigNumber = js.native
  
  def square(): BigNumber = js.native
  
  def subtract(that: BigNumber): BigNumber = js.native
  
  def toBytes(): js.typedarray.Uint8Array = js.native
  
  def toString(radix: Double): String = js.native
}
/* static members */
@JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
@js.native
object BigNumber extends js.Object {
  
  var ONE: BigNumber = js.native
  
  var ZERO: BigNumber = js.native
  
  def extGCD(a: this.type, b: this.type): Gcd = js.native
  @JSName("extGCD")
  var extGCD_Original: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
  
  def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): BigNumber = js.native
  
  def fromConfig(obj: BitLength): BigNumber = js.native
  
  def fromNumber(num: Double): BigNumber = js.native
  
  def fromString(str: String): BigNumber = js.native
}
