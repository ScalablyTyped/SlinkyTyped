package typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.CreateCluster.
  */
@js.native
trait SchemaCreateClusterRequest extends js.Object {
  /**
    * The cluster to be created. Fields marked `OutputOnly` must be left blank.
    */
  var cluster: js.UndefOr[SchemaCluster] = js.native
  /**
    * The ID to be used when referring to the new cluster within its instance,
    * e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The unique name of the instance in which to create the new cluster.
    * Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaCreateClusterRequest {
  @scala.inline
  def apply(): SchemaCreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClusterRequest]
  }
  @scala.inline
  implicit class SchemaCreateClusterRequestOps[Self <: SchemaCreateClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: SchemaCluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
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
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

