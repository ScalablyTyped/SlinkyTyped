package typingsSlinky.lodashDecorators.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function
*/
trait ResolvableFunction extends js.Object

object ResolvableFunction {
  @scala.inline
  implicit def apply(value: js.Function): ResolvableFunction = value.asInstanceOf[ResolvableFunction]
  @scala.inline
  implicit def apply(value: String): ResolvableFunction = value.asInstanceOf[ResolvableFunction]
}

