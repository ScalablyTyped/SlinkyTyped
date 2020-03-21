package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.None
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.One
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Both
*/
trait AssociationDirection extends js.Object

object AssociationDirection {
  @scala.inline
  def Both: typingsSlinky.bpmnModdle.bpmnModdleStrings.Both = this.cast("Both")
  @scala.inline
  def None: typingsSlinky.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def One: typingsSlinky.bpmnModdle.bpmnModdleStrings.One = this.cast("One")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

