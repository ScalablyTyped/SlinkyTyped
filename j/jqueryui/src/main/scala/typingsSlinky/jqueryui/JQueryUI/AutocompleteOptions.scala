package typingsSlinky.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Autocomplete //////////////////////////////////////////////////
@js.native
trait AutocompleteOptions extends AutocompleteEvents {
  
  var appendTo: js.UndefOr[js.Any] = js.native
  
  //Selector;
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  // [], string or ()
  var classes: js.UndefOr[AutocompleteClasses] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[js.Any] = js.native
  
  // object
  var source: js.UndefOr[js.Any] = js.native
}
object AutocompleteOptions {
  
  @scala.inline
  def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit class AutocompleteOptionsMutableBuilder[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setClasses(value: AutocompleteClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
