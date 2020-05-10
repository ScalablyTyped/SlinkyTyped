package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.SDKURL
import typingsSlinky.jpm.requestMod.STResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContent[ResponseType] extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[String | js.Object] = js.native
  var contentType: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var onComplete: js.UndefOr[js.Function1[/* response */ STResponse[ResponseType], _]] = js.native
  var overrideMimeType: js.UndefOr[String] = js.native
  var url: js.UndefOr[String | SDKURL] = js.native
}

object AnonContent {
  @scala.inline
  def apply[ResponseType](): AnonContent[ResponseType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContent[ResponseType]]
  }
  @scala.inline
  implicit class AnonContentOps[Self[responsetype] <: AnonContent[responsetype], ResponseType] (val x: Self[ResponseType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ResponseType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ResponseType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ResponseType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ResponseType] with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String | js.Object): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* response */ STResponse[ResponseType] => _): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMimeType(value: String): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String | SDKURL): Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[ResponseType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

