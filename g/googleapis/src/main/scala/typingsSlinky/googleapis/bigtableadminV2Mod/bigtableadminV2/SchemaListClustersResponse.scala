package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BigtableInstanceAdmin.ListClusters.
  */
@js.native
trait SchemaListClustersResponse extends js.Object {
  /**
    * The list of requested clusters.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  /**
    * Locations from which Cluster information could not be retrieved, due to
    * an outage or some other transient condition. Clusters from these
    * locations may be missing from `clusters`, or may only have partial
    * information returned. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClustersResponse {
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  @scala.inline
  implicit class SchemaListClustersResponseOps[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: js.Array[SchemaCluster]): Self = {
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
    def withFailedLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

