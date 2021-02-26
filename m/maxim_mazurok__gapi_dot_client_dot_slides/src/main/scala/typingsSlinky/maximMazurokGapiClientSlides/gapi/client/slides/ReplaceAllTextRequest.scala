package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAllTextRequest extends StObject {
  
  /** Finds text in a shape matching this substring. */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
  
  /**
    * If non-empty, limits the matches to page elements only on the given pages. Returns a 400 bad request error if given the page object ID of a notes master, or if a page with that
    * object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The text that will replace the matched text. */
  var replaceText: js.UndefOr[String] = js.native
}
object ReplaceAllTextRequest {
  
  @scala.inline
  def apply(): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
  
  @scala.inline
  implicit class ReplaceAllTextRequestMutableBuilder[Self <: ReplaceAllTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    @scala.inline
    def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
    
    @scala.inline
    def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
  }
}
