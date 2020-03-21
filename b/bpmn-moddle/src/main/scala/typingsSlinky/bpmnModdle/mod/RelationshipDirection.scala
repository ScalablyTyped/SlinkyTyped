package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.None
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Forward
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Backward
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Both
*/
trait RelationshipDirection extends js.Object

object RelationshipDirection {
  @scala.inline
  def Backward: typingsSlinky.bpmnModdle.bpmnModdleStrings.Backward = this.cast("Backward")
  @scala.inline
  def Both: typingsSlinky.bpmnModdle.bpmnModdleStrings.Both = this.cast("Both")
  @scala.inline
  def Forward: typingsSlinky.bpmnModdle.bpmnModdleStrings.Forward = this.cast("Forward")
  @scala.inline
  def None: typingsSlinky.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

