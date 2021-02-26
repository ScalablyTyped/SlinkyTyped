package typingsSlinky.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightResult[TDoc] extends StObject {
  
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TDoc] = js.native
  
  var objectID: String = js.native
}
object HighlightResult {
  
  @scala.inline
  def apply[TDoc](_highlightResult: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TDoc], objectID: String): HighlightResult[TDoc] = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult[TDoc]]
  }
  
  @scala.inline
  implicit class HighlightResultMutableBuilder[Self <: HighlightResult[_], TDoc] (val x: Self with HighlightResult[TDoc]) extends AnyVal {
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_highlightResult(value: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TDoc]): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
  }
}
