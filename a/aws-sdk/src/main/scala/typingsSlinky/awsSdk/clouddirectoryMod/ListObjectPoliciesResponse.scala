package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectPoliciesResponse extends js.Object {
  /**
    * A list of policy ObjectIdentifiers, that are attached to the object.
    */
  var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListObjectPoliciesResponse {
  @scala.inline
  def apply(): ListObjectPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectPoliciesResponse]
  }
  @scala.inline
  implicit class ListObjectPoliciesResponseOps[Self <: ListObjectPoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachedPolicyIds(value: ObjectIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedPolicyIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedPolicyIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedPolicyIds")(js.undefined)
        ret
    }
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
  }
  
}

