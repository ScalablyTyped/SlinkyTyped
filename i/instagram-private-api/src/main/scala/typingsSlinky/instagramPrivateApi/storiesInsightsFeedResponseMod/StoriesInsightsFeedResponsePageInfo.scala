package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponsePageInfo extends js.Object {
  var end_cursor: String = js.native
  var has_next_page: Boolean = js.native
}

object StoriesInsightsFeedResponsePageInfo {
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): StoriesInsightsFeedResponsePageInfo = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponsePageInfo]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponsePageInfoOps[Self <: StoriesInsightsFeedResponsePageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_next_page(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_next_page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

