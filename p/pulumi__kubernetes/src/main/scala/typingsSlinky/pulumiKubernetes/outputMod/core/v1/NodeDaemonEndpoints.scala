package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
  */
@js.native
trait NodeDaemonEndpoints extends js.Object {
  /**
    * Endpoint on which Kubelet is listening.
    */
  val kubeletEndpoint: DaemonEndpoint = js.native
}

object NodeDaemonEndpoints {
  @scala.inline
  def apply(kubeletEndpoint: DaemonEndpoint): NodeDaemonEndpoints = {
    val __obj = js.Dynamic.literal(kubeletEndpoint = kubeletEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDaemonEndpoints]
  }
  @scala.inline
  implicit class NodeDaemonEndpointsOps[Self <: NodeDaemonEndpoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKubeletEndpoint(value: DaemonEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubeletEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

