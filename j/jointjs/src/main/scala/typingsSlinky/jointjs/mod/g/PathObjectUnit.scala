package typingsSlinky.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jointjs.mod.g.Line
  - js.Array[typingsSlinky.jointjs.mod.g.Curve | typingsSlinky.jointjs.mod.g.Line]
  - typingsSlinky.jointjs.mod.g.Curve
*/
trait PathObjectUnit extends js.Object

object PathObjectUnit {
  @scala.inline
  implicit def apply(value: js.Array[Curve | Line]): PathObjectUnit = value.asInstanceOf[PathObjectUnit]
  @scala.inline
  implicit def apply(value: Curve): PathObjectUnit = value.asInstanceOf[PathObjectUnit]
  @scala.inline
  implicit def apply(value: Line): PathObjectUnit = value.asInstanceOf[PathObjectUnit]
}

