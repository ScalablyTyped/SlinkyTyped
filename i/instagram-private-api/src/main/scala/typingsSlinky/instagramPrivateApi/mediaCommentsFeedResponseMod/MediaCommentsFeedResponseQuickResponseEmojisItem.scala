package typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaCommentsFeedResponseQuickResponseEmojisItem extends js.Object {
  var unicode: String = js.native
}

object MediaCommentsFeedResponseQuickResponseEmojisItem {
  @scala.inline
  def apply(unicode: String): MediaCommentsFeedResponseQuickResponseEmojisItem = {
    val __obj = js.Dynamic.literal(unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseQuickResponseEmojisItem]
  }
  @scala.inline
  implicit class MediaCommentsFeedResponseQuickResponseEmojisItemOps[Self <: MediaCommentsFeedResponseQuickResponseEmojisItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnicode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

