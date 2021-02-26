package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of the SKU instances being reserved.
  */
@js.native
trait SchemaAllocationSpecificSKUAllocationReservedInstanceProperties extends StObject {
  
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
  implicit class SchemaAllocationSpecificSKUAllocationReservedInstancePropertiesMutableBuilder[Self <: SchemaAllocationSpecificSKUAllocationReservedInstanceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    @scala.inline
    def setGuestAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setLocalSsds(value: js.Array[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]): Self = StObject.set(x, "localSsds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSsdsUndefined: Self = StObject.set(x, "localSsds", js.undefined)
    
    @scala.inline
    def setLocalSsdsVarargs(value: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk*): Self = StObject.set(x, "localSsds", js.Array(value :_*))
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}
