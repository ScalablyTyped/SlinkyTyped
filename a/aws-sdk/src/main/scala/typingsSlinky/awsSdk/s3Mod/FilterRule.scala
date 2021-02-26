package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterRule extends StObject {
  
  /**
    * The object key name prefix or suffix identifying one or more objects to which the filtering rule applies. The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not supported. For more information, see Configuring Event Notifications in the Amazon Simple Storage Service Developer Guide.
    */
  var Name: js.UndefOr[FilterRuleName] = js.native
  
  /**
    * The value that the filter searches for in object key names.
    */
  var Value: js.UndefOr[FilterRuleValue] = js.native
}
object FilterRule {
  
  @scala.inline
  def apply(): FilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRule]
  }
  
  @scala.inline
  implicit class FilterRuleMutableBuilder[Self <: FilterRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FilterRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: FilterRuleValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
