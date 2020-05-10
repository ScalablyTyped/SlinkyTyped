package typingsSlinky.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentStatus extends js.Object {
  var closeSocketCount: Double = js.native
  var createSocketCount: Double = js.native
  var createSocketErrorCount: Double = js.native
  var errorSocketCount: Double = js.native
  var freeSockets: js.Object = js.native
  var requestCount: Double = js.native
  var requests: js.Object = js.native
  var sockets: js.Object = js.native
  var timeoutSocketCount: Double = js.native
}

object AgentStatus {
  @scala.inline
  def apply(
    closeSocketCount: Double,
    createSocketCount: Double,
    createSocketErrorCount: Double,
    errorSocketCount: Double,
    freeSockets: js.Object,
    requestCount: Double,
    requests: js.Object,
    sockets: js.Object,
    timeoutSocketCount: Double
  ): AgentStatus = {
    val __obj = js.Dynamic.literal(closeSocketCount = closeSocketCount.asInstanceOf[js.Any], createSocketCount = createSocketCount.asInstanceOf[js.Any], createSocketErrorCount = createSocketErrorCount.asInstanceOf[js.Any], errorSocketCount = errorSocketCount.asInstanceOf[js.Any], freeSockets = freeSockets.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], timeoutSocketCount = timeoutSocketCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStatus]
  }
  @scala.inline
  implicit class AgentStatusOps[Self <: AgentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseSocketCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSocketCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSocketCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSocketCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSocketErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSocketErrorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorSocketCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorSocketCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreeSockets(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequests(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSockets(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutSocketCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSocketCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

