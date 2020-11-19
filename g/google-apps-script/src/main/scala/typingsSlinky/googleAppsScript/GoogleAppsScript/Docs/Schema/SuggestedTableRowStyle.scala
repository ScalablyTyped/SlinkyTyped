package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestedTableRowStyle extends js.Object {
  
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.native
  
  var tableRowStyleSuggestionState: js.UndefOr[TableRowStyleSuggestionState] = js.native
}
object SuggestedTableRowStyle {
  
  @scala.inline
  def apply(): SuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableRowStyle]
  }
  
  @scala.inline
  implicit class SuggestedTableRowStyleOps[Self <: SuggestedTableRowStyle] (val x: Self) extends AnyVal {
    
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
    def setTableRowStyle(value: TableRowStyle): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowStyle: Self = this.set("tableRowStyle", js.undefined)
    
    @scala.inline
    def setTableRowStyleSuggestionState(value: TableRowStyleSuggestionState): Self = this.set("tableRowStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowStyleSuggestionState: Self = this.set("tableRowStyleSuggestionState", js.undefined)
  }
}
