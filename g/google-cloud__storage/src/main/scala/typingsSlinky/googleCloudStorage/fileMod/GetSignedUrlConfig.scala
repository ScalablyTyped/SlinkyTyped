package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.delete
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.read
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.resumable
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.v2
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.v4
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.write
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignedUrlConfig extends js.Object {
  var action: read | write | delete | resumable = js.native
  var cname: js.UndefOr[String] = js.native
  var contentMd5: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var expires: String | Double | js.Date = js.native
  var extensionHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  var promptSaveAs: js.UndefOr[String] = js.native
  var responseDisposition: js.UndefOr[String] = js.native
  var responseType: js.UndefOr[String] = js.native
  var version: js.UndefOr[v2 | v4] = js.native
}

object GetSignedUrlConfig {
  @scala.inline
  def apply(action: read | write | delete | resumable, expires: String | Double | js.Date): GetSignedUrlConfig = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignedUrlConfig]
  }
  @scala.inline
  implicit class GetSignedUrlConfigOps[Self <: GetSignedUrlConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: read | write | delete | resumable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname")(js.undefined)
        ret
    }
    @scala.inline
    def withContentMd5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMd5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMd5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMd5")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionHeaders(value: OutgoingHttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptSaveAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptSaveAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptSaveAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptSaveAs")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: v2 | v4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

