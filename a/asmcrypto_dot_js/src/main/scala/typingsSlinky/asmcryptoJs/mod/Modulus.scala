package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "Modulus")
@js.native
class Modulus protected ()
  extends typingsSlinky.asmcryptoJs.bignumMod.Modulus {
  def this(number: typingsSlinky.asmcryptoJs.bignumMod.BigNumber) = this()
}
/* static members */
@JSImport("asmcrypto.js", "Modulus")
@js.native
object Modulus extends js.Object {
  
  def _Montgomery_reduce(a: typingsSlinky.asmcryptoJs.bignumMod.BigNumber, n: typingsSlinky.asmcryptoJs.bignumMod.Modulus): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
}
