package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPropertyOptions extends StObject {
  
  var associationName: js.UndefOr[String] = js.native
  
  var entityTypeName: String = js.native
  
  var foreignKeyNames: js.UndefOr[js.Array[String]] = js.native
  
  var foreignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.native
  
  var isScalar: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nameOnServer: js.UndefOr[String] = js.native
  
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}
object NavigationPropertyOptions {
  
  @scala.inline
  def apply(entityTypeName: String): NavigationPropertyOptions = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPropertyOptions]
  }
  
  @scala.inline
  implicit class NavigationPropertyOptionsMutableBuilder[Self <: NavigationPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationName(value: String): Self = StObject.set(x, "associationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationNameUndefined: Self = StObject.set(x, "associationName", js.undefined)
    
    @scala.inline
    def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyNames(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyNamesOnServer(value: js.Array[String]): Self = StObject.set(x, "foreignKeyNamesOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyNamesOnServerUndefined: Self = StObject.set(x, "foreignKeyNamesOnServer", js.undefined)
    
    @scala.inline
    def setForeignKeyNamesOnServerVarargs(value: String*): Self = StObject.set(x, "foreignKeyNamesOnServer", js.Array(value :_*))
    
    @scala.inline
    def setForeignKeyNamesUndefined: Self = StObject.set(x, "foreignKeyNames", js.undefined)
    
    @scala.inline
    def setForeignKeyNamesVarargs(value: String*): Self = StObject.set(x, "foreignKeyNames", js.Array(value :_*))
    
    @scala.inline
    def setIsScalar(value: Boolean): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScalarUndefined: Self = StObject.set(x, "isScalar", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnServer(value: String): Self = StObject.set(x, "nameOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOnServerUndefined: Self = StObject.set(x, "nameOnServer", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "validators", js.Array(value :_*))
  }
}
