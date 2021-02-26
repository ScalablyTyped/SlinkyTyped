package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedStyleSuggestionState extends StObject {
  
  /** The named style type that this suggestion state corresponds to. This field is provided as a convenience for matching the NamedStyleSuggestionState with its corresponding NamedStyle. */
  var namedStyleType: js.UndefOr[String] = js.native
  
  /** A mask that indicates which of the fields in paragraph style have been changed in this suggestion. */
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.native
  
  /** A mask that indicates which of the fields in text style have been changed in this suggestion. */
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}
object NamedStyleSuggestionState {
  
  @scala.inline
  def apply(): NamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyleSuggestionState]
  }
  
  @scala.inline
  implicit class NamedStyleSuggestionStateMutableBuilder[Self <: NamedStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    @scala.inline
    def setParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = StObject.set(x, "paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleSuggestionStateUndefined: Self = StObject.set(x, "paragraphStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
