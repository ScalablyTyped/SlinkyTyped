package typingsSlinky.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Symbol
*/
trait KeyOfProperty extends js.Object

object KeyOfProperty {
  @scala.inline
  implicit def apply(value: Double): KeyOfProperty = value.asInstanceOf[KeyOfProperty]
  @scala.inline
  implicit def apply(value: java.lang.String): KeyOfProperty = value.asInstanceOf[KeyOfProperty]
  @scala.inline
  implicit def apply(value: js.Symbol): KeyOfProperty = value.asInstanceOf[KeyOfProperty]
}

