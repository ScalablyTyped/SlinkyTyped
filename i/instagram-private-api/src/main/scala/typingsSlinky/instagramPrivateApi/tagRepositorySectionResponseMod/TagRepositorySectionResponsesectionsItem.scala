package typingsSlinky.instagramPrivateApi.tagRepositorySectionResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRepositorySectionResponsesectionsItem extends js.Object {
  var explore_item_info: js.Array[String] = js.native
  var feed_type: String = js.native
  var layout_content: js.Array[String] = js.native
  var layout_type: String = js.native
}

object TagRepositorySectionResponsesectionsItem {
  @scala.inline
  def apply(
    explore_item_info: js.Array[String],
    feed_type: String,
    layout_content: js.Array[String],
    layout_type: String
  ): TagRepositorySectionResponsesectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRepositorySectionResponsesectionsItem]
  }
  @scala.inline
  implicit class TagRepositorySectionResponsesectionsItemOps[Self <: TagRepositorySectionResponsesectionsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplore_item_info(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explore_item_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeed_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout_content(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

