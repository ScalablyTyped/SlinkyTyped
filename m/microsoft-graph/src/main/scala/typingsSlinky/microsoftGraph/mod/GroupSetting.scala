package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupSetting extends Entity {
  
  // Display name of this group of settings, which comes from the associated template.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Unique identifier for the template used to create this group of settings. Read-only.
  var templateId: js.UndefOr[NullableOption[String]] = js.native
  
  // Collection of name value pairs. Must contain and set all the settings defined in the template.
  var values: js.UndefOr[js.Array[SettingValue]] = js.native
}
object GroupSetting {
  
  @scala.inline
  def apply(): GroupSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSetting]
  }
  
  @scala.inline
  implicit class GroupSettingMutableBuilder[Self <: GroupSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setTemplateId(value: NullableOption[String]): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[SettingValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SettingValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
