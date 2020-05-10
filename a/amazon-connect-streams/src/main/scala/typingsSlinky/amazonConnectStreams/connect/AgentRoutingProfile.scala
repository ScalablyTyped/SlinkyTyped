package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentRoutingProfile extends js.Object {
  /**
    * The default queue which should be associated with outbound contacts.
    */
  var defaultOutboundQueue: String = js.native
  /**
    * The name of the routing profile.
    */
  var name: String = js.native
  /**
    * The queues contained in the routing profile.
    */
  var queues: String = js.native
}

object AgentRoutingProfile {
  @scala.inline
  def apply(defaultOutboundQueue: String, name: String, queues: String): AgentRoutingProfile = {
    val __obj = js.Dynamic.literal(defaultOutboundQueue = defaultOutboundQueue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRoutingProfile]
  }
  @scala.inline
  implicit class AgentRoutingProfileOps[Self <: AgentRoutingProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOutboundQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOutboundQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

