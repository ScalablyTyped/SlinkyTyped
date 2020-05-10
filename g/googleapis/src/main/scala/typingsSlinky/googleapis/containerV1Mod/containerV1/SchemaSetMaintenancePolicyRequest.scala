package typingsSlinky.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetMaintenancePolicyRequest sets the maintenance policy for a cluster.
  */
@js.native
trait SchemaSetMaintenancePolicyRequest extends js.Object {
  /**
    * The name of the cluster to update.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The maintenance policy to be set for the cluster. An empty field clears
    * the existing maintenance policy.
    */
  var maintenancePolicy: js.UndefOr[SchemaMaintenancePolicy] = js.native
  /**
    * The name (project, location, cluster id) of the cluster to set
    * maintenance policy. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840).
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaSetMaintenancePolicyRequest {
  @scala.inline
  def apply(): SchemaSetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetMaintenancePolicyRequest]
  }
  @scala.inline
  implicit class SchemaSetMaintenancePolicyRequestOps[Self <: SchemaSetMaintenancePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenancePolicy(value: SchemaMaintenancePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenancePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenancePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenancePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

