package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseRequestConfig extends js.Object {
  /**
    * Extra meta data to associate with the request/response.
    */
  var meta: js.UndefOr[js.Any] = js.native
  /**
    * The URL of the proxy to use for this request.
    */
  var requestUrl: js.UndefOr[String] = js.native
  /**
    * Whether to ignore errors when parsing the server response. If true, any errors thrown while parsing the JSON response received from the server will be ignored.
    * Defaults to false.
    */
  var suppressErrors: js.UndefOr[Boolean] = js.native
  /**
    * Whether the request should be executed asynchronously. If true, the request will be executed synchronously if supported by the browser; otherwise,
    * it will be executed asynchronously. All browsers support synchronous requests if the request URL is the same domain as the page. Synchronous requests
    * are not supported in IE6 and IE7 for cross-domain environments. Defaults to false.
    */
  var sync: js.UndefOr[Boolean] = js.native
}

object baseRequestConfig {
  @scala.inline
  def apply(): baseRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[baseRequestConfig]
  }
  @scala.inline
  implicit class baseRequestConfigOps[Self <: baseRequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

