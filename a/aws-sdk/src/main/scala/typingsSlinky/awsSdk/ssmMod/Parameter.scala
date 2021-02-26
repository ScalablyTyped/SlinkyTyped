package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the parameter.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * The data type of the parameter, such as text or aws:ec2:image. The default is text.
    */
  var DataType: js.UndefOr[ParameterDataType] = js.native
  
  /**
    * Date the parameter was last changed or updated and the parameter version was created.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[PSParameterName] = js.native
  
  /**
    * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats: parameter_name:version parameter_name:label
    */
  var Selector: js.UndefOr[PSParameterSelector] = js.native
  
  /**
    * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.
    */
  var SourceResult: js.UndefOr[String] = js.native
  
  /**
    * The type of parameter. Valid values include the following: String, StringList, and SecureString.
    */
  var Type: js.UndefOr[ParameterType] = js.native
  
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[PSParameterValue] = js.native
  
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}
object Parameter {
  
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setDataType(value: ParameterDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: PSParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSelector(value: PSParameterSelector): Self = StObject.set(x, "Selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "Selector", js.undefined)
    
    @scala.inline
    def setSourceResult(value: String): Self = StObject.set(x, "SourceResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceResultUndefined: Self = StObject.set(x, "SourceResult", js.undefined)
    
    @scala.inline
    def setType(value: ParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: PSParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    @scala.inline
    def setVersion(value: PSParameterVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
