package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObjectBorderSuggestionState extends js.Object {
  
  /** Indicates if there was a suggested change to color. */
  var colorSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to dash_style. */
  var dashStyleSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to property_state. */
  var propertyStateSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to width. */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}
object EmbeddedObjectBorderSuggestionState {
  
  @scala.inline
  def apply(): EmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorderSuggestionState]
  }
  
  @scala.inline
  implicit class EmbeddedObjectBorderSuggestionStateOps[Self <: EmbeddedObjectBorderSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setColorSuggested(value: Boolean): Self = this.set("colorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSuggested: Self = this.set("colorSuggested", js.undefined)
    
    @scala.inline
    def setDashStyleSuggested(value: Boolean): Self = this.set("dashStyleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyleSuggested: Self = this.set("dashStyleSuggested", js.undefined)
    
    @scala.inline
    def setPropertyStateSuggested(value: Boolean): Self = this.set("propertyStateSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyStateSuggested: Self = this.set("propertyStateSuggested", js.undefined)
    
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = this.set("widthSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthSuggested: Self = this.set("widthSuggested", js.undefined)
  }
}
