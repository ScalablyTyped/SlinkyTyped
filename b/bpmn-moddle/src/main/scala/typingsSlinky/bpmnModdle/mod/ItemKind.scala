package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Physical
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Information
*/
trait ItemKind extends js.Object

object ItemKind {
  @scala.inline
  def Information: typingsSlinky.bpmnModdle.bpmnModdleStrings.Information = this.cast("Information")
  @scala.inline
  def Physical: typingsSlinky.bpmnModdle.bpmnModdleStrings.Physical = this.cast("Physical")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

