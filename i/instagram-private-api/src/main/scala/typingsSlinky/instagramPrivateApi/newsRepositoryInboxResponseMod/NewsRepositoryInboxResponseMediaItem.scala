package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseMediaItem extends js.Object {
  var comment_threading_enabled: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var image: String = js.native
}

object NewsRepositoryInboxResponseMediaItem {
  @scala.inline
  def apply(id: String, image: String): NewsRepositoryInboxResponseMediaItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseMediaItem]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseMediaItemOps[Self <: NewsRepositoryInboxResponseMediaItem] (val x: Self) extends AnyVal {
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
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_threading_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_threading_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_threading_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_threading_enabled")(js.undefined)
        ret
    }
  }
  
}

