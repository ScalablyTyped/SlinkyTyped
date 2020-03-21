package typingsSlinky.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sane.saneStrings.add
  - typingsSlinky.sane.saneStrings.change
  - typingsSlinky.sane.saneStrings.delete
*/
trait AllEventType extends js.Object

object AllEventType {
  @scala.inline
  def add: typingsSlinky.sane.saneStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.sane.saneStrings.change = this.cast("change")
  @scala.inline
  def delete: typingsSlinky.sane.saneStrings.delete = this.cast("delete")
}

