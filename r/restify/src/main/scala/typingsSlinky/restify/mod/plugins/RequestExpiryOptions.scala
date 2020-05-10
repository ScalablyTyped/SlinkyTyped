package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestExpiryOptions extends js.Object {
  /**
    * Header name of the absolute time for request expiration
    */
  var absoluteHeader: js.UndefOr[String] = js.native
  /**
    * Header name for the start time of the request
    */
  var startHeader: js.UndefOr[String] = js.native
  /**
    * The header name for the time in milliseconds that should ellapse before the request is considered expired.
    */
  var timeoutHeader: js.UndefOr[String] = js.native
}

object RequestExpiryOptions {
  @scala.inline
  def apply(): RequestExpiryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestExpiryOptions]
  }
  @scala.inline
  implicit class RequestExpiryOptionsOps[Self <: RequestExpiryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStartHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutHeader")(js.undefined)
        ret
    }
  }
  
}

