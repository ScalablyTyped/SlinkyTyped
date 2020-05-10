package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of the SKU instances being reserved.
  */
@js.native
trait SchemaAllocationSpecificSKUAllocationReservedInstanceProperties extends js.Object {
  /**
    * Specifies accelerator type and count.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  /**
    * Specifies amount of local ssd to reserve with each instance. The type of
    * disk is local-ssd.
    */
  var localSsds: js.UndefOr[
    js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  ] = js.native
  /**
    * Specifies type of machine (name only) which has fixed number of vCPUs and
    * fixed amount of memory. This also includes specifying custom machine type
    * following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Minimum cpu platform the reservation.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
}

object SchemaAllocationSpecificSKUAllocationReservedInstanceProperties {
  @scala.inline
  def apply(): SchemaAllocationSpecificSKUAllocationReservedInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationReservedInstanceProperties]
  }
  @scala.inline
  implicit class SchemaAllocationSpecificSKUAllocationReservedInstancePropertiesOps[Self <: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccelerators")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSsds(value: js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSsds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSsds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSsds")(js.undefined)
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
    def withMinCpuPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCpuPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCpuPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCpuPlatform")(js.undefined)
        ret
    }
  }
  
}

