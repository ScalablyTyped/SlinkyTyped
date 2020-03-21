package typingsSlinky.reactStickyBox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactStickyBox.reactStickyBoxStrings.relative
  - typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyBottom
  - typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyTop
*/
trait StickyBoxMode extends js.Object

object StickyBoxMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relative: typingsSlinky.reactStickyBox.reactStickyBoxStrings.relative = this.cast("relative")
  @scala.inline
  def stickyBottom: typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyBottom = this.cast("stickyBottom")
  @scala.inline
  def stickyTop: typingsSlinky.reactStickyBox.reactStickyBoxStrings.stickyTop = this.cast("stickyTop")
}

