package typingsSlinky.easyXapiSupertest.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOptions extends js.Object {
  /**
  		 * Keep sockets around in a pool to be used by other requests in the future. Default = false
  		 */
  var keepAlive: js.UndefOr[Boolean] = js.native
  /**
  		 * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
  		 * Only relevant if keepAlive is set to true.
  		 */
  var keepAliveMsecs: js.UndefOr[Double] = js.native
  /**
  		 * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
  		 */
  var maxFreeSockets: js.UndefOr[Double] = js.native
  /**
  		 * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
  		 */
  var maxSockets: js.UndefOr[Double] = js.native
}

object AgentOptions {
  @scala.inline
  def apply(): AgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentOptions]
  }
  @scala.inline
  implicit class AgentOptionsOps[Self <: AgentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepAlive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAliveMsecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMsecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveMsecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMsecs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFreeSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreeSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFreeSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreeSockets")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(js.undefined)
        ret
    }
  }
  
}

