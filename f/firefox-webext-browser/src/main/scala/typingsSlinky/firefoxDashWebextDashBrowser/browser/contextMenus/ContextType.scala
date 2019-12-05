package typingsSlinky.firefoxDashWebextDashBrowser.browser.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contextMenus types */
/**
  * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other
  * contexts except for 'tab' and 'tools_menu'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.all
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.page
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.frame
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.selection
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.link
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.editable
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.password
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.image
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.video
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.audio
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.launcher
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmark
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.browser_action
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.page_action
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.all = this.cast("all")
  @scala.inline
  def audio: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.audio = this.cast("audio")
  @scala.inline
  def bookmark: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  def browser_action: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.browser_action = this.cast("browser_action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.frame = this.cast("frame")
  @scala.inline
  def image: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.image = this.cast("image")
  @scala.inline
  def launcher: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.launcher = this.cast("launcher")
  @scala.inline
  def link: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.link = this.cast("link")
  @scala.inline
  def page: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.page = this.cast("page")
  @scala.inline
  def page_action: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.page_action = this.cast("page_action")
  @scala.inline
  def password: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.password = this.cast("password")
  @scala.inline
  def selection: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.selection = this.cast("selection")
  @scala.inline
  def tab: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tab = this.cast("tab")
  @scala.inline
  def video: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.video = this.cast("video")
}

