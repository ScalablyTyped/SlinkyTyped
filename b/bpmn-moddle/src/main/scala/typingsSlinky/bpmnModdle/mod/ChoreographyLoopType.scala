package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.None
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Standard
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.MultiInstanceSequential
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.MultiInstanceParallel
*/
trait ChoreographyLoopType extends js.Object

object ChoreographyLoopType {
  @scala.inline
  def MultiInstanceParallel: typingsSlinky.bpmnModdle.bpmnModdleStrings.MultiInstanceParallel = this.cast("MultiInstanceParallel")
  @scala.inline
  def MultiInstanceSequential: typingsSlinky.bpmnModdle.bpmnModdleStrings.MultiInstanceSequential = this.cast("MultiInstanceSequential")
  @scala.inline
  def None: typingsSlinky.bpmnModdle.bpmnModdleStrings.None = this.cast("None")
  @scala.inline
  def Standard: typingsSlinky.bpmnModdle.bpmnModdleStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

