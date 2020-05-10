package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewPolicy extends js.Object {
  /**
    * Name of the parameter from the Review policy.
    */
  var Parameters: js.UndefOr[PolicyParameterList] = js.native
  /**
    *  Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01 
    */
  var PolicyName: String = js.native
}

object ReviewPolicy {
  @scala.inline
  def apply(PolicyName: String): ReviewPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPolicy]
  }
  @scala.inline
  implicit class ReviewPolicyOps[Self <: ReviewPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: PolicyParameterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
  }
  
}

