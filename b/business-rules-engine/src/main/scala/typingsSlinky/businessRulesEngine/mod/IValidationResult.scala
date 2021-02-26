package typingsSlinky.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidationResult extends StObject {
  
  def Add(validationResult: IValidationResult): Unit = js.native
  
  var Children: js.Array[IValidationResult] = js.native
  
  var ErrorCount: Double = js.native
  
  var ErrorMessage: String = js.native
  
  var HasErrors: Boolean = js.native
  
  var HasErrorsDirty: Boolean = js.native
  
  var Name: String = js.native
  
  var Optional: js.UndefOr[IOptional] = js.native
  
  def Remove(index: Double): Unit = js.native
  
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.native
}
object IValidationResult {
  
  @scala.inline
  def apply(
    Add: IValidationResult => Unit,
    Children: js.Array[IValidationResult],
    ErrorCount: Double,
    ErrorMessage: String,
    HasErrors: Boolean,
    HasErrorsDirty: Boolean,
    Name: String,
    Remove: Double => Unit
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Children = Children.asInstanceOf[js.Any], ErrorCount = ErrorCount.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasErrors = HasErrors.asInstanceOf[js.Any], HasErrorsDirty = HasErrorsDirty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IValidationResult]
  }
  
  @scala.inline
  implicit class IValidationResultMutableBuilder[Self <: IValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: IValidationResult => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: js.Array[IValidationResult]): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: IValidationResult*): Self = StObject.set(x, "Children", js.Array(value :_*))
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasErrors(value: Boolean): Self = StObject.set(x, "HasErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasErrorsDirty(value: Boolean): Self = StObject.set(x, "HasErrorsDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: () => Boolean): Self = StObject.set(x, "Optional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "Optional", js.undefined)
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslateArgs(value: js.Array[IErrorTranslateArgs]): Self = StObject.set(x, "TranslateArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateArgsUndefined: Self = StObject.set(x, "TranslateArgs", js.undefined)
    
    @scala.inline
    def setTranslateArgsVarargs(value: IErrorTranslateArgs*): Self = StObject.set(x, "TranslateArgs", js.Array(value :_*))
  }
}
