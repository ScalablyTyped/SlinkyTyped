package typingsSlinky.pixiJs.PIXI.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pixiJs.pixiJsStrings.touchstart
  - typingsSlinky.pixiJs.pixiJsStrings.touchcancel
  - typingsSlinky.pixiJs.pixiJsStrings.touchend
  - typingsSlinky.pixiJs.pixiJsStrings.touchendoutside
  - typingsSlinky.pixiJs.pixiJsStrings.touchmove
  - typingsSlinky.pixiJs.pixiJsStrings.tap
*/
trait InteractionTouchEvents extends js.Object

object InteractionTouchEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsSlinky.pixiJs.pixiJsStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsSlinky.pixiJs.pixiJsStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsSlinky.pixiJs.pixiJsStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchendoutside: typingsSlinky.pixiJs.pixiJsStrings.touchendoutside = this.cast("touchendoutside")
  @scala.inline
  def touchmove: typingsSlinky.pixiJs.pixiJsStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsSlinky.pixiJs.pixiJsStrings.touchstart = this.cast("touchstart")
}

