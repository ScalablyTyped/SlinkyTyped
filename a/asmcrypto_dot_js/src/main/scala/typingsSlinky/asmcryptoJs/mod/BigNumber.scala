package typingsSlinky.asmcryptoJs.mod

import typingsSlinky.asmcryptoJs.anon.BitLength
import typingsSlinky.asmcryptoJs.anon.Gcd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "BigNumber")
@js.native
class BigNumber ()
  extends typingsSlinky.asmcryptoJs.bignumMod.BigNumber {
  def this(num: js.typedarray.Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "BigNumber")
@js.native
object BigNumber extends js.Object {
  var ONE: typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  var ZERO: typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  @JSName("extGCD")
  var extGCD_Original: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
  def extGCD(a: this.type, b: this.type): Gcd = js.native
  def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  def fromConfig(obj: BitLength): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  def fromNumber(num: Double): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  def fromString(str: String): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
}

