package typingsSlinky.bigInteger.mod

import typingsSlinky.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.std.BigInt
  - java.lang.String
  - typingsSlinky.bigInteger.mod.BigInteger
*/
trait BigNumber extends js.Object

object BigNumber {
  @scala.inline
  implicit def apply(value: BigInt): BigNumber = value.asInstanceOf[BigNumber]
  @scala.inline
  implicit def apply(value: BigInteger): BigNumber = value.asInstanceOf[BigNumber]
  @scala.inline
  implicit def apply(value: Double): BigNumber = value.asInstanceOf[BigNumber]
  @scala.inline
  implicit def apply(value: String): BigNumber = value.asInstanceOf[BigNumber]
}

