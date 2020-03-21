package typingsSlinky.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible sources of results. `bookmarks`: The result comes from the user's bookmarks. `history`: The result
  * comes from the user's history. `search`: The result comes from a search engine. `tabs`: The result is an open
  * tab in the browser or a synced tab from another device.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.history
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.local
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.network
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def bookmarks: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks = this.cast("bookmarks")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def history: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.history = this.cast("history")
  @scala.inline
  def local: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.local = this.cast("local")
  @scala.inline
  def network: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.network = this.cast("network")
  @scala.inline
  def search: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = this.cast("search")
  @scala.inline
  def tabs: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs = this.cast("tabs")
}

