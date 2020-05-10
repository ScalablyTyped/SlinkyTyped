package typingsSlinky.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkRemoveInfo extends js.Object {
  var index: Double = js.native
  var node: typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode = js.native
  var parentId: String = js.native
}

object BookmarkRemoveInfo {
  @scala.inline
  def apply(index: Double, node: typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkRemoveInfo]
  }
  @scala.inline
  implicit class BookmarkRemoveInfoOps[Self <: BookmarkRemoveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

