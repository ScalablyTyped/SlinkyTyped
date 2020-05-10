package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersRequest extends js.Object {
  /**
    * A list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do not specify a cluster, the default cluster is assumed.
    */
  var clusters: js.UndefOr[StringList] = js.native
  /**
    * Whether to include additional information about your clusters in the response. If this field is omitted, the attachments, statistics, and tags are not included. If ATTACHMENTS is specified, the attachments for the container instances or tasks within the cluster are included. If SETTINGS is specified, the settings for the cluster are included. If STATISTICS is specified, the following additional information, separated by launch type, is included:   runningEC2TasksCount   runningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount   If TAGS is specified, the metadata tags associated with the cluster are included.
    */
  var include: js.UndefOr[ClusterFieldList] = js.native
}

object DescribeClustersRequest {
  @scala.inline
  def apply(): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersRequest]
  }
  @scala.inline
  implicit class DescribeClustersRequestOps[Self <: DescribeClustersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusters")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: ClusterFieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

