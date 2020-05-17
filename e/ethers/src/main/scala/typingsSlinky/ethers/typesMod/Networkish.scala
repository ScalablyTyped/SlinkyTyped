package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ethers.typesMod.Network
  - java.lang.String
  - scala.Double
*/
trait Networkish extends js.Object

object Networkish {
  @scala.inline
  implicit def apply(value: Double): Networkish = value.asInstanceOf[Networkish]
  @scala.inline
  implicit def apply(value: Network): Networkish = value.asInstanceOf[Networkish]
  @scala.inline
  implicit def apply(value: String): Networkish = value.asInstanceOf[Networkish]
}

