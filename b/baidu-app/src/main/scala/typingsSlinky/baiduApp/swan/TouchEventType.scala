package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baiduApp.baiduAppStrings.tap
  - typingsSlinky.baiduApp.baiduAppStrings.touchstart
  - typingsSlinky.baiduApp.baiduAppStrings.touchmove
  - typingsSlinky.baiduApp.baiduAppStrings.touchcancel
  - typingsSlinky.baiduApp.baiduAppStrings.touchend
  - typingsSlinky.baiduApp.baiduAppStrings.touchforcechange
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typingsSlinky.baiduApp.baiduAppStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typingsSlinky.baiduApp.baiduAppStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typingsSlinky.baiduApp.baiduAppStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchforcechange: typingsSlinky.baiduApp.baiduAppStrings.touchforcechange = this.cast("touchforcechange")
  @scala.inline
  def touchmove: typingsSlinky.baiduApp.baiduAppStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typingsSlinky.baiduApp.baiduAppStrings.touchstart = this.cast("touchstart")
}

