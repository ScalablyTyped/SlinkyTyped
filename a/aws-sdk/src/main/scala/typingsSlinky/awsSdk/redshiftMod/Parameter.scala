package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends js.Object {
  
  /**
    * The valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  
  /**
    * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other properties require that any associated clusters be rebooted for the configuration changes to be applied. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ApplyType: js.UndefOr[ParameterApplyType] = js.native
  
  /**
    * The data type of the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * A description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * If true, the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  
  /**
    * The source of the parameter value, such as "engine-default" or "user".
    */
  var Source: js.UndefOr[String] = js.native
}
object Parameter {
  
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedValues(value: String): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
    
    @scala.inline
    def setApplyType(value: ParameterApplyType): Self = this.set("ApplyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyType: Self = this.set("ApplyType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = this.set("IsModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModifiable: Self = this.set("IsModifiable", js.undefined)
    
    @scala.inline
    def setMinimumEngineVersion(value: String): Self = this.set("MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumEngineVersion: Self = this.set("MinimumEngineVersion", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("ParameterName", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterValue: Self = this.set("ParameterValue", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
}
