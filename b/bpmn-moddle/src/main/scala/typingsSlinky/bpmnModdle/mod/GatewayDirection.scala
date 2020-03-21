package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Unspecified
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Converging
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Diverging
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Mixed
*/
trait GatewayDirection extends js.Object

object GatewayDirection {
  @scala.inline
  def Converging: typingsSlinky.bpmnModdle.bpmnModdleStrings.Converging = this.cast("Converging")
  @scala.inline
  def Diverging: typingsSlinky.bpmnModdle.bpmnModdleStrings.Diverging = this.cast("Diverging")
  @scala.inline
  def Mixed: typingsSlinky.bpmnModdle.bpmnModdleStrings.Mixed = this.cast("Mixed")
  @scala.inline
  def Unspecified: typingsSlinky.bpmnModdle.bpmnModdleStrings.Unspecified = this.cast("Unspecified")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

