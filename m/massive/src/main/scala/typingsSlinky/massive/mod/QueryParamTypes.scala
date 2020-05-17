package typingsSlinky.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Object
*/
trait QueryParamTypes extends QueryParams

object QueryParamTypes {
  @scala.inline
  implicit def apply(value: Double): QueryParamTypes = value.asInstanceOf[QueryParamTypes]
  @scala.inline
  implicit def apply(value: js.Object): QueryParamTypes = value.asInstanceOf[QueryParamTypes]
  @scala.inline
  implicit def apply(value: String): QueryParamTypes = value.asInstanceOf[QueryParamTypes]
}

