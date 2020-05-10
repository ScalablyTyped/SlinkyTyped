package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var host: js.UndefOr[Input[String]] = js.native
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.UndefOr[Input[js.Array[Input[HTTPHeader]]]] = js.native
  /**
    * Path to access on the HTTP server.
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to
    * 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Input[Double | String] = js.native
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: js.UndefOr[Input[String]] = js.native
}

object HTTPGetAction {
  @scala.inline
  def apply(port: Input[Double | String]): HTTPGetAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetAction]
  }
  @scala.inline
  implicit class HTTPGetActionOps[Self <: HTTPGetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Input[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: Input[String]): Self = {
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
    def withHttpHeaders(value: Input[js.Array[Input[HTTPHeader]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
  }
  
}

