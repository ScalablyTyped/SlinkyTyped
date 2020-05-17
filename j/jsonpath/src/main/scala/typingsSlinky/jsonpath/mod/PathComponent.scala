package typingsSlinky.jsonpath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait PathComponent extends js.Object

object PathComponent {
  @scala.inline
  implicit def apply(value: Double): PathComponent = value.asInstanceOf[PathComponent]
  @scala.inline
  implicit def apply(value: String): PathComponent = value.asInstanceOf[PathComponent]
}

