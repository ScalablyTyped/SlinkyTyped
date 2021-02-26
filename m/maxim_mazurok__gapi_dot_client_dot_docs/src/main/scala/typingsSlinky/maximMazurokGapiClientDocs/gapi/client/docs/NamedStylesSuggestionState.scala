package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedStylesSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields on the corresponding NamedStyle in styles have been changed in this suggestion. The order of these named style suggestion states match the
    * order of the corresponding named style within the named styles suggestion.
    */
  var stylesSuggestionStates: js.UndefOr[js.Array[NamedStyleSuggestionState]] = js.native
}
object NamedStylesSuggestionState {
  
  @scala.inline
  def apply(): NamedStylesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStylesSuggestionState]
  }
  
  @scala.inline
  implicit class NamedStylesSuggestionStateMutableBuilder[Self <: NamedStylesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylesSuggestionStates(value: js.Array[NamedStyleSuggestionState]): Self = StObject.set(x, "stylesSuggestionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesSuggestionStatesUndefined: Self = StObject.set(x, "stylesSuggestionStates", js.undefined)
    
    @scala.inline
    def setStylesSuggestionStatesVarargs(value: NamedStyleSuggestionState*): Self = StObject.set(x, "stylesSuggestionStates", js.Array(value :_*))
  }
}
