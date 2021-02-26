package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Id: String = js.native
  
  val IsReadOnly: Boolean = js.native
  
  val IsRequired: Boolean = js.native
  
  val Name: String = js.native
  
  @JSName("Office.MetaProperty_typekey")
  var OfficeDotMetaProperty_typekey: MetaProperty = js.native
  
  val Parent: js.Any = js.native
  
  val Type: MsoMetaPropertyType = js.native
  
  def Validate(): String = js.native
  
  val ValidationError: String = js.native
  
  var Value: js.Any = js.native
}
object MetaProperty {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Id: String,
    IsReadOnly: Boolean,
    IsRequired: Boolean,
    Name: String,
    OfficeDotMetaProperty_typekey: MetaProperty,
    Parent: js.Any,
    Type: MsoMetaPropertyType,
    Validate: () => String,
    ValidationError: String,
    Value: js.Any
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), ValidationError = ValidationError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MetaProperty_typekey")(OfficeDotMetaProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty]
  }
  
  @scala.inline
  implicit class MetaPropertyMutableBuilder[Self <: MetaProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotMetaProperty_typekey(value: MetaProperty): Self = StObject.set(x, "Office.MetaProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoMetaPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: () => String): Self = StObject.set(x, "Validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidationError(value: String): Self = StObject.set(x, "ValidationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
