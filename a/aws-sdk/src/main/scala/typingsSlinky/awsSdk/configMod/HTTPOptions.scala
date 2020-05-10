package typingsSlinky.awsSdk.configMod

import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPOptions extends js.Object {
  /**
    * the Agent object to perform HTTP requests with.
    * Used for connection pooling.
    * Defaults to the global agent (http.globalAgent) for non-SSL connections.
    */
  var agent: js.UndefOr[Agent | typingsSlinky.node.httpsMod.Agent] = js.native
  /**
    * The maximum time in milliseconds that the connection phase of the request
    * should be allowed to take. This only limits the connection phase and has
    * no impact once the socket has established a connection.
    * Used in node.js environments only.
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  /**
    * the URL to proxy requests through.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds to wait before giving up on a connection attempt.
    * Defaults to two minutes (120000).
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Whether the SDK will send asynchronous HTTP requests.
    * Used in the browser environment only.
    * Set to false to send requests synchronously.
    * Defaults to true (async on).
    */
  var xhrAsync: js.UndefOr[Boolean] = js.native
  /**
    * Sets the 'withCredentials' property of an XMLHttpRequest object.
    * Used in the browser environment only.
    * Defaults to false.
    */
  var xhrWithCredentials: js.UndefOr[Boolean] = js.native
}

object HTTPOptions {
  @scala.inline
  def apply(): HTTPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPOptions]
  }
  @scala.inline
  implicit class HTTPOptionsOps[Self <: HTTPOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: Agent | typingsSlinky.node.httpsMod.Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrWithCredentials")(js.undefined)
        ret
    }
  }
  
}

