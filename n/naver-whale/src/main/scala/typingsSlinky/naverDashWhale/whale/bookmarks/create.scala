package typingsSlinky.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.create")
@js.native
object create extends js.Object {
  def apply(bookmark: typingsSlinky.chrome.chrome.bookmarks.BookmarkCreateArg): Unit = js.native
  def apply(
    bookmark: typingsSlinky.chrome.chrome.bookmarks.BookmarkCreateArg,
    callback: js.Function1[/* result */ typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode, Unit]
  ): Unit = js.native
}

