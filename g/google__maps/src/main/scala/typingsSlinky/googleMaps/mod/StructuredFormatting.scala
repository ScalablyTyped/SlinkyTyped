package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuredFormatting extends StObject {
  
  /** contains the main text of a prediction, usually the name of the place. */
  var main_text: String = js.native
  
  /**
    * contains an array with `offset` value and `length`. These describe the location of
    * the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var main_text_matched_substrings: js.Array[PredictionSubstring] = js.native
  
  /** contains the secondary text of a prediction, usually the location of the place. */
  var secondary_text: String = js.native
}
object StructuredFormatting {
  
  @scala.inline
  def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): StructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text.asInstanceOf[js.Any], main_text_matched_substrings = main_text_matched_substrings.asInstanceOf[js.Any], secondary_text = secondary_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredFormatting]
  }
  
  @scala.inline
  implicit class StructuredFormattingMutableBuilder[Self <: StructuredFormatting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMain_text(value: String): Self = StObject.set(x, "main_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "main_text_matched_substrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain_text_matched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "main_text_matched_substrings", js.Array(value :_*))
    
    @scala.inline
    def setSecondary_text(value: String): Self = StObject.set(x, "secondary_text", value.asInstanceOf[js.Any])
  }
}
