package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the type and number of accelerator cards attached to the
  * instances of an instance group (see GPUs on Compute Engine).
  */
@js.native
trait SchemaAcceleratorConfig extends StObject {
  
  /**
    * The number of the accelerator cards of this type exposed to this
    * instance.
    */
  var acceleratorCount: js.UndefOr[Double] = js.native
  
  /**
    * Full URL, partial URI, or short name of the accelerator type resource to
    * expose to this instance. See Compute Engine AcceleratorTypesExamples *
    * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * *
    * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * * nvidia-tesla-k80Auto Zone Exception: If you are using the Cloud
    * Dataproc Auto Zone Placement feature, you must use the short name of the
    * accelerator type resource, for example, nvidia-tesla-k80.
    */
  var acceleratorTypeUri: js.UndefOr[String] = js.native
}
object SchemaAcceleratorConfig {
  
  @scala.inline
  def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  
  @scala.inline
  implicit class SchemaAcceleratorConfigMutableBuilder[Self <: SchemaAcceleratorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorCount(value: Double): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    @scala.inline
    def setAcceleratorTypeUri(value: String): Self = StObject.set(x, "acceleratorTypeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUriUndefined: Self = StObject.set(x, "acceleratorTypeUri", js.undefined)
  }
}
