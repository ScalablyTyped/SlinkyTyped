package typingsSlinky.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkTreeNode extends js.Object {
  /** Optional. An ordered list of children of this node.  */
  var children: js.UndefOr[js.Array[typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode]] = js.native
  /** Optional. When this node was created, in milliseconds since the epoch (new Date(dateAdded)).  */
  var dateAdded: js.UndefOr[Double] = js.native
  /** Optional. When the contents of this folder last changed, in milliseconds since the epoch.   */
  var dateGroupModified: js.UndefOr[Double] = js.native
  /** The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the browser is restarted.  */
  var id: String = js.native
  /** Optional. The 0-based position of this node within its parent folder.  */
  var index: js.UndefOr[Double] = js.native
  /** Optional. The id of the parent folder. Omitted for the root node.   */
  var parentId: js.UndefOr[String] = js.native
  /** The text displayed for the node. */
  var title: String = js.native
  /**
    * Optional.
    * Since Chrome 37.
    * Indicates the reason why this node is unmodifiable. The managed value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
    */
  var unmodifiable: js.UndefOr[js.Any] = js.native
  /** Optional. The URL navigated to when a user clicks the bookmark. Omitted for folders.   */
  var url: js.UndefOr[String] = js.native
}

object BookmarkTreeNode {
  @scala.inline
  def apply(id: String, title: String): BookmarkTreeNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkTreeNode]
  }
  @scala.inline
  implicit class BookmarkTreeNodeOps[Self <: BookmarkTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDateAdded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withDateGroupModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateGroupModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateGroupModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateGroupModified")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmodifiable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifiable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmodifiable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodifiable")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

