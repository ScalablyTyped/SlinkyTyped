package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.None
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Public
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Private
*/
trait ProcessType extends js.Object

object ProcessType {
  @scala.inline
  def None: typingsSlinky.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def Private: typingsSlinky.bpmnModdle.bpmnModdleStrings.Private = this.cast("Private")
  @scala.inline
  def Public: typingsSlinky.bpmnModdle.bpmnModdleStrings.Public = this.cast("Public")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

