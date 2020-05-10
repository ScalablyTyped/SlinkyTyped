package typingsSlinky.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryHighlightsTrayResponseTvChannel extends js.Object {
  var id: String = js.native
  var items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem] = js.native
  var max_id: Null = js.native
  var more_available: Boolean = js.native
  var seen_state: HighlightsRepositoryHighlightsTrayResponseSeenState = js.native
  var title: String = js.native
  var `type`: String = js.native
  var user_dict: HighlightsRepositoryHighlightsTrayResponseUserDict = js.native
}

object HighlightsRepositoryHighlightsTrayResponseTvChannel {
  @scala.inline
  def apply(
    id: String,
    items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem],
    max_id: Null,
    more_available: Boolean,
    seen_state: HighlightsRepositoryHighlightsTrayResponseSeenState,
    title: String,
    `type`: String,
    user_dict: HighlightsRepositoryHighlightsTrayResponseUserDict
  ): HighlightsRepositoryHighlightsTrayResponseTvChannel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseTvChannel]
  }
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseTvChannelOps[Self <: HighlightsRepositoryHighlightsTrayResponseTvChannel] (val x: Self) extends AnyVal {
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
    def withItems(value: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeen_state(value: HighlightsRepositoryHighlightsTrayResponseSeenState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seen_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_dict(value: HighlightsRepositoryHighlightsTrayResponseUserDict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_dict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

