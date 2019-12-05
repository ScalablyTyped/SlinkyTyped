package typingsSlinky.firefoxDashWebextDashBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible sources of results. `bookmarks`: The result comes from the user's bookmarks. `history`: The result
  * comes from the user's history. `search`: The result comes from a search engine. `tabs`: The result is an open
  * tab in the browser or a synced tab from another device.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmarks
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.history
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.search
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tabs
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.local
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.network
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def bookmarks: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmarks = this.cast("bookmarks")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def history: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.history = this.cast("history")
  @scala.inline
  def local: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.local = this.cast("local")
  @scala.inline
  def network: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.network = this.cast("network")
  @scala.inline
  def search: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.search = this.cast("search")
  @scala.inline
  def tabs: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.tabs = this.cast("tabs")
}

