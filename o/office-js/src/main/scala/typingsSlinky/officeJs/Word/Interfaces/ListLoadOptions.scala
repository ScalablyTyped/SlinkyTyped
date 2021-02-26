package typingsSlinky.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait ListLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[Boolean] = js.native
}
object ListLoadOptions {
  
  @scala.inline
  def apply(): ListLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLoadOptions]
  }
  
  @scala.inline
  implicit class ListLoadOptionsMutableBuilder[Self <: ListLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLevelExistences(value: Boolean): Self = StObject.set(x, "levelExistences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelExistencesUndefined: Self = StObject.set(x, "levelExistences", js.undefined)
    
    @scala.inline
    def setLevelTypes(value: Boolean): Self = StObject.set(x, "levelTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelTypesUndefined: Self = StObject.set(x, "levelTypes", js.undefined)
  }
}
