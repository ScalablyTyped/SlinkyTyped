package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponsePlaceholder extends js.Object {
  var is_linked: Boolean = js.native
  var message: String = js.native
  var title: String = js.native
}

object DirectInboxFeedResponsePlaceholder {
  @scala.inline
  def apply(is_linked: Boolean, message: String, title: String): DirectInboxFeedResponsePlaceholder = {
    val __obj = js.Dynamic.literal(is_linked = is_linked.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponsePlaceholder]
  }
  @scala.inline
  implicit class DirectInboxFeedResponsePlaceholderOps[Self <: DirectInboxFeedResponsePlaceholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_linked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_linked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

