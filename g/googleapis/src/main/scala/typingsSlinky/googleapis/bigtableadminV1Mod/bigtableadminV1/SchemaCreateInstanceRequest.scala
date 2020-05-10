package typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends js.Object {
  /**
    * The clusters to be created within the instance, mapped by desired cluster
    * ID, e.g., just `mycluster` rather than
    * `projects/myproject/instances/myinstance/clusters/mycluster`. Fields
    * marked `OutputOnly` must be left blank. Currently, at most two clusters
    * can be specified.
    */
  var clusters: js.UndefOr[StringDictionary[SchemaCluster]] = js.native
  /**
    * The instance to create. Fields marked `OutputOnly` must be left blank.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  /**
    * The ID to be used when referring to the new instance within its project,
    * e.g., just `myinstance` rather than
    * `projects/myproject/instances/myinstance`.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The unique name of the project in which to create the new instance.
    * Values are of the form `projects/&lt;project&gt;`.
    */
  var parent: js.UndefOr[String] = js.native
}

object SchemaCreateInstanceRequest {
  @scala.inline
  def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  @scala.inline
  implicit class SchemaCreateInstanceRequestOps[Self <: SchemaCreateInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusters(value: StringDictionary[SchemaCluster]): Self = {
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
    def withInstance(value: SchemaInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
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

