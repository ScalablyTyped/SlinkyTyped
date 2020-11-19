package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexMatchSet extends js.Object {
  
  /**
    * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The RegexMatchSetId for a RegexMatchSet. You use RegexMatchSetId to get information about a RegexMatchSet (see GetRegexMatchSet), update a RegexMatchSet (see UpdateRegexMatchSet), insert a RegexMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a RegexMatchSet from AWS WAF (see DeleteRegexMatchSet).  RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: js.UndefOr[ResourceId] = js.native
  
  /**
    * Contains an array of RegexMatchTuple objects. Each RegexMatchTuple object contains:    The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.  
    */
  var RegexMatchTuples: js.UndefOr[typingsSlinky.awsSdk.wafMod.RegexMatchTuples] = js.native
}
object RegexMatchSet {
  
  @scala.inline
  def apply(): RegexMatchSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexMatchSet]
  }
  
  @scala.inline
  implicit class RegexMatchSetOps[Self <: RegexMatchSet] (val x: Self) extends AnyVal {
    
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
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRegexMatchSetId(value: ResourceId): Self = this.set("RegexMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMatchSetId: Self = this.set("RegexMatchSetId", js.undefined)
    
    @scala.inline
    def setRegexMatchTuplesVarargs(value: RegexMatchTuple*): Self = this.set("RegexMatchTuples", js.Array(value :_*))
    
    @scala.inline
    def setRegexMatchTuples(value: RegexMatchTuples): Self = this.set("RegexMatchTuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMatchTuples: Self = this.set("RegexMatchTuples", js.undefined)
  }
}
