package typingsSlinky.bagpipes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[js.Any]
  - java.lang.String
  - typingsSlinky.bagpipes.mod.FittingDef
*/
trait PipeDef extends js.Object

object PipeDef {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): PipeDef = value.asInstanceOf[PipeDef]
  @scala.inline
  implicit def apply(value: FittingDef): PipeDef = value.asInstanceOf[PipeDef]
  @scala.inline
  implicit def apply(value: String): PipeDef = value.asInstanceOf[PipeDef]
}

