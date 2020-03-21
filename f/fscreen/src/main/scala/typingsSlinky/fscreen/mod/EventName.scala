package typingsSlinky.fscreen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fscreen.fscreenStrings.fullscreenEnabled
  - typingsSlinky.fscreen.fscreenStrings.fullscreenElement
  - typingsSlinky.fscreen.fscreenStrings.requestFullscreen
  - typingsSlinky.fscreen.fscreenStrings.exitFullscreen
  - typingsSlinky.fscreen.fscreenStrings.fullscreenchange
  - typingsSlinky.fscreen.fscreenStrings.fullscreenerror
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exitFullscreen: typingsSlinky.fscreen.fscreenStrings.exitFullscreen = this.cast("exitFullscreen")
  @scala.inline
  def fullscreenElement: typingsSlinky.fscreen.fscreenStrings.fullscreenElement = this.cast("fullscreenElement")
  @scala.inline
  def fullscreenEnabled: typingsSlinky.fscreen.fscreenStrings.fullscreenEnabled = this.cast("fullscreenEnabled")
  @scala.inline
  def fullscreenchange: typingsSlinky.fscreen.fscreenStrings.fullscreenchange = this.cast("fullscreenchange")
  @scala.inline
  def fullscreenerror: typingsSlinky.fscreen.fscreenStrings.fullscreenerror = this.cast("fullscreenerror")
  @scala.inline
  def requestFullscreen: typingsSlinky.fscreen.fscreenStrings.requestFullscreen = this.cast("requestFullscreen")
}

