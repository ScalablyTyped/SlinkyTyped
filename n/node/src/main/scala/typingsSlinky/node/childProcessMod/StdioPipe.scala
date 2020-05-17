package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.node.nodeStrings.pipe
*/
trait StdioPipe extends js.Object

object StdioPipe {
  @scala.inline
  def pipe: typingsSlinky.node.nodeStrings.pipe = "pipe".asInstanceOf[typingsSlinky.node.nodeStrings.pipe]
  @scala.inline
  implicit def apply(value: Null): StdioPipe = value.asInstanceOf[StdioPipe]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => StdioPipe): StdioPipe = value.asInstanceOf[StdioPipe]
}

