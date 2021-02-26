package typingsSlinky.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autocomplete extends StObject {
  
  var autocomplete: String = js.native
  
  var lang: Cancel = js.native
  
  var onCancel: js.Any = js.native
  
  var onChange: js.Any = js.native
  
  var onClear: js.Any = js.native
  
  var onSubmit: js.Any = js.native
  
  var placeholder: String = js.native
  
  var searchName: String = js.native
}
object Autocomplete {
  
  @scala.inline
  def apply(
    autocomplete: String,
    lang: Cancel,
    onCancel: js.Any,
    onChange: js.Any,
    onClear: js.Any,
    onSubmit: js.Any,
    placeholder: String,
    searchName: String
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClear = onClear.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], searchName = searchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autocomplete]
  }
  
  @scala.inline
  implicit class AutocompleteMutableBuilder[Self <: Autocomplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: Cancel): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCancel(value: js.Any): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: js.Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClear(value: js.Any): Self = StObject.set(x, "onClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmit(value: js.Any): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchName(value: String): Self = StObject.set(x, "searchName", value.asInstanceOf[js.Any])
  }
}
