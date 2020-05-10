package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streaming appliance snapshot configuration.
  */
@js.native
trait SchemaStreamingApplianceSnapshotConfig extends js.Object {
  /**
    * Indicates which endpoint is used to import appliance state.
    */
  var importStateEndpoint: js.UndefOr[String] = js.native
  /**
    * If set, indicates the snapshot id for the snapshot being performed.
    */
  var snapshotId: js.UndefOr[String] = js.native
}

object SchemaStreamingApplianceSnapshotConfig {
  @scala.inline
  def apply(): SchemaStreamingApplianceSnapshotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingApplianceSnapshotConfig]
  }
  @scala.inline
  implicit class SchemaStreamingApplianceSnapshotConfigOps[Self <: SchemaStreamingApplianceSnapshotConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportStateEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportStateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importStateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(js.undefined)
        ret
    }
  }
  
}

