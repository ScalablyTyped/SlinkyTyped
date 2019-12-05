package typingsSlinky.firefoxDashWebextDashBrowser.browser.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the type of a BookmarkTreeNode, which can be one of bookmark, folder or separator. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmark
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.folder
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.separator
*/
trait BookmarkTreeNodeType extends js.Object

object BookmarkTreeNodeType {
  @scala.inline
  def bookmark: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def folder: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.folder = this.cast("folder")
  @scala.inline
  def separator: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.separator = this.cast("separator")
}

