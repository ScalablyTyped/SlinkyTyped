package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.M.Autocomplete
import typingsSlinky.materializeCss.M.AutocompleteData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.AutocompleteOptions> */
@js.native
trait PartialAutocompleteOption extends StObject {
  
  var data: js.UndefOr[AutocompleteData] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var onAutocomplete: js.UndefOr[js.ThisFunction1[/* this */ Autocomplete, /* text */ String, Unit]] = js.native
  
  var sortFunction: js.UndefOr[js.Function3[/* a */ String, /* b */ String, /* inputText */ String, Double]] = js.native
}
object PartialAutocompleteOption {
  
  @scala.inline
  def apply(): PartialAutocompleteOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAutocompleteOption]
  }
  
  @scala.inline
  implicit class PartialAutocompleteOptionMutableBuilder[Self <: PartialAutocompleteOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: AutocompleteData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setOnAutocomplete(value: js.ThisFunction1[/* this */ Autocomplete, /* text */ String, Unit]): Self = StObject.set(x, "onAutocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAutocompleteUndefined: Self = StObject.set(x, "onAutocomplete", js.undefined)
    
    @scala.inline
    def setSortFunction(value: (/* a */ String, /* b */ String, /* inputText */ String) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
  }
}
