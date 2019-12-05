package typingsSlinky.sane.saneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sane.saneStrings.ready
  - typings.sane.saneStrings.error
  - typings.sane.saneStrings.all
  - typings.sane.saneStrings.add
  - typings.sane.saneStrings.change
  - typings.sane.saneStrings.delete
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def add: typingsSlinky.sane.saneStrings.add = this.cast("add")
  @scala.inline
  def all: typingsSlinky.sane.saneStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.sane.saneStrings.change = this.cast("change")
  @scala.inline
  def delete: typingsSlinky.sane.saneStrings.delete = this.cast("delete")
  @scala.inline
  def error: typingsSlinky.sane.saneStrings.error = this.cast("error")
  @scala.inline
  def ready: typingsSlinky.sane.saneStrings.ready = this.cast("ready")
}

