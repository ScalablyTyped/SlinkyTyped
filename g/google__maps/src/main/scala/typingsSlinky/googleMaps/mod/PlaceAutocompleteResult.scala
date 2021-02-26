package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceAutocompleteResult extends StObject {
  
  /**
    * contains the human-readable name for the returned result.
    * For `establishment` results, this is usually the business name.
    */
  var description: String = js.native
  
  /**
    * contains an array with `offset` value and `length`. These describe the location of
    * the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var matched_substrings: js.Array[PredictionSubstring] = js.native
  
  /**
    * is a textual identifier that uniquely identifies a place.
    * To retrieve information about the place, pass this identifier in the `placeId` field of a Places API request.
    */
  var place_id: String = js.native
  
  /** contains details on the prediction. */
  var structured_formatting: StructuredFormatting = js.native
  
  /**
    * contains an array of terms identifying each section of the returned description
    * (a section of the description is generally terminated with a comma).
    */
  var terms: js.Array[PredictionTerm] = js.native
  
  /**
    * contains an array of types that apply to this place.
    * For example: `[ "political", "locality" ]` or `[ "establishment", "geocode" ]`.
    */
  var types: js.Array[AddressType] = js.native
}
object PlaceAutocompleteResult {
  
  @scala.inline
  def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    structured_formatting: StructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[AddressType]
  ): PlaceAutocompleteResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], structured_formatting = structured_formatting.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAutocompleteResult]
  }
  
  @scala.inline
  implicit class PlaceAutocompleteResultMutableBuilder[Self <: PlaceAutocompleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matched_substrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matched_substrings", js.Array(value :_*))
    
    @scala.inline
    def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructured_formatting(value: StructuredFormatting): Self = StObject.set(x, "structured_formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[AddressType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: AddressType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
