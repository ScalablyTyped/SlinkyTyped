package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.ValidationCompleted client event that allows you to centrally validate user input within all DevExpress web controls to which validation is applied.
  */
@js.native
trait ASPxClientValidationCompletedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a container object that holds the validated control(s).
    */
  var container: js.Any = js.native
  
  /**
    * Gets the first control (either visible or invisible) that hasn't passed the validation applied.
    */
  var firstInvalidControl: ASPxClientControl = js.native
  
  /**
    * Gets the first visible control that hasn't passed the validation applied.
    */
  var firstVisibleInvalidControl: ASPxClientControl = js.native
  
  /**
    * Gets a value that indicates whether validation has been applied to both visible and invisible controls.
    */
  var invisibleControlsValidated: Boolean = js.native
  
  /**
    * Gets a value specifying whether the validation has been completed successfully.
    */
  var isValid: Boolean = js.native
  
  /**
    * Gets the name of the validation group name to which validation has been applied.
    */
  var validationGroup: String = js.native
}
object ASPxClientValidationCompletedEventArgs {
  
  @scala.inline
  def apply(
    container: js.Any,
    firstInvalidControl: ASPxClientControl,
    firstVisibleInvalidControl: ASPxClientControl,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    validationGroup: String
  ): ASPxClientValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], firstInvalidControl = firstInvalidControl.asInstanceOf[js.Any], firstVisibleInvalidControl = firstVisibleInvalidControl.asInstanceOf[js.Any], invisibleControlsValidated = invisibleControlsValidated.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], validationGroup = validationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientValidationCompletedEventArgsMutableBuilder[Self <: ASPxClientValidationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstInvalidControl(value: ASPxClientControl): Self = StObject.set(x, "firstInvalidControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleInvalidControl(value: ASPxClientControl): Self = StObject.set(x, "firstVisibleInvalidControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleControlsValidated(value: Boolean): Self = StObject.set(x, "invisibleControlsValidated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationGroup(value: String): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
  }
}
