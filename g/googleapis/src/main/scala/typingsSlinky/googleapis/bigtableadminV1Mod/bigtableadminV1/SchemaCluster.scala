package typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resizable group of nodes in a particular cloud location, capable of
  * serving all Tables in the parent Instance.
  */
@js.native
trait SchemaCluster extends js.Object {
  /**
    * (`CreationOnly`) The type of storage used by this cluster to serve its
    * parent instance&#39;s tables, unless explicitly overridden.
    */
  var defaultStorageType: js.UndefOr[String] = js.native
  /**
    * (`CreationOnly`) The location where this cluster&#39;s nodes and storage
    * reside. For best performance, clients should be located as close as
    * possible to this cluster. Currently only zones are supported, so values
    * should be of the form `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * (`OutputOnly`) The unique name of the cluster. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/a-z*`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The number of nodes allocated to this cluster. More nodes enable higher
    * throughput and more consistent performance.
    */
  var serveNodes: js.UndefOr[Double] = js.native
  /**
    * (`OutputOnly`) The current state of the cluster.
    */
  var state: js.UndefOr[String] = js.native
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
    def withDefaultStorageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStorageType")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
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
    def withServeNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveNodes")(js.undefined)
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
  }
  
}

