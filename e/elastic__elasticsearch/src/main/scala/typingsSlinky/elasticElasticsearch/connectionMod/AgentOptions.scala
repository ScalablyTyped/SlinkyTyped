package typingsSlinky.elasticElasticsearch.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOptions extends js.Object {
  var keepAlive: Boolean = js.native
  var keepAliveMsecs: Double = js.native
  var maxFreeSockets: Double = js.native
  var maxSockets: Double = js.native
}

object AgentOptions {
  @scala.inline
  def apply(keepAlive: Boolean, keepAliveMsecs: Double, maxFreeSockets: Double, maxSockets: Double): AgentOptions = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any], keepAliveMsecs = keepAliveMsecs.asInstanceOf[js.Any], maxFreeSockets = maxFreeSockets.asInstanceOf[js.Any], maxSockets = maxSockets.asInstanceOf[js.Any])
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
    def withKeepAliveMsecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMsecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFreeSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreeSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

