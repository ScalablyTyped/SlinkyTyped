package typingsSlinky.reactNumericInput.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Function1[
/ * component * / typingsSlinky.reactNumericInput.mod.NumericInput, 
js.UndefOr[scala.Double]]
*/
trait BoundsFunctionProp extends js.Object

object BoundsFunctionProp {
  @scala.inline
  implicit def apply(value: Double): BoundsFunctionProp = value.asInstanceOf[BoundsFunctionProp]
  @scala.inline
  implicit def apply(value: js.Function1[ReactComponentClass[NumericInputProps], js.UndefOr[Double]]): BoundsFunctionProp = value.asInstanceOf[BoundsFunctionProp]
}

