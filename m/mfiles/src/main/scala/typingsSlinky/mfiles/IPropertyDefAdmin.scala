package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDefAdmin extends StObject {
  
  var AllowAutomaticPermissions: Boolean = js.native
  
  var AutomaticValue: IAutomaticValue = js.native
  
  def Clone(): IPropertyDefAdmin = js.native
  
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  
  var PropertyDef: IPropertyDef = js.native
  
  var SemanticAliases: ISemanticAliases = js.native
  
  var Validation: IValidation = js.native
}
object IPropertyDefAdmin {
  
  @scala.inline
  def apply(
    AllowAutomaticPermissions: Boolean,
    AutomaticValue: IAutomaticValue,
    Clone: () => IPropertyDefAdmin,
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal(AllowAutomaticPermissions = AllowAutomaticPermissions.asInstanceOf[js.Any], AutomaticValue = AutomaticValue.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
  
  @scala.inline
  implicit class IPropertyDefAdminMutableBuilder[Self <: IPropertyDefAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAutomaticPermissions(value: Boolean): Self = StObject.set(x, "AllowAutomaticPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticValue(value: IAutomaticValue): Self = StObject.set(x, "AutomaticValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IPropertyDefAdmin): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNamedValueNamespaces(value: INamedValueNamespaces): Self = StObject.set(x, "NamedValueNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDef(value: IPropertyDef): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: IValidation): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
  }
}
