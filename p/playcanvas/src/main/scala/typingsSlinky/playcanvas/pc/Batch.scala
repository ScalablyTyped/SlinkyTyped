package typingsSlinky.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds information about batched mesh instances. Created in {@link pc.BatchManager#create}.
  * @property origMeshInstances - An array of original mesh instances, from which this batch was generated.
  * @property meshInstance - A single combined mesh instance, the result of batching.
  * @property model - A handy model object.
  * @property dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @property [batchGroupId] - Link this batch to a specific batch group. This is done automatically with default batches.
  * @param meshInstances - The mesh instances to be batched.
  * @param dynamic - Whether this batch is dynamic (supports transforming mesh instances at runtime).
  * @param batchGroupId - Link this batch to a specific batch group. This is done automatically with default batches.
  */
@js.native
trait Batch extends StObject {
  
  /**
    * Link this batch to a specific batch group. This is done automatically with default batches.
    */
  var batchGroupId: js.UndefOr[Double] = js.native
  
  /**
    * Whether this batch is dynamic (supports transforming mesh instances at runtime).
    */
  var dynamic: Boolean = js.native
  
  /**
    * A single combined mesh instance, the result of batching.
    */
  var meshInstance: MeshInstance = js.native
  
  /**
    * A handy model object.
    */
  var model: Model = js.native
  
  /**
    * An array of original mesh instances, from which this batch was generated.
    */
  var origMeshInstances: js.Array[MeshInstance] = js.native
}
object Batch {
  
  @scala.inline
  def apply(
    dynamic: Boolean,
    meshInstance: MeshInstance,
    model: Model,
    origMeshInstances: js.Array[MeshInstance]
  ): Batch = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], meshInstance = meshInstance.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], origMeshInstances = origMeshInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  
  @scala.inline
  implicit class BatchMutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchGroupId(value: Double): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshInstance(value: MeshInstance): Self = StObject.set(x, "meshInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigMeshInstances(value: js.Array[MeshInstance]): Self = StObject.set(x, "origMeshInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigMeshInstancesVarargs(value: MeshInstance*): Self = StObject.set(x, "origMeshInstances", js.Array(value :_*))
  }
}
