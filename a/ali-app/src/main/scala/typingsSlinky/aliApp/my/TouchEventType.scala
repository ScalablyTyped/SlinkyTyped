package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aliApp.aliAppStrings.tap
  - typingsSlinky.aliApp.aliAppStrings.touchstart
  - typingsSlinky.aliApp.aliAppStrings.touchmove
  - typingsSlinky.aliApp.aliAppStrings.touchcancel
  - typingsSlinky.aliApp.aliAppStrings.touchend
  - typingsSlinky.aliApp.aliAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsSlinky.aliApp.aliAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsSlinky.aliApp.aliAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsSlinky.aliApp.aliAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typingsSlinky.aliApp.aliAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typingsSlinky.aliApp.aliAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsSlinky.aliApp.aliAppStrings.touchstart = this.cast("touchstart")
}

