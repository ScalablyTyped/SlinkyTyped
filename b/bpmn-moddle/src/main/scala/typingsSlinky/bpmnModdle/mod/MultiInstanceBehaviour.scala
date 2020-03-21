package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.None
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.One
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.All
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Complex
*/
trait MultiInstanceBehaviour extends js.Object

object MultiInstanceBehaviour {
  @scala.inline
  def All: typingsSlinky.bpmnModdle.bpmnModdleStrings.All = this.cast("All")
  @scala.inline
  def Complex: typingsSlinky.bpmnModdle.bpmnModdleStrings.Complex = this.cast("Complex")
  @scala.inline
  def None: typingsSlinky.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def One: typingsSlinky.bpmnModdle.bpmnModdleStrings.One = this.cast("One")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

