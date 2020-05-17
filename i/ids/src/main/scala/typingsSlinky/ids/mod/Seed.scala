package typingsSlinky.ids.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[scala.Double, scala.Double]
  - js.Tuple3[scala.Double, scala.Double, scala.Double]
*/
trait Seed extends js.Object

object Seed {
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): Seed = value.asInstanceOf[Seed]
  @scala.inline
  implicit def apply(value: js.Tuple3[Double, Double, Double]): Seed = value.asInstanceOf[Seed]
}

