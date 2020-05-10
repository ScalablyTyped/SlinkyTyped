package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single cluster for clustering model.
  */
@js.native
trait SchemaClusterInfo extends js.Object {
  /**
    * Centroid id.
    */
  var centroidId: js.UndefOr[String] = js.native
  /**
    * Cluster radius, the average distance from centroid to each point assigned
    * to the cluster.
    */
  var clusterRadius: js.UndefOr[Double] = js.native
  /**
    * Cluster size, the total number of points assigned to the cluster.
    */
  var clusterSize: js.UndefOr[String] = js.native
}

object SchemaClusterInfo {
  @scala.inline
  def apply(): SchemaClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterInfo]
  }
  @scala.inline
  implicit class SchemaClusterInfoOps[Self <: SchemaClusterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentroidId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centroidId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentroidId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centroidId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSize")(js.undefined)
        ret
    }
  }
  
}

