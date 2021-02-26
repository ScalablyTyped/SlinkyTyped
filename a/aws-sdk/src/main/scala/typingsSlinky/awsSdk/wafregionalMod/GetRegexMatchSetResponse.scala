package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegexMatchSetResponse extends StObject {
  
  /**
    * Information about the RegexMatchSet that you specified in the GetRegexMatchSet request. For more information, see RegexMatchTuple.
    */
  var RegexMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.RegexMatchSet] = js.native
}
object GetRegexMatchSetResponse {
  
  @scala.inline
  def apply(): GetRegexMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegexMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetRegexMatchSetResponseMutableBuilder[Self <: GetRegexMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexMatchSet(value: RegexMatchSet): Self = StObject.set(x, "RegexMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexMatchSetUndefined: Self = StObject.set(x, "RegexMatchSet", js.undefined)
  }
}
