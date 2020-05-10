package typingsSlinky.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupRemoteAccess extends js.Object {
  /**
    * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `sourceSecurityGroupIds` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
    */
  var ec2SshKey: js.UndefOr[String] = js.native
  /**
    * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2SshKey`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
    */
  var sourceSecurityGroupIds: js.UndefOr[js.Array[String]] = js.native
}

object NodeGroupRemoteAccess {
  @scala.inline
  def apply(): NodeGroupRemoteAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupRemoteAccess]
  }
  @scala.inline
  implicit class NodeGroupRemoteAccessOps[Self <: NodeGroupRemoteAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2SshKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2SshKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2SshKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2SshKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

