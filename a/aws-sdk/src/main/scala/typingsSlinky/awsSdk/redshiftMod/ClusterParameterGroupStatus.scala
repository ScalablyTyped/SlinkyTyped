package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupStatus extends js.Object {
  /**
    * The list of parameter statuses.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ClusterParameterStatusList: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ClusterParameterStatusList] = js.native
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}

object ClusterParameterGroupStatus {
  @scala.inline
  def apply(): ClusterParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupStatus]
  }
  @scala.inline
  implicit class ClusterParameterGroupStatusOps[Self <: ClusterParameterGroupStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterParameterStatusList(value: ClusterParameterStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterStatusList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterParameterStatusList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterStatusList")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterApplyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterApplyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(js.undefined)
        ret
    }
  }
  
}

