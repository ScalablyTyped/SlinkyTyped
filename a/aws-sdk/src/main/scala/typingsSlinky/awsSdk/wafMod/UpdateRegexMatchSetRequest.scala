package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRegexMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The RegexMatchSetId of the RegexMatchSet that you want to update. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
    */
  var RegexMatchSetId: ResourceId = js.native
  /**
    * An array of RegexMatchSetUpdate objects that you want to insert into or delete from a RegexMatchSet. For more information, see RegexMatchTuple.
    */
  var Updates: RegexMatchSetUpdates = js.native
}

object UpdateRegexMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexMatchSetId: ResourceId, Updates: RegexMatchSetUpdates): UpdateRegexMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RegexMatchSetId = RegexMatchSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegexMatchSetRequest]
  }
  @scala.inline
  implicit class UpdateRegexMatchSetRequestOps[Self <: UpdateRegexMatchSetRequest] (val x: Self) extends AnyVal {
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
    def withRegexMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdates(value: RegexMatchSetUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

