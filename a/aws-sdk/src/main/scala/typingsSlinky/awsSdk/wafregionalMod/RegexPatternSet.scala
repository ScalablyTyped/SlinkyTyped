package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSet extends js.Object {
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The identifier for the RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
  /**
    * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternStrings: typingsSlinky.awsSdk.wafregionalMod.RegexPatternStrings = js.native
}

object RegexPatternSet {
  @scala.inline
  def apply(RegexPatternSetId: ResourceId, RegexPatternStrings: RegexPatternStrings): RegexPatternSet = {
    val __obj = js.Dynamic.literal(RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], RegexPatternStrings = RegexPatternStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSet]
  }
  @scala.inline
  implicit class RegexPatternSetOps[Self <: RegexPatternSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegexPatternSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexPatternStrings(value: RegexPatternStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternStrings")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

