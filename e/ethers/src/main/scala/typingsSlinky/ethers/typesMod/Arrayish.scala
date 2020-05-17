package typingsSlinky.ethers.typesMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayLike[scala.Double]
*/
trait Arrayish extends BigNumberish

object Arrayish {
  @scala.inline
  implicit def apply(value: ArrayLike[Double]): Arrayish = value.asInstanceOf[Arrayish]
  @scala.inline
  implicit def apply(value: String): Arrayish = value.asInstanceOf[Arrayish]
}

