package typingsSlinky.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* menus types */
/**
  * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other
  * contexts except for 'tab' and 'tools_menu'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.all
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.page
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.password
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.video
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.all = this.cast("all")
  @scala.inline
  def audio: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio = this.cast("audio")
  @scala.inline
  def bookmark: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  def browser_action: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action = this.cast("browser_action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame = this.cast("frame")
  @scala.inline
  def image: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = this.cast("image")
  @scala.inline
  def launcher: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher = this.cast("launcher")
  @scala.inline
  def link: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = this.cast("link")
  @scala.inline
  def page: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.page = this.cast("page")
  @scala.inline
  def page_action: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action = this.cast("page_action")
  @scala.inline
  def password: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.password = this.cast("password")
  @scala.inline
  def selection: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection = this.cast("selection")
  @scala.inline
  def tab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
  @scala.inline
  def tools_menu: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu = this.cast("tools_menu")
  @scala.inline
  def video: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.video = this.cast("video")
}

