package typingsSlinky.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcTreeSelect.rcTreeSelectStrings.option
  - typingsSlinky.rcTreeSelect.rcTreeSelectStrings.selection
  - typingsSlinky.rcTreeSelect.rcTreeSelectStrings.input
  - typingsSlinky.rcTreeSelect.rcTreeSelectStrings.clear
*/
trait SelectSource extends js.Object

object SelectSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.clear = this.cast("clear")
  @scala.inline
  def input: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.input = this.cast("input")
  @scala.inline
  def option: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.option = this.cast("option")
  @scala.inline
  def selection: typingsSlinky.rcTreeSelect.rcTreeSelectStrings.selection = this.cast("selection")
}

