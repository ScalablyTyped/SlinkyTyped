package typingsSlinky.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsFeedResponse extends js.Object {
  var more_available: Boolean = js.native
  var next_max_id: String = js.native
  var next_media_ids: js.Array[String] = js.native
  var next_page: Double = js.native
  var sections: js.Array[TagsFeedResponseSectionsItem] = js.native
  var status: String = js.native
}

object TagsFeedResponse {
  @scala.inline
  def apply(
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[TagsFeedResponseSectionsItem],
    status: String
  ): TagsFeedResponse = {
    val __obj = js.Dynamic.literal(more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponse]
  }
  @scala.inline
  implicit class TagsFeedResponseOps[Self <: TagsFeedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_media_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_media_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSections(value: js.Array[TagsFeedResponseSectionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

