package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterSecurityGroupMessage extends js.Object {
  /**
    * The name of the cluster security group to be deleted.
    */
  var ClusterSecurityGroupName: String = js.native
}

object DeleteClusterSecurityGroupMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String): DeleteClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSecurityGroupMessage]
  }
  @scala.inline
  implicit class DeleteClusterSecurityGroupMessageOps[Self <: DeleteClusterSecurityGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterSecurityGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

