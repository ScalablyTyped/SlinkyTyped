package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  /**
    * The author of the social network post.
    */
  var author: String = js.native
  /**
    * An image of the posts author.
    */
  var imageUrl: String = js.native
  /**
    * The URL of the social network post.
    */
  var referenceUrl: String = js.native
  /**
    * The resourceId object encapsulates information that identifies the resource associated with a social network post.
    */
  var resourceId: KindPlaylistId = js.native
  /**
    * The name of the social network.
    */
  var `type`: String = js.native
}

object Author {
  @scala.inline
  def apply(author: String, imageUrl: String, referenceUrl: String, resourceId: KindPlaylistId, `type`: String): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], referenceUrl = referenceUrl.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: KindPlaylistId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

