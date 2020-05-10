package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.downloads.DownloadMethod
import typingsSlinky.firefoxWebextBrowser.browser.downloads.FilenameConflictAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBody extends js.Object {
  /** Post body. */
  var body: js.UndefOr[String] = js.native
  var conflictAction: js.UndefOr[FilenameConflictAction] = js.native
  /** A file path relative to the Downloads directory to contain the downloaded file. */
  var filename: js.UndefOr[String] = js.native
  /**
    * Extra HTTP headers to send with the request if the URL uses the HTTP[s] protocol. Each header is represented
    * as a dictionary containing the keys `name` and either `value` or `binaryValue`, restricted to those allowed
    * by XMLHttpRequest.
    */
  var headers: js.UndefOr[js.Array[AnonValue]] = js.native
  /** Whether to associate the download with a private browsing session. */
  var incognito: js.UndefOr[Boolean] = js.native
  /** The HTTP method to use if the URL uses the HTTP[S] protocol. */
  var method: js.UndefOr[DownloadMethod] = js.native
  /**
    * Use a file-chooser to allow the user to select a filename. If the option is not specified, the file chooser
    * will be shown only if the Firefox "Always ask you where to save files" option is enabled (i.e. the pref
    * `browser.download.useDownloadDir` is set to `false`).
    */
  var saveAs: js.UndefOr[Boolean] = js.native
  /** The URL to download. */
  var url: String = js.native
}

object AnonBody {
  @scala.inline
  def apply(url: String): AnonBody = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
  @scala.inline
  implicit class AnonBodyOps[Self <: AnonBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withConflictAction(value: FilenameConflictAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictAction")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[AnonValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: DownloadMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAs")(js.undefined)
        ret
    }
  }
  
}

