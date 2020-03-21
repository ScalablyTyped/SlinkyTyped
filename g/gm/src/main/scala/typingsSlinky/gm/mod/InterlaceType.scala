package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gm.gmStrings.None
  - typingsSlinky.gm.gmStrings.Line
  - typingsSlinky.gm.gmStrings.Plane
  - typingsSlinky.gm.gmStrings.Partition
*/
trait InterlaceType extends js.Object

object InterlaceType {
  @scala.inline
  def Line: typingsSlinky.gm.gmStrings.Line = this.cast("Line")
  @scala.inline
  def None: typingsSlinky.gm.gmStrings.None = this.cast("None")
  @scala.inline
  def Partition: typingsSlinky.gm.gmStrings.Partition = this.cast("Partition")
  @scala.inline
  def Plane: typingsSlinky.gm.gmStrings.Plane = this.cast("Plane")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

