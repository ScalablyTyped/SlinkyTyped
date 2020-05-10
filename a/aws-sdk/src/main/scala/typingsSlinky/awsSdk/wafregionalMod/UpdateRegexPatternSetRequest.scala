package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRegexPatternSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to update. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
  /**
    * An array of RegexPatternSetUpdate objects that you want to insert into or delete from a RegexPatternSet.
    */
  var Updates: RegexPatternSetUpdates = js.native
}

object UpdateRegexPatternSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexPatternSetId: ResourceId, Updates: RegexPatternSetUpdates): UpdateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegexPatternSetRequest]
  }
  @scala.inline
  implicit class UpdateRegexPatternSetRequestOps[Self <: UpdateRegexPatternSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexPatternSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdates(value: RegexPatternSetUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

