package typingsSlinky.bignum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Anything that can be converted to BigNum. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bignum.mod.BigNum
  - scala.Double
  - java.lang.String
*/
trait BigNumCompatible extends js.Object

object BigNumCompatible {
  @scala.inline
  implicit def apply(value: BigNum): BigNumCompatible = value.asInstanceOf[BigNumCompatible]
  @scala.inline
  implicit def apply(value: Double): BigNumCompatible = value.asInstanceOf[BigNumCompatible]
  @scala.inline
  implicit def apply(value: String): BigNumCompatible = value.asInstanceOf[BigNumCompatible]
}

