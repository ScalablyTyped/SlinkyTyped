package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAllTextRequest extends js.Object {
  
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
  implicit class ReplaceAllTextRequestOps[Self <: ReplaceAllTextRequest] (val x: Self) extends AnyVal {
    
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
    def setContainsText(value: SubstringMatchCriteria): Self = this.set("containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsText: Self = this.set("containsText", js.undefined)
    
    @scala.inline
    def setPageObjectIdsVarargs(value: String*): Self = this.set("pageObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setPageObjectIds(value: js.Array[String]): Self = this.set("pageObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageObjectIds: Self = this.set("pageObjectIds", js.undefined)
    
    @scala.inline
    def setReplaceText(value: String): Self = this.set("replaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceText: Self = this.set("replaceText", js.undefined)
  }
}
