package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterHistory extends js.Object {
  
  /**
    * Parameter names can include the following letters and symbols. a-zA-Z0-9_.-
    */
  var AllowedPattern: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AllowedPattern] = js.native
  
  /**
    * The data type of the parameter, such as text or aws:ec2:image. The default is text.
    */
  var DataType: js.UndefOr[ParameterDataType] = js.native
  
  /**
    * Information about the parameter.
    */
  var Description: js.UndefOr[ParameterDescription] = js.native
  
  /**
    * The ID of the query key used for this parameter.
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.native
  
  /**
    * Labels assigned to the parameter version.
    */
  var Labels: js.UndefOr[ParameterLabelList] = js.native
  
  /**
    * Date the parameter was last changed or updated.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[PSParameterName] = js.native
  
  /**
    * Information about the policies assigned to a parameter.  Assigning parameter policies in the AWS Systems Manager User Guide.
    */
  var Policies: js.UndefOr[ParameterPolicyList] = js.native
  
  /**
    * The parameter tier.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  
  /**
    * The type of parameter used.
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
object ParameterHistory {
  
  @scala.inline
  def apply(): ParameterHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterHistory]
  }
  
  @scala.inline
  implicit class ParameterHistoryOps[Self <: ParameterHistory] (val x: Self) extends AnyVal {
    
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
    def setAllowedPattern(value: AllowedPattern): Self = this.set("AllowedPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPattern: Self = this.set("AllowedPattern", js.undefined)
    
    @scala.inline
    def setDataType(value: ParameterDataType): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    
    @scala.inline
    def setDescription(value: ParameterDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setKeyId(value: ParameterKeyId): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: ParameterLabel*): Self = this.set("Labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: ParameterLabelList): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLastModifiedUser(value: String): Self = this.set("LastModifiedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedUser: Self = this.set("LastModifiedUser", js.undefined)
    
    @scala.inline
    def setName(value: PSParameterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: ParameterInlinePolicy*): Self = this.set("Policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: ParameterPolicyList): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    
    @scala.inline
    def setTier(value: ParameterTier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    
    @scala.inline
    def setType(value: ParameterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValue(value: PSParameterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
    
    @scala.inline
    def setVersion(value: PSParameterVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
