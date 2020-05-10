package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPHealthCheck_ extends js.Object {
  /**
    * The value of the host header in the HTTP health check request. If left empty (default value), the IP on behalf of which this health check is performed
    * will be used.
    */
  var host: js.UndefOr[String] = js.native
  /** The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.native
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.native
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.native
  /** The request path of the HTTP health check request. The default value is /. */
  var requestPath: js.UndefOr[String] = js.native
}

object HTTPHealthCheck_ {
  @scala.inline
  def apply(): HTTPHealthCheck_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPHealthCheck_]
  }
  @scala.inline
  implicit class HTTPHealthCheck_Ops[Self <: HTTPHealthCheck_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portName")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPath")(js.undefined)
        ret
    }
  }
  
}

