package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Compute Engine resource that is being managed by a running
  * pipeline.
  */
@js.native
trait SchemaComputeEngine extends js.Object {
  /**
    * The names of the disks that were created for this pipeline.
    */
  var diskNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The instance on which the operation is running.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * The machine type of the instance.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The availability zone in which the instance resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaComputeEngine {
  @scala.inline
  def apply(): SchemaComputeEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeEngine]
  }
  @scala.inline
  implicit class SchemaComputeEngineOps[Self <: SchemaComputeEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskNames")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withMachineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(js.undefined)
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

