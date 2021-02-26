package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends StObject {
  
  /**
    * Specifies the valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  
  /**
    * Indicates when to apply parameter updates.
    */
  var ApplyMethod: js.UndefOr[typingsSlinky.awsSdk.rdsMod.ApplyMethod] = js.native
  
  /**
    * Specifies the engine specific parameters type.
    */
  var ApplyType: js.UndefOr[String] = js.native
  
  /**
    * Specifies the valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * Provides a description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    *  Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  
  /**
    * Indicates the source of the parameter value.
    */
  var Source: js.UndefOr[String] = js.native
  
  /**
    * The valid DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.native
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
    def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    @scala.inline
    def setApplyMethod(value: ApplyMethod): Self = StObject.set(x, "ApplyMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyMethodUndefined: Self = StObject.set(x, "ApplyMethod", js.undefined)
    
    @scala.inline
    def setApplyType(value: String): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyTypeUndefined: Self = StObject.set(x, "ApplyType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = StObject.set(x, "IsModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModifiableUndefined: Self = StObject.set(x, "IsModifiable", js.undefined)
    
    @scala.inline
    def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setSupportedEngineModes(value: EngineModeList): Self = StObject.set(x, "SupportedEngineModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEngineModesUndefined: Self = StObject.set(x, "SupportedEngineModes", js.undefined)
    
    @scala.inline
    def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "SupportedEngineModes", js.Array(value :_*))
  }
}
