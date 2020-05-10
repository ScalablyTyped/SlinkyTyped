package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadURLOptions extends js.Object {
  /**
    * Base url (with trailing path separator) for files to be loaded by the data url.
    * This is needed only if the specified url is a data url and needs to load other
    * files.
    */
  var baseURLForDataURL: js.UndefOr[String] = js.native
  /**
    * Extra headers separated by "\n"
    */
  var extraHeaders: js.UndefOr[String] = js.native
  /**
    * An HTTP Referrer url.
    */
  var httpReferrer: js.UndefOr[String | Referrer] = js.native
  var postData: js.UndefOr[js.Array[UploadBlob | UploadFile | UploadRawData]] = js.native
  /**
    * A user agent originating the request.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object LoadURLOptions {
  @scala.inline
  def apply(): LoadURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadURLOptions]
  }
  @scala.inline
  implicit class LoadURLOptionsOps[Self <: LoadURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseURLForDataURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURLForDataURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURLForDataURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURLForDataURL")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpReferrer(value: String | Referrer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpReferrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpReferrer")(js.undefined)
        ret
    }
    @scala.inline
    def withPostData(value: js.Array[UploadBlob | UploadFile | UploadRawData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postData")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

