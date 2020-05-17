package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaBookmarks extends js.Object {
  val Count: Double = js.native
  @JSName("PowerPoint.MediaBookmarks_typekey")
  var PowerPointDotMediaBookmarks_typekey: MediaBookmarks = js.native
  def Add(Position: Double, Name: String): MediaBookmark = js.native
  def Item(Index: Double): MediaBookmark = js.native
}

object MediaBookmarks {
  @scala.inline
  def apply(
    Add: (Double, String) => MediaBookmark,
    Count: Double,
    Item: Double => MediaBookmark,
    PowerPointDotMediaBookmarks_typekey: MediaBookmarks
  ): MediaBookmarks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.MediaBookmarks_typekey")(PowerPointDotMediaBookmarks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBookmarks]
  }
  @scala.inline
  implicit class MediaBookmarksOps[Self <: MediaBookmarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, String) => MediaBookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => MediaBookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPowerPointDotMediaBookmarks_typekey(value: MediaBookmarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.MediaBookmarks_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

