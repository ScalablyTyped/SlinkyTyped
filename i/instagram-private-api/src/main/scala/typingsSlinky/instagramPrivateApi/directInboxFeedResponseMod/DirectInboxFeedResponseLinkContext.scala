package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponseLinkContext extends js.Object {
  var link_image_url: String = js.native
  var link_summary: String = js.native
  var link_title: String = js.native
  var link_url: String = js.native
}

object DirectInboxFeedResponseLinkContext {
  @scala.inline
  def apply(link_image_url: String, link_summary: String, link_title: String, link_url: String): DirectInboxFeedResponseLinkContext = {
    val __obj = js.Dynamic.literal(link_image_url = link_image_url.asInstanceOf[js.Any], link_summary = link_summary.asInstanceOf[js.Any], link_title = link_title.asInstanceOf[js.Any], link_url = link_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseLinkContext]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseLinkContextOps[Self <: DirectInboxFeedResponseLinkContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLink_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_summary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

