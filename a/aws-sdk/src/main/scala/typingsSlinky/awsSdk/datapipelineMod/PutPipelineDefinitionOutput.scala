package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutPipelineDefinitionOutput extends StObject {
  
  /**
    * Indicates whether there were validation errors, and the pipeline definition is stored but cannot be activated until you correct the pipeline and call PutPipelineDefinition to commit the corrected pipeline.
    */
  var errored: Boolean = js.native
  
  /**
    * The validation errors that are associated with the objects defined in pipelineObjects.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
  
  /**
    * The validation warnings that are associated with the objects defined in pipelineObjects.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.native
}
object PutPipelineDefinitionOutput {
  
  @scala.inline
  def apply(errored: Boolean): PutPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPipelineDefinitionOutput]
  }
  
  @scala.inline
  implicit class PutPipelineDefinitionOutputMutableBuilder[Self <: PutPipelineDefinitionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrors(value: ValidationErrors): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationWarnings(value: ValidationWarnings): Self = StObject.set(x, "validationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationWarningsUndefined: Self = StObject.set(x, "validationWarnings", js.undefined)
    
    @scala.inline
    def setValidationWarningsVarargs(value: ValidationWarning*): Self = StObject.set(x, "validationWarnings", js.Array(value :_*))
  }
}
