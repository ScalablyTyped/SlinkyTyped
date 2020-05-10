package typingsSlinky.instagramPrivateApi.newsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsFeedResponseArgs extends js.Object {
  var comment_id: js.UndefOr[String] = js.native
  var comment_ids: js.UndefOr[js.Array[String]] = js.native
  var links: js.Array[NewsFeedResponseLinksItem] = js.native
  var media: js.UndefOr[js.Array[NewsFeedResponseMediaItem]] = js.native
  var profile_id: Double = js.native
  var profile_image: String = js.native
  var profile_image_destination: js.UndefOr[String] = js.native
  var second_profile_id: js.UndefOr[Double] = js.native
  var second_profile_image: js.UndefOr[String] = js.native
  var text: String = js.native
  var timestamp: Double = js.native
  var tuuid: String = js.native
}

object NewsFeedResponseArgs {
  @scala.inline
  def apply(
    links: js.Array[NewsFeedResponseLinksItem],
    profile_id: Double,
    profile_image: String,
    text: String,
    timestamp: Double,
    tuuid: String
  ): NewsFeedResponseArgs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], profile_id = profile_id.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsFeedResponseArgs]
  }
  @scala.inline
  implicit class NewsFeedResponseArgsOps[Self <: NewsFeedResponseArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[NewsFeedResponseLinksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[NewsFeedResponseMediaItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_image_destination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image_destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_image_destination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image_destination")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond_profile_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond_profile_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond_profile_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond_profile_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_image")(js.undefined)
        ret
    }
  }
  
}

