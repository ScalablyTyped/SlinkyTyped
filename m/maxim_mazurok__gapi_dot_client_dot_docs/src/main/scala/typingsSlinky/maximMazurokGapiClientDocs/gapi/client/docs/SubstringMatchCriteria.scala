package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubstringMatchCriteria extends StObject {
  
  /** Indicates whether the search should respect case: - `True`: the search is case sensitive. - `False`: the search is case insensitive. */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /** The text to search for in the document. */
  var text: js.UndefOr[String] = js.native
}
object SubstringMatchCriteria {
  
  @scala.inline
  def apply(): SubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstringMatchCriteria]
  }
  
  @scala.inline
  implicit class SubstringMatchCriteriaMutableBuilder[Self <: SubstringMatchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
