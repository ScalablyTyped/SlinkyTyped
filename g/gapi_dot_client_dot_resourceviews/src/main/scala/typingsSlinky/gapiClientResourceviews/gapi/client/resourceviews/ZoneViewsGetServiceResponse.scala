package typingsSlinky.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneViewsGetServiceResponse extends js.Object {
  /** The service information. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.native
  /** The fingerprint of the service information. */
  var fingerprint: js.UndefOr[String] = js.native
}

object ZoneViewsGetServiceResponse {
  @scala.inline
  def apply(): ZoneViewsGetServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneViewsGetServiceResponse]
  }
  @scala.inline
  implicit class ZoneViewsGetServiceResponseOps[Self <: ZoneViewsGetServiceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: js.Array[ServiceEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
  }
  
}

