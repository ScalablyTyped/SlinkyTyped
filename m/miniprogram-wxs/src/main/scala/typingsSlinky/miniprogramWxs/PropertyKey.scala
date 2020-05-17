package typingsSlinky.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Symbol
*/
trait PropertyKey extends js.Object

object PropertyKey {
  @scala.inline
  implicit def apply(value: Double): PropertyKey = value.asInstanceOf[PropertyKey]
  @scala.inline
  implicit def apply(value: java.lang.String): PropertyKey = value.asInstanceOf[PropertyKey]
  @scala.inline
  implicit def apply(value: js.Symbol): PropertyKey = value.asInstanceOf[PropertyKey]
}

