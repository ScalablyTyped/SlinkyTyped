package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchLookupPolicyResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.PolicyToPathList] = js.native
}

object BatchLookupPolicyResponse {
  @scala.inline
  def apply(): BatchLookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchLookupPolicyResponse]
  }
  @scala.inline
  implicit class BatchLookupPolicyResponseOps[Self <: BatchLookupPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyToPathList(value: PolicyToPathList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyToPathList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyToPathList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyToPathList")(js.undefined)
        ret
    }
  }
  
}

