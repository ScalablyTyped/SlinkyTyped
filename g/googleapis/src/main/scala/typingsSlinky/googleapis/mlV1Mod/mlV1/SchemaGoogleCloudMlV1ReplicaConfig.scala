package typingsSlinky.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the configuration for a replica in a cluster.
  */
@js.native
trait SchemaGoogleCloudMlV1ReplicaConfig extends StObject {
  
  /**
    * Represents the type and number of accelerators used by the replica.
    * [Learn about restrictions on accelerator configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    */
  var acceleratorConfig: js.UndefOr[SchemaGoogleCloudMlV1AcceleratorConfig] = js.native
  
  /**
    * The Docker image to run on the replica. This image must be in Container
    * Registry. Learn more about [configuring custom
    * containers](/ml-engine/docs/distributed-training-containers).
    */
  var imageUri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1ReplicaConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ReplicaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ReplicaConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ReplicaConfigMutableBuilder[Self <: SchemaGoogleCloudMlV1ReplicaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorConfig(value: SchemaGoogleCloudMlV1AcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
