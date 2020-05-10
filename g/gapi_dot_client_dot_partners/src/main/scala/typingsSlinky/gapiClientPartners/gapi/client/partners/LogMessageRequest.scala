package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMessageRequest extends js.Object {
  /** Map of client info, such as URL, browser navigator, browser platform, etc. */
  var clientInfo: js.UndefOr[Record[String, String]] = js.native
  /** Details about the client message. */
  var details: js.UndefOr[String] = js.native
  /** Message level of client message. */
  var level: js.UndefOr[String] = js.native
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
}

object LogMessageRequest {
  @scala.inline
  def apply(): LogMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogMessageRequest]
  }
  @scala.inline
  implicit class LogMessageRequestOps[Self <: LogMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientInfo(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMetadata(value: RequestMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMetadata")(js.undefined)
        ret
    }
  }
  
}

