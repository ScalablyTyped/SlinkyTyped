package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformJobDefinition extends StObject {
  
  /**
    * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
    */
  var BatchStrategy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.BatchStrategy] = js.native
  
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  
  /**
    * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
    */
  var MaxPayloadInMB: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  
  /**
    * A description of the input source and the way the transform job consumes it.
    */
  var TransformInput: typingsSlinky.awsSdk.sagemakerMod.TransformInput = js.native
  
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: typingsSlinky.awsSdk.sagemakerMod.TransformOutput = js.native
  
  /**
    * Identifies the ML compute instances for the transform job.
    */
  var TransformResources: typingsSlinky.awsSdk.sagemakerMod.TransformResources = js.native
}
object TransformJobDefinition {
  
  @scala.inline
  def apply(
    TransformInput: TransformInput,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobDefinition]
  }
  
  @scala.inline
  implicit class TransformJobDefinitionMutableBuilder[Self <: TransformJobDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchStrategy(value: BatchStrategy): Self = StObject.set(x, "BatchStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchStrategyUndefined: Self = StObject.set(x, "BatchStrategy", js.undefined)
    
    @scala.inline
    def setEnvironment(value: TransformEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = StObject.set(x, "MaxConcurrentTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentTransformsUndefined: Self = StObject.set(x, "MaxConcurrentTransforms", js.undefined)
    
    @scala.inline
    def setMaxPayloadInMB(value: MaxPayloadInMB): Self = StObject.set(x, "MaxPayloadInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPayloadInMBUndefined: Self = StObject.set(x, "MaxPayloadInMB", js.undefined)
    
    @scala.inline
    def setTransformInput(value: TransformInput): Self = StObject.set(x, "TransformInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOutput(value: TransformOutput): Self = StObject.set(x, "TransformOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformResources(value: TransformResources): Self = StObject.set(x, "TransformResources", value.asInstanceOf[js.Any])
  }
}
