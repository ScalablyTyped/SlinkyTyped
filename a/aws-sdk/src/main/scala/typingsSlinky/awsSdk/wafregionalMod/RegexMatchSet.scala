package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var RegexMatchTuples: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.RegexMatchTuples] = js.native
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
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMatchSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexMatchTuples(value: RegexMatchTuples): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMatchTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchTuples")(js.undefined)
        ret
    }
  }
  
}

