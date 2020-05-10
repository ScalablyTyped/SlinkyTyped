package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsTrayFeedResponseTalliesItem extends js.Object {
  var count: Double = js.native
  var font_size: js.UndefOr[Double] = js.native
  var text: String = js.native
}

object ReelsTrayFeedResponseTalliesItem {
  @scala.inline
  def apply(count: Double, text: String): ReelsTrayFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTalliesItem]
  }
  @scala.inline
  implicit class ReelsTrayFeedResponseTalliesItemOps[Self <: ReelsTrayFeedResponseTalliesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_size")(js.undefined)
        ret
    }
  }
  
}

