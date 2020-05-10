package typingsSlinky.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * The CP code used for reporting.
    */
  val cpCode: Double = js.native
  /**
    * Object containing properties specifying the device characteristics. The
    * value of this property will be null if the contract associated with the
    * request does not have entitlements for EDC.
    */
  val device: js.UndefOr[Device] = js.native
  /**
    * The Host header value of the incoming request.
    */
  val host: String = js.native
  /**
    * The HTTP method of the incoming request.
    */
  val method: String = js.native
  /**
    * The URL path of the incoming request, including the filename and
    * extension, but without any query string.
    */
  val path: String = js.native
  /**
    * The query string of the incoming request.
    */
  val query: String = js.native
  /**
    * The scheme of the incoming request ("http" or "https").
    */
  val scheme: String = js.native
  /**
    * The relative URL of the incoming request. This includes the path as well
    * as the query string.
    */
  val url: String = js.native
  /**
    * Object containing properties specifying the end user's geographic
    * location. This value of this property will be null if the contract
    * associated with the request does not have the appropriate entitlements.
    */
  val userLocation: js.UndefOr[UserLocation] = js.native
}

object Request {
  @scala.inline
  def apply(
    cpCode: Double,
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocation(value: UserLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocation")(js.undefined)
        ret
    }
  }
  
}

