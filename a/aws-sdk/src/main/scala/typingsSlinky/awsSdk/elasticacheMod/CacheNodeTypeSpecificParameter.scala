package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheNodeTypeSpecificParameter extends StObject {
  
  /**
    * The valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  
  /**
    * A list of cache node types and their corresponding values for this parameter.
    */
  var CacheNodeTypeSpecificValues: js.UndefOr[CacheNodeTypeSpecificValueList] = js.native
  
  /**
    * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see Rebooting a Cluster.
    */
  var ChangeType: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ChangeType] = js.native
  
  /**
    * The valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * A description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  
  /**
    * The earliest cache engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  
  /**
    * The source of the parameter value.
    */
  var Source: js.UndefOr[String] = js.native
}
object CacheNodeTypeSpecificParameter {
  
  @scala.inline
  def apply(): CacheNodeTypeSpecificParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeTypeSpecificParameter]
  }
  
  @scala.inline
  implicit class CacheNodeTypeSpecificParameterMutableBuilder[Self <: CacheNodeTypeSpecificParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    @scala.inline
    def setCacheNodeTypeSpecificValues(value: CacheNodeTypeSpecificValueList): Self = StObject.set(x, "CacheNodeTypeSpecificValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeSpecificValuesUndefined: Self = StObject.set(x, "CacheNodeTypeSpecificValues", js.undefined)
    
    @scala.inline
    def setCacheNodeTypeSpecificValuesVarargs(value: CacheNodeTypeSpecificValue*): Self = StObject.set(x, "CacheNodeTypeSpecificValues", js.Array(value :_*))
    
    @scala.inline
    def setChangeType(value: ChangeType): Self = StObject.set(x, "ChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "ChangeType", js.undefined)
    
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
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
