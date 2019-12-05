package typingsSlinky.sane.saneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sane.saneStrings.add
  - typings.sane.saneStrings.change
  - typings.sane.saneStrings.delete
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

