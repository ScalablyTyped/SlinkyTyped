package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Parallel
  - typingsSlinky.bpmnModdle.bpmnModdleStrings.Exclusive
*/
trait EventBasedGatewayType extends js.Object

object EventBasedGatewayType {
  @scala.inline
  def Exclusive: typingsSlinky.bpmnModdle.bpmnModdleStrings.Exclusive = this.cast("Exclusive")
  @scala.inline
  def Parallel: typingsSlinky.bpmnModdle.bpmnModdleStrings.Parallel = this.cast("Parallel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

