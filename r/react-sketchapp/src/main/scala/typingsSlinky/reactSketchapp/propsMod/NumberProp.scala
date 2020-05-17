package typingsSlinky.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait NumberProp
  extends BaselineShift
     with NumberArrayProp

object NumberProp {
  @scala.inline
  implicit def apply(value: Double): NumberProp = value.asInstanceOf[NumberProp]
  @scala.inline
  implicit def apply(value: String): NumberProp = value.asInstanceOf[NumberProp]
}

