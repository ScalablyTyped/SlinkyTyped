package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The code cell's prompt number. Will be null if the cell has not been run.
  */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - scala.Null
*/
trait ExecutionCount extends js.Object

object ExecutionCount {
  @scala.inline
  implicit def apply(value: Double): ExecutionCount = value.asInstanceOf[ExecutionCount]
  @scala.inline
  implicit def apply(value: Null): ExecutionCount = value.asInstanceOf[ExecutionCount]
}

