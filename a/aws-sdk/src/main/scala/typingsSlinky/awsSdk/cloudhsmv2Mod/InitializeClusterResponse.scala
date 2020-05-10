package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeClusterResponse extends js.Object {
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.StateMessage] = js.native
}

object InitializeClusterResponse {
  @scala.inline
  def apply(): InitializeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeClusterResponse]
  }
  @scala.inline
  implicit class InitializeClusterResponseOps[Self <: InitializeClusterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: ClusterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateMessage(value: StateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateMessage")(js.undefined)
        ret
    }
  }
  
}

