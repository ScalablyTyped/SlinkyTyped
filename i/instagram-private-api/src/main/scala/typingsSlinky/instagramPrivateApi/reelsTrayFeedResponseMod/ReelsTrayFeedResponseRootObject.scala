package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsTrayFeedResponseRootObject extends js.Object {
  var broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem] = js.native
  var face_filter_nux_version: Double = js.native
  var has_new_nux_story: Boolean = js.native
  var status: String = js.native
  var sticker_version: Double = js.native
  var stories_viewer_gestures_nux_eligible: Boolean = js.native
  var story_ranking_token: String = js.native
  var tray: js.Array[ReelsTrayFeedResponseTrayItem] = js.native
}

object ReelsTrayFeedResponseRootObject {
  @scala.inline
  def apply(
    broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem],
    face_filter_nux_version: Double,
    has_new_nux_story: Boolean,
    status: String,
    sticker_version: Double,
    stories_viewer_gestures_nux_eligible: Boolean,
    story_ranking_token: String,
    tray: js.Array[ReelsTrayFeedResponseTrayItem]
  ): ReelsTrayFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], face_filter_nux_version = face_filter_nux_version.asInstanceOf[js.Any], has_new_nux_story = has_new_nux_story.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sticker_version = sticker_version.asInstanceOf[js.Any], stories_viewer_gestures_nux_eligible = stories_viewer_gestures_nux_eligible.asInstanceOf[js.Any], story_ranking_token = story_ranking_token.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseRootObject]
  }
  @scala.inline
  implicit class ReelsTrayFeedResponseRootObjectOps[Self <: ReelsTrayFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcasts(value: js.Array[ReelsTrayFeedResponseBroadcastsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFace_filter_nux_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face_filter_nux_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_new_nux_story(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_new_nux_story")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSticker_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticker_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStories_viewer_gestures_nux_eligible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories_viewer_gestures_nux_eligible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_ranking_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_ranking_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTray(value: js.Array[ReelsTrayFeedResponseTrayItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

