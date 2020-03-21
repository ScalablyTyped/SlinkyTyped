package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blessed.blessedStrings.resize
  - typingsSlinky.blessed.blessedStrings.prerender
  - typingsSlinky.blessed.blessedStrings.render
  - typingsSlinky.blessed.blessedStrings.destroy
  - typingsSlinky.blessed.blessedStrings.move
  - typingsSlinky.blessed.blessedStrings.show
  - typingsSlinky.blessed.blessedStrings.hide
  - typingsSlinky.blessed.blessedStrings.`set content`
  - typingsSlinky.blessed.blessedStrings.`parsed content`
*/
trait NodeGenericEventType extends js.Object

object NodeGenericEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typingsSlinky.blessed.blessedStrings.destroy = this.cast("destroy")
  @scala.inline
  def hide: typingsSlinky.blessed.blessedStrings.hide = this.cast("hide")
  @scala.inline
  def move: typingsSlinky.blessed.blessedStrings.move = this.cast("move")
  @scala.inline
  def `parsed content`: typingsSlinky.blessed.blessedStrings.`parsed content` = this.cast("parsed content")
  @scala.inline
  def prerender: typingsSlinky.blessed.blessedStrings.prerender = this.cast("prerender")
  @scala.inline
  def render: typingsSlinky.blessed.blessedStrings.render = this.cast("render")
  @scala.inline
  def resize: typingsSlinky.blessed.blessedStrings.resize = this.cast("resize")
  @scala.inline
  def `set content`: typingsSlinky.blessed.blessedStrings.`set content` = this.cast("set content")
  @scala.inline
  def show: typingsSlinky.blessed.blessedStrings.show = this.cast("show")
}

