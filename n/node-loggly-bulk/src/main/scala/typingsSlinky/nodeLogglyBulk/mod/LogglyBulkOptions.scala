package typingsSlinky.nodeLogglyBulk.mod

import typingsSlinky.loggly.mod.LogglyOptions
import typingsSlinky.nodeLogglyBulk.AnonRetriesInMilliSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogglyBulkOptions extends LogglyOptions {
  var bufferOptions: js.UndefOr[AnonRetriesInMilliSeconds] = js.native
  var isBulk: js.UndefOr[Boolean] = js.native
  var networkErrorsOnConsole: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var useTagHeader: js.UndefOr[Boolean] = js.native
  var userAgent: js.UndefOr[String] = js.native
}

object LogglyBulkOptions {
  @scala.inline
  def apply(subdomain: String, token: String): LogglyBulkOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyBulkOptions]
  }
  @scala.inline
  implicit class LogglyBulkOptionsOps[Self <: LogglyBulkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferOptions(value: AnonRetriesInMilliSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBulk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBulk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBulk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBulk")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkErrorsOnConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkErrorsOnConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkErrorsOnConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkErrorsOnConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTagHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTagHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTagHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTagHeader")(js.undefined)
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

