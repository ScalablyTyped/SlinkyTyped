package typingsSlinky.cwise.mod

import typingsSlinky.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ndarray.mod.ndarray[scala.Double]
  - js.Function2[/ * row * / scala.Double, / * col * / scala.Double, scala.Double]
  - js.Array[scala.Double]
  - js.Any
*/
trait Arg extends js.Object

object Arg {
  @scala.inline
  implicit def apply(value: js.Any): Arg = value.asInstanceOf[Arg]
  @scala.inline
  implicit def apply(value: js.Array[Double]): Arg = value.asInstanceOf[Arg]
  @scala.inline
  implicit def apply(value: js.Function2[/* row */ Double, /* col */ Double, Double]): Arg = value.asInstanceOf[Arg]
  @scala.inline
  implicit def apply(value: ndarray[Double]): Arg = value.asInstanceOf[Arg]
}

