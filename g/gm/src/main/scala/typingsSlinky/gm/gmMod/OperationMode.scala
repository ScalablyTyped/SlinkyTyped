package typingsSlinky.gm.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.frame
  - typings.gm.gmStrings.unframe
  - typings.gm.gmStrings.concatenate
*/
trait OperationMode extends js.Object

object OperationMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def concatenate: typingsSlinky.gm.gmStrings.concatenate = this.cast("concatenate")
  @scala.inline
  def frame: typingsSlinky.gm.gmStrings.frame = this.cast("frame")
  @scala.inline
  def unframe: typingsSlinky.gm.gmStrings.unframe = this.cast("unframe")
}

