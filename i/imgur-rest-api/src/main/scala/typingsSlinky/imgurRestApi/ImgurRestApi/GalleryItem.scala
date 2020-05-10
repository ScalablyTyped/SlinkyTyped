package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GalleryItem extends js.Object {
  var account_id: js.UndefOr[Double] = js.native
  var account_url: js.UndefOr[String] = js.native
  var comment_count: Double = js.native
  var datetime: Double = js.native
  var description: String = js.native
  var downs: Double = js.native
  var favorite: Boolean = js.native
  var id: String = js.native
  var is_album: Boolean = js.native
  var link: String = js.native
  var nsfw: js.UndefOr[Boolean] = js.native
  var score: Double = js.native
  var title: String = js.native
  var topic: String = js.native
  var topic_id: Double = js.native
  var ups: Double = js.native
  var views: Double = js.native
  var vote: js.UndefOr[String] = js.native
}

object GalleryItem {
  @scala.inline
  def apply(
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryItem]
  }
  @scala.inline
  implicit class GalleryItemOps[Self <: GalleryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDowns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_album(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViews(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_url")(js.undefined)
        ret
    }
    @scala.inline
    def withNsfw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsfw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsfw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsfw")(js.undefined)
        ret
    }
    @scala.inline
    def withVote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote")(js.undefined)
        ret
    }
  }
  
}

