package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterRole extends js.Object {
  /**
    * The name of the feature associated with the AWS Identity and Access Management (IAM) role. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB cluster.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * Describes the state of association between the IAM role and the DB cluster. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB cluster and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB cluster.    INVALID - the IAM role ARN is associated with the DB cluster, but the DB cluster is unable to assume the IAM role in order to access other AWS services on your behalf.  
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
    def withFeatureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeatureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeatureName")(js.undefined)
        ret
    }
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

