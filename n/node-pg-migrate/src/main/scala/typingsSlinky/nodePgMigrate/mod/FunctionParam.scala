package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.nodePgMigrate.mod.FunctionParamType
*/
trait FunctionParam extends js.Object

object FunctionParam {
  @scala.inline
  implicit def apply(value: FunctionParamType): FunctionParam = value.asInstanceOf[FunctionParam]
  @scala.inline
  implicit def apply(value: String): FunctionParam = value.asInstanceOf[FunctionParam]
}

