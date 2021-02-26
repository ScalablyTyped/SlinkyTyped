package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelInputConfiguration extends StObject {
  
  /**
    *  Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for variable-names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var csvInputTemplate: js.UndefOr[String] = js.native
  
  /**
    * The event type name.
    */
  var eventTypeName: js.UndefOr[identifier] = js.native
  
  /**
    *  The format of the model input configuration. The format differs depending on if it is passed through to SageMaker or constructed by Amazon Fraud Detector.
    */
  var format: js.UndefOr[ModelInputDataFormat] = js.native
  
  /**
    *  Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for variable names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var jsonInputTemplate: js.UndefOr[String] = js.native
  
  /**
    * The event variables.
    */
  var useEventVariables: UseEventVariables = js.native
}
object ModelInputConfiguration {
  
  @scala.inline
  def apply(useEventVariables: UseEventVariables): ModelInputConfiguration = {
    val __obj = js.Dynamic.literal(useEventVariables = useEventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInputConfiguration]
  }
  
  @scala.inline
  implicit class ModelInputConfigurationMutableBuilder[Self <: ModelInputConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvInputTemplate(value: String): Self = StObject.set(x, "csvInputTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvInputTemplateUndefined: Self = StObject.set(x, "csvInputTemplate", js.undefined)
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    @scala.inline
    def setFormat(value: ModelInputDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setJsonInputTemplate(value: String): Self = StObject.set(x, "jsonInputTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonInputTemplateUndefined: Self = StObject.set(x, "jsonInputTemplate", js.undefined)
    
    @scala.inline
    def setUseEventVariables(value: UseEventVariables): Self = StObject.set(x, "useEventVariables", value.asInstanceOf[js.Any])
  }
}
