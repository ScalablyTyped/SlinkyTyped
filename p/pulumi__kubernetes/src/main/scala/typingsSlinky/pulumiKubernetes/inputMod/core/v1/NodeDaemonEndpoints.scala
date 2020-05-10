package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var kubeletEndpoint: js.UndefOr[Input[DaemonEndpoint]] = js.native
}

object NodeDaemonEndpoints {
  @scala.inline
  def apply(): NodeDaemonEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDaemonEndpoints]
  }
  @scala.inline
  implicit class NodeDaemonEndpointsOps[Self <: NodeDaemonEndpoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKubeletEndpoint(value: Input[DaemonEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubeletEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKubeletEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubeletEndpoint")(js.undefined)
        ret
    }
  }
  
}

