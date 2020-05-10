package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
@js.native
trait HTTPGetAction extends js.Object {
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in
    * httpHeaders instead.
    */
  val host: String = js.native
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  val httpHeaders: js.Array[HTTPHeader] = js.native
  /**
    * Path to access on the HTTP server.
    */
  val path: String = js.native
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to
    * 65535. Name must be an IANA_SVC_NAME.
    */
  val port: Double | String = js.native
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  val scheme: String = js.native
}

object HTTPGetAction {
  @scala.inline
  def apply(
    host: String,
    httpHeaders: js.Array[HTTPHeader],
    path: String,
    port: Double | String,
    scheme: String
  ): HTTPGetAction = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetAction]
  }
  @scala.inline
  implicit class HTTPGetActionOps[Self <: HTTPGetAction] (val x: Self) extends AnyVal {
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
    def withHttpHeaders(value: js.Array[HTTPHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

