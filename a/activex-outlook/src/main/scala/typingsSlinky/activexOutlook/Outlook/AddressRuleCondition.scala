package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressRuleCondition extends StObject {
  
  var Address: js.Any = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ConditionType: OlRuleConditionType = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.AddressRuleCondition_typekey")
  var OutlookDotAddressRuleCondition_typekey: AddressRuleCondition = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object AddressRuleCondition {
  
  @scala.inline
  def apply(
    Address: js.Any,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotAddressRuleCondition_typekey: AddressRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): AddressRuleCondition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressRuleCondition_typekey")(OutlookDotAddressRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressRuleCondition]
  }
  
  @scala.inline
  implicit class AddressRuleConditionMutableBuilder[Self <: AddressRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: js.Any): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAddressRuleCondition_typekey(value: AddressRuleCondition): Self = StObject.set(x, "Outlook.AddressRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
