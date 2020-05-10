package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPolicyAttachmentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.native
}

object ListPolicyAttachmentsResponse {
  @scala.inline
  def apply(): ListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyAttachmentsResponse]
  }
  @scala.inline
  implicit class ListPolicyAttachmentsResponseOps[Self <: ListPolicyAttachmentsResponse] (val x: Self) extends AnyVal {
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
    def withObjectIdentifiers(value: ObjectIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifiers")(js.undefined)
        ret
    }
  }
  
}

