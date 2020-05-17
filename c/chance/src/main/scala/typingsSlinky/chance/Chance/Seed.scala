package typingsSlinky.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
*/
trait Seed extends js.Object

object Seed {
  @scala.inline
  implicit def apply(value: Double): Seed = value.asInstanceOf[Seed]
  @scala.inline
  implicit def apply(value: String): Seed = value.asInstanceOf[Seed]
}

