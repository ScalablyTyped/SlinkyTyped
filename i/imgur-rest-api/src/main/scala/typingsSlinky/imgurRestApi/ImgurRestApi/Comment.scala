package typingsSlinky.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var album_cover: String = js.native
  var author: String = js.native
  var author_id: Double = js.native
  var children: js.Array[Comment] = js.native
  var comment: String = js.native
  var datetime: Double = js.native
  var deleted: Boolean = js.native
  var downs: Double = js.native
  var id: Double = js.native
  var image_id: String = js.native
  var on_album: Boolean = js.native
  var parent_id: Double = js.native
  var points: Double = js.native
  var ups: Double = js.native
  var vote: js.UndefOr[String] = js.native
}

object Comment {
  @scala.inline
  def apply(
    album_cover: String,
    author: String,
    author_id: Double,
    children: js.Array[Comment],
    comment: String,
    datetime: Double,
    deleted: Boolean,
    downs: Double,
    id: Double,
    image_id: String,
    on_album: Boolean,
    parent_id: Double,
    points: Double,
    ups: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(album_cover = album_cover.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_id = image_id.asInstanceOf[js.Any], on_album = on_album.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum_cover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDowns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_album(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ups")(value.asInstanceOf[js.Any])
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

