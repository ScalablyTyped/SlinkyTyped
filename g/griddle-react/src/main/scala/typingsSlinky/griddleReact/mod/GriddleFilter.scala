package typingsSlinky.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.griddleReact.mod.RowFilter
  - typingsSlinky.griddleReact.mod.PropertyBag[java.lang.String | typingsSlinky.griddleReact.mod.RowFilter]
*/
trait GriddleFilter extends js.Object

object GriddleFilter {
  @scala.inline
  implicit def apply(value: PropertyBag[String | RowFilter]): GriddleFilter = value.asInstanceOf[GriddleFilter]
  @scala.inline
  implicit def apply(value: RowFilter): GriddleFilter = value.asInstanceOf[GriddleFilter]
  @scala.inline
  implicit def apply(value: String): GriddleFilter = value.asInstanceOf[GriddleFilter]
}

