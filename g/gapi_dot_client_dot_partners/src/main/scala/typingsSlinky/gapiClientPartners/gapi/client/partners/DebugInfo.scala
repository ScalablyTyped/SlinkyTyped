package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugInfo extends js.Object {
  /** Info about the server that serviced this request. */
  var serverInfo: js.UndefOr[String] = js.native
  /** Server-side debug stack trace. */
  var serverTraceInfo: js.UndefOr[String] = js.native
  /** URL of the service that handled this request. */
  var serviceUrl: js.UndefOr[String] = js.native
}

object DebugInfo {
  @scala.inline
  def apply(): DebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugInfo]
  }
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withServerTraceInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTraceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerTraceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTraceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(js.undefined)
        ret
    }
  }
  
}

