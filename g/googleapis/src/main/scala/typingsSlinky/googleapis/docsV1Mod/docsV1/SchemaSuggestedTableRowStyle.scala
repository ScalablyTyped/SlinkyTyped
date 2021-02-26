package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggested change to a TableRowStyle.
  */
@js.native
trait SchemaSuggestedTableRowStyle extends StObject {
  
  /**
    * A TableRowStyle that only includes the changes made in this suggestion.
    * This can be used along with the table_row_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var tableRowStyle: js.UndefOr[SchemaTableRowStyle] = js.native
  
  /**
    * A mask that indicates which of the fields on the base TableRowStyle have
    * been changed in this suggestion.
    */
  var tableRowStyleSuggestionState: js.UndefOr[SchemaTableRowStyleSuggestionState] = js.native
}
object SchemaSuggestedTableRowStyle {
  
  @scala.inline
  def apply(): SchemaSuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedTableRowStyle]
  }
  
  @scala.inline
  implicit class SchemaSuggestedTableRowStyleMutableBuilder[Self <: SchemaSuggestedTableRowStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableRowStyle(value: SchemaTableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowStyleSuggestionState(value: SchemaTableRowStyleSuggestionState): Self = StObject.set(x, "tableRowStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowStyleSuggestionStateUndefined: Self = StObject.set(x, "tableRowStyleSuggestionState", js.undefined)
    
    @scala.inline
    def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
  }
}
