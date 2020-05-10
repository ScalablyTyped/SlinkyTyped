package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the identifying information, config, and status of a cluster of
  * Compute Engine instances.
  */
@js.native
trait SchemaCluster extends js.Object {
  /**
    * Required. The cluster name. Cluster names within a project must be
    * unique. Names of deleted clusters can be reused.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Output only. A cluster UUID (Unique Universal Identifier). Cloud Dataproc
    * generates this value when it creates the cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Required. The cluster config. Note that Cloud Dataproc may set default
    * values, and values may change when clusters are updated.
    */
  var config: js.UndefOr[SchemaClusterConfig] = js.native
  /**
    * Optional. The labels to associate with this cluster. Label keys must
    * contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but,
    * if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature:
    * This report is available for testing purposes only. It may be changed
    * before final release.
    */
  var metrics: js.UndefOr[SchemaClusterMetrics] = js.native
  /**
    * Required. The Google Cloud Platform project ID that the cluster belongs
    * to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Output only. Cluster status.
    */
  var status: js.UndefOr[SchemaClusterStatus] = js.native
  /**
    * Output only. The previous cluster status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaClusterStatus]] = js.native
}

object SchemaCluster {
  @scala.inline
  def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  @scala.inline
  implicit class SchemaClusterOps[Self <: SchemaCluster] (val x: Self) extends AnyVal {
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
    def withConfig(value: SchemaClusterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: SchemaClusterMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaClusterStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusHistory(value: js.Array[SchemaClusterStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusHistory")(js.undefined)
        ret
    }
  }
  
}

