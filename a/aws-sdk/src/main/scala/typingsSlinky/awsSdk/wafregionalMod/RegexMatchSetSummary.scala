package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexMatchSetSummary extends StObject {
  
  /**
    * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
    */
  var Name: ResourceName = js.native
  
  /**
    * The RegexMatchSetId for a RegexMatchSet. You use RegexMatchSetId to get information about a RegexMatchSet, update a RegexMatchSet, remove a RegexMatchSet from a Rule, and delete a RegexMatchSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId = js.native
}
object RegexMatchSetSummary {
  
  @scala.inline
  def apply(Name: ResourceName, RegexMatchSetId: ResourceId): RegexMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegexMatchSetId = RegexMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetSummary]
  }
  
  @scala.inline
  implicit class RegexMatchSetSummaryMutableBuilder[Self <: RegexMatchSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexMatchSetId(value: ResourceId): Self = StObject.set(x, "RegexMatchSetId", value.asInstanceOf[js.Any])
  }
}
