package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetSummary extends js.Object {
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: ResourceName = js.native
  /**
    * The RegexPatternSetId for a RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
}

object RegexPatternSetSummary {
  @scala.inline
  def apply(Name: ResourceName, RegexPatternSetId: ResourceId): RegexPatternSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetSummary]
  }
  @scala.inline
  implicit class RegexPatternSetSummaryOps[Self <: RegexPatternSetSummary] (val x: Self) extends AnyVal {
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
    def withRegexPatternSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

