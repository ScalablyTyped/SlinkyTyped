package typingsSlinky.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryItem extends js.Object {
  /** The unique identifier for the item. */
  var id: String = js.native
  /** Optional. When this page was last loaded, represented in milliseconds since the epoch. */
  var lastVisitTime: js.UndefOr[Double] = js.native
  /** Optional. The title of the page when it was last loaded. */
  var title: js.UndefOr[String] = js.native
  /** Optional. The number of times the user has navigated to this page by typing in the address. */
  var typedCount: js.UndefOr[Double] = js.native
  /** Optional. The URL navigated to by a user. */
  var url: js.UndefOr[String] = js.native
  /** Optional. The number of times the user has navigated to this page. */
  var visitCount: js.UndefOr[Double] = js.native
}

object HistoryItem {
  @scala.inline
  def apply(id: String): HistoryItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryItem]
  }
  @scala.inline
  implicit class HistoryItemOps[Self <: HistoryItem] (val x: Self) extends AnyVal {
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
    def withLastVisitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVisitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastVisitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastVisitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTypedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typedCount")(js.undefined)
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
    @scala.inline
    def withVisitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitCount")(js.undefined)
        ret
    }
  }
  
}

