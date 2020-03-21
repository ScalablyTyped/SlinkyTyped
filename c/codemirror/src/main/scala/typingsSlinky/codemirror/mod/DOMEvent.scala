package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.codemirror.codemirrorStrings.mousedown
  - typingsSlinky.codemirror.codemirrorStrings.dblclick
  - typingsSlinky.codemirror.codemirrorStrings.touchstart
  - typingsSlinky.codemirror.codemirrorStrings.contextmenu
  - typingsSlinky.codemirror.codemirrorStrings.keydown
  - typingsSlinky.codemirror.codemirrorStrings.keypress
  - typingsSlinky.codemirror.codemirrorStrings.keyup
  - typingsSlinky.codemirror.codemirrorStrings.cut
  - typingsSlinky.codemirror.codemirrorStrings.copy
  - typingsSlinky.codemirror.codemirrorStrings.paste
  - typingsSlinky.codemirror.codemirrorStrings.dragstart
  - typingsSlinky.codemirror.codemirrorStrings.dragenter
  - typingsSlinky.codemirror.codemirrorStrings.dragover
  - typingsSlinky.codemirror.codemirrorStrings.dragleave
  - typingsSlinky.codemirror.codemirrorStrings.drop
*/
trait DOMEvent extends js.Object

object DOMEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contextmenu: typingsSlinky.codemirror.codemirrorStrings.contextmenu = this.cast("contextmenu")
  @scala.inline
  def copy: typingsSlinky.codemirror.codemirrorStrings.copy = this.cast("copy")
  @scala.inline
  def cut: typingsSlinky.codemirror.codemirrorStrings.cut = this.cast("cut")
  @scala.inline
  def dblclick: typingsSlinky.codemirror.codemirrorStrings.dblclick = this.cast("dblclick")
  @scala.inline
  def dragenter: typingsSlinky.codemirror.codemirrorStrings.dragenter = this.cast("dragenter")
  @scala.inline
  def dragleave: typingsSlinky.codemirror.codemirrorStrings.dragleave = this.cast("dragleave")
  @scala.inline
  def dragover: typingsSlinky.codemirror.codemirrorStrings.dragover = this.cast("dragover")
  @scala.inline
  def dragstart: typingsSlinky.codemirror.codemirrorStrings.dragstart = this.cast("dragstart")
  @scala.inline
  def drop: typingsSlinky.codemirror.codemirrorStrings.drop = this.cast("drop")
  @scala.inline
  def keydown: typingsSlinky.codemirror.codemirrorStrings.keydown = this.cast("keydown")
  @scala.inline
  def keypress: typingsSlinky.codemirror.codemirrorStrings.keypress = this.cast("keypress")
  @scala.inline
  def keyup: typingsSlinky.codemirror.codemirrorStrings.keyup = this.cast("keyup")
  @scala.inline
  def mousedown: typingsSlinky.codemirror.codemirrorStrings.mousedown = this.cast("mousedown")
  @scala.inline
  def paste: typingsSlinky.codemirror.codemirrorStrings.paste = this.cast("paste")
  @scala.inline
  def touchstart: typingsSlinky.codemirror.codemirrorStrings.touchstart = this.cast("touchstart")
}

