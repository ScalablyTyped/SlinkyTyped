package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base Bullet have been
  * changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaBulletSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to the list_id.
    */
  var listIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to the nesting_level.
    */
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}
object SchemaBulletSuggestionState {
  
  @scala.inline
  def apply(): SchemaBulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulletSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaBulletSuggestionStateMutableBuilder[Self <: SchemaBulletSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListIdSuggested(value: Boolean): Self = StObject.set(x, "listIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdSuggestedUndefined: Self = StObject.set(x, "listIdSuggested", js.undefined)
    
    @scala.inline
    def setNestingLevelSuggested(value: Boolean): Self = StObject.set(x, "nestingLevelSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelSuggestedUndefined: Self = StObject.set(x, "nestingLevelSuggested", js.undefined)
    
    @scala.inline
    def setTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
