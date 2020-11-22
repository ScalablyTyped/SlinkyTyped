package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedListProperties extends js.Object {
  
  /**
    * A ListProperties that only includes the changes made in this suggestion. This can be used along with the list_properties_suggestion_state to see which fields have changed and their
    * new values.
    */
  var listProperties: js.UndefOr[ListProperties] = js.native
  
  /** A mask that indicates which of the fields on the base ListProperties have been changed in this suggestion. */
  var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.native
}
object SuggestedListProperties {
  
  @scala.inline
  def apply(): SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedListProperties]
  }
  
  @scala.inline
  implicit class SuggestedListPropertiesOps[Self <: SuggestedListProperties] (val x: Self) extends AnyVal {
    
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
    def setListProperties(value: ListProperties): Self = this.set("listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProperties: Self = this.set("listProperties", js.undefined)
    
    @scala.inline
    def setListPropertiesSuggestionState(value: ListPropertiesSuggestionState): Self = this.set("listPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListPropertiesSuggestionState: Self = this.set("listPropertiesSuggestionState", js.undefined)
  }
}
