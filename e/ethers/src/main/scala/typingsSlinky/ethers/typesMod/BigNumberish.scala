package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethers.typesMod.BigNumber
  - java.lang.String
  - scala.Double
  - typingsSlinky.ethers.typesMod.Arrayish
*/
trait BigNumberish extends js.Object

object BigNumberish {
  @scala.inline
  implicit def apply(value: Arrayish): BigNumberish = value.asInstanceOf[BigNumberish]
  @scala.inline
  implicit def apply(value: BigNumber): BigNumberish = value.asInstanceOf[BigNumberish]
  @scala.inline
  implicit def apply(value: Double): BigNumberish = value.asInstanceOf[BigNumberish]
  @scala.inline
  implicit def apply(value: String): BigNumberish = value.asInstanceOf[BigNumberish]
}

