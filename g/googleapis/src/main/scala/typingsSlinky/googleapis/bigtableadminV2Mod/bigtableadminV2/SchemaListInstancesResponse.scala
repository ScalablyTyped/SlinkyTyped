package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BigtableInstanceAdmin.ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * Locations from which Instance information could not be retrieved, due to
    * an outage or some other transient condition. Instances whose Clusters are
    * all in one of the failed locations may be missing from `instances`, and
    * Instances with at least one Cluster in a failed location may only have
    * partial information returned. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of requested instances.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
  @scala.inline
  implicit class SchemaListInstancesResponseOps[Self <: SchemaListInstancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withInstances(value: js.Array[SchemaInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
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

