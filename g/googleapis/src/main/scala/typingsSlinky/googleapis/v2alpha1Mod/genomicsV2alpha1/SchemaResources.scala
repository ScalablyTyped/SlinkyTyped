package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The system resources for the pipeline run.  At least one zone or region
  * must be specified or the pipeline run will fail.
  */
@js.native
trait SchemaResources extends StObject {
  
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
  implicit class SchemaResourcesMutableBuilder[Self <: SchemaResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setVirtualMachine(value: SchemaVirtualMachine): Self = StObject.set(x, "virtualMachine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualMachineUndefined: Self = StObject.set(x, "virtualMachine", js.undefined)
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
