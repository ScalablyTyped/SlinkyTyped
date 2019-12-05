package typingsSlinky.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.getRecent")
@js.native
object getRecent extends js.Object {
  def apply(
    numberOfItems: Double,
    callback: js.Function1[
      /* results */ js.Array[typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode], 
      Unit
    ]
  ): Unit = js.native
}

