package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterNode extends js.Object {
  /**
    * Whether the node is a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[String] = js.native
  /**
    * The private IP address of a node within a cluster.
    */
  var PrivateIPAddress: js.UndefOr[String] = js.native
  /**
    * The public IP address of a node within a cluster.
    */
  var PublicIPAddress: js.UndefOr[String] = js.native
}

object ClusterNode {
  @scala.inline
  def apply(): ClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterNode]
  }
  @scala.inline
  implicit class ClusterNodeOps[Self <: ClusterNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeRole")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIPAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIPAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIPAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIPAddress")(js.undefined)
        ret
    }
  }
  
}

