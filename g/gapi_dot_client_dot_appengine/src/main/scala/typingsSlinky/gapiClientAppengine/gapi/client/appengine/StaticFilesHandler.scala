package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticFilesHandler extends js.Object {
  /**
    * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served
    * to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
    */
  var applicationReadable: js.UndefOr[Boolean] = js.native
  /** Time a static file served by this handler should be cached by web proxies and browsers. */
  var expiration: js.UndefOr[String] = js.native
  /** HTTP headers to use for all responses from these URLs. */
  var httpHeaders: js.UndefOr[Record[String, String]] = js.native
  /** MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension. */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL
    * pattern.
    */
  var path: js.UndefOr[String] = js.native
  /** Whether this handler should match the request if the file referenced by the handler does not exist. */
  var requireMatchingFile: js.UndefOr[Boolean] = js.native
  /** Regular expression that matches the file paths for all files that should be referenced by this handler. */
  var uploadPathRegex: js.UndefOr[String] = js.native
}

object StaticFilesHandler {
  @scala.inline
  def apply(): StaticFilesHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticFilesHandler]
  }
  @scala.inline
  implicit class StaticFilesHandlerOps[Self <: StaticFilesHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationReadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationReadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationReadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationReadable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaders(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireMatchingFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireMatchingFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireMatchingFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireMatchingFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadPathRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadPathRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadPathRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadPathRegex")(js.undefined)
        ret
    }
  }
  
}

