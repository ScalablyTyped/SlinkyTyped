package typingsSlinky.jqueryClientsidelogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSideLoggingObject extends js.Object {
  		// The variable to send the log message through as.
  var client_info: js.UndefOr[ClientSideLoggingClientInfoObject] = js.native
  var error_url: js.UndefOr[String] = js.native
  	// Whether or not to send native js errors as well (using window.onerror).
  var hijack_console: js.UndefOr[Boolean] = js.native
  		// The url to which errors logs are sent
  var info_url: js.UndefOr[String] = js.native
  		// The url to which standard logs are sent
  var log_level: js.UndefOr[Double] = js.native
  		// The url to which info logs are sent
  var log_url: js.UndefOr[String] = js.native
  		// The level at which to log. This allows you to keep the calls to the logging in your code and just change this variable to log varying degrees. 1 = only error, 2 = error & log, 3 = error, log & info
  var native_error: js.UndefOr[Boolean] = js.native
  	// Hijacks the default console functionality (ie: all your console.error/info/log are belong to us).
  var query_var: js.UndefOr[String] = js.native
}

object ClientSideLoggingObject {
  @scala.inline
  def apply(): ClientSideLoggingObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideLoggingObject]
  }
  @scala.inline
  implicit class ClientSideLoggingObjectOps[Self <: ClientSideLoggingObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_info(value: ClientSideLoggingClientInfoObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_info")(js.undefined)
        ret
    }
    @scala.inline
    def withError_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_url")(js.undefined)
        ret
    }
    @scala.inline
    def withHijack_console(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hijack_console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHijack_console: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hijack_console")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info_url")(js.undefined)
        ret
    }
    @scala.inline
    def withLog_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_level")(js.undefined)
        ret
    }
    @scala.inline
    def withLog_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_url")(js.undefined)
        ret
    }
    @scala.inline
    def withNative_error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_error")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery_var(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_var")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery_var: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query_var")(js.undefined)
        ret
    }
  }
  
}

