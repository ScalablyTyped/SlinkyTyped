package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateShortDynamicLinkResponse extends js.Object {
  /** Preivew link to show the link flow chart. */
  var previewLink: js.UndefOr[String] = js.native
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var shortLink: js.UndefOr[String] = js.native
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.native
}

object CreateShortDynamicLinkResponse {
  @scala.inline
  def apply(): CreateShortDynamicLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShortDynamicLinkResponse]
  }
  @scala.inline
  implicit class CreateShortDynamicLinkResponseOps[Self <: CreateShortDynamicLinkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewLink")(js.undefined)
        ret
    }
    @scala.inline
    def withShortLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: js.Array[DynamicLinkWarning]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

