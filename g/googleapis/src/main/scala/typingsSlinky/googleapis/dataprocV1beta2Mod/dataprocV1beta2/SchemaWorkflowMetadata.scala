package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc workflow template resource.
  */
@js.native
trait SchemaWorkflowMetadata extends js.Object {
  /**
    * Output only. The name of the target cluster.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID of target cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Output only. The create cluster operation metadata.
    */
  var createCluster: js.UndefOr[SchemaClusterOperation] = js.native
  /**
    * Output only. The delete cluster operation metadata.
    */
  var deleteCluster: js.UndefOr[SchemaClusterOperation] = js.native
  /**
    * Output only. Workflow end time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The workflow graph.
    */
  var graph: js.UndefOr[SchemaWorkflowGraph] = js.native
  /**
    * Map from parameter names to values that were used for those parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Workflow start time.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Output only. The workflow state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The &quot;resource name&quot; of the template.
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Output only. The version of template at the time of workflow
    * instantiation.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaWorkflowMetadata {
  @scala.inline
  def apply(): SchemaWorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowMetadata]
  }
  @scala.inline
  implicit class SchemaWorkflowMetadataOps[Self <: SchemaWorkflowMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterUuid")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateCluster(value: SchemaClusterOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteCluster(value: SchemaClusterOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph(value: SchemaWorkflowGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

