package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetNodePoolManagementRequest sets the node management properties of a node
  * pool.
  */
@js.native
trait SchemaSetNodePoolManagementRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster to update. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * NodeManagement configuration for the node pool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.native
  /**
    * The name (project, location, cluster, node pool id) of the node pool to
    * set management properties. Specified in the format
    * &#39;projects/x/locations/x/clusters/x/nodePools/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the node pool to update. This field has been
    * deprecated and replaced by the name field.
    */
  var nodePoolId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaSetNodePoolManagementRequest {
  @scala.inline
  def apply(): SchemaSetNodePoolManagementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetNodePoolManagementRequest]
  }
  @scala.inline
  implicit class SchemaSetNodePoolManagementRequestOps[Self <: SchemaSetNodePoolManagementRequest] (val x: Self) extends AnyVal {
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
    def withManagement(value: SchemaNodeManagement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(js.undefined)
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
    def withNodePoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePoolId")(js.undefined)
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

