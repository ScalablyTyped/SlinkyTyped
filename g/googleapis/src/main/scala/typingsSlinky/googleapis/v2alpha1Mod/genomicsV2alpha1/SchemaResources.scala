package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The system resources for the pipeline run.  At least one zone or region
  * must be specified or the pipeline run will fail.
  */
@js.native
trait SchemaResources extends js.Object {
  /**
    * The project ID to allocate resources in.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The list of regions allowed for VM allocation. If set, the `zones` field
    * must not be set.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The virtual machine specification.
    */
  var virtualMachine: js.UndefOr[SchemaVirtualMachine] = js.native
  /**
    * The list of zones allowed for VM allocation. If set, the `regions` field
    * must not be set.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object SchemaResources {
  @scala.inline
  def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  @scala.inline
  implicit class SchemaResourcesOps[Self <: SchemaResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualMachine(value: SchemaVirtualMachine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualMachine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualMachine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualMachine")(js.undefined)
        ret
    }
    @scala.inline
    def withZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zones")(js.undefined)
        ret
    }
  }
  
}

