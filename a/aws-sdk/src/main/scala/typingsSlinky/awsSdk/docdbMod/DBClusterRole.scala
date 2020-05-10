package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterRole extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * Describes the state of association between the IAM role and the cluster. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the cluster and can be used to access other AWS services on your behalf.    PENDING - The IAM role ARN is being associated with the DB cluster.    INVALID - The IAM role ARN is associated with the cluster, but the cluster cannot assume the IAM role to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterRole {
  @scala.inline
  def apply(): DBClusterRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterRole]
  }
  @scala.inline
  implicit class DBClusterRoleOps[Self <: DBClusterRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

