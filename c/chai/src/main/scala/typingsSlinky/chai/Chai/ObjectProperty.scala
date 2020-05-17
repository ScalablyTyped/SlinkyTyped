package typingsSlinky.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
  - scala.Double
*/
trait ObjectProperty extends js.Object

object ObjectProperty {
  @scala.inline
  implicit def apply(value: Double): ObjectProperty = value.asInstanceOf[ObjectProperty]
  @scala.inline
  implicit def apply(value: String): ObjectProperty = value.asInstanceOf[ObjectProperty]
  @scala.inline
  implicit def apply(value: js.Symbol): ObjectProperty = value.asInstanceOf[ObjectProperty]
}

