package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIPSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  /**
    * The IPSetId of the IPSet that you want to delete. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
}

object DeleteIPSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, IPSetId: ResourceId): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
  @scala.inline
  implicit class DeleteIPSetRequestOps[Self <: DeleteIPSetRequest] (val x: Self) extends AnyVal {
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
    def withIPSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

