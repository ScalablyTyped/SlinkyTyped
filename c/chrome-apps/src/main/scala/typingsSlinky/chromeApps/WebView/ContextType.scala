package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chromeAppsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts.
  **/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.all_
  - typingsSlinky.chromeApps.chromeAppsStrings.page
  - typingsSlinky.chromeApps.chromeAppsStrings.frame
  - typingsSlinky.chromeApps.chromeAppsStrings.selection
  - typingsSlinky.chromeApps.chromeAppsStrings.link
  - typingsSlinky.chromeApps.chromeAppsStrings.editable
  - typingsSlinky.chromeApps.chromeAppsStrings.image
  - typingsSlinky.chromeApps.chromeAppsStrings.video
  - typingsSlinky.chromeApps.chromeAppsStrings.audio
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  def audio: typingsSlinky.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typingsSlinky.chromeApps.chromeAppsStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typingsSlinky.chromeApps.chromeAppsStrings.frame = this.cast("frame")
  @scala.inline
  def image: typingsSlinky.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def link: typingsSlinky.chromeApps.chromeAppsStrings.link = this.cast("link")
  @scala.inline
  def page: typingsSlinky.chromeApps.chromeAppsStrings.page = this.cast("page")
  @scala.inline
  def selection: typingsSlinky.chromeApps.chromeAppsStrings.selection = this.cast("selection")
  @scala.inline
  def video: typingsSlinky.chromeApps.chromeAppsStrings.video = this.cast("video")
}

