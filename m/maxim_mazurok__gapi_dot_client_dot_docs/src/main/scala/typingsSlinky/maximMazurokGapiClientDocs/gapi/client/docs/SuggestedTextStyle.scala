package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedTextStyle extends js.Object {
  
  /**
    * A TextStyle that only includes the changes made in this suggestion. This can be used along with the text_style_suggestion_state to see which fields have changed and their new
    * values.
    */
  var textStyle: js.UndefOr[TextStyle] = js.native
  
  /** A mask that indicates which of the fields on the base TextStyle have been changed in this suggestion. */
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}
object SuggestedTextStyle {
  
  @scala.inline
  def apply(): SuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTextStyle]
  }
  
  @scala.inline
  implicit class SuggestedTextStyleOps[Self <: SuggestedTextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = this.set("textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyleSuggestionState: Self = this.set("textStyleSuggestionState", js.undefined)
  }
}
