package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebACLResponse extends js.Object {
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.LockToken] = js.native
  /**
    * The Web ACL specification. You can modify the settings in this Web ACL and use it to update this Web ACL or create a new one.
    */
  var WebACL: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.WebACL] = js.native
}

object GetWebACLResponse {
  @scala.inline
  def apply(): GetWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLResponse]
  }
  @scala.inline
  implicit class GetWebACLResponseOps[Self <: GetWebACLResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockToken(value: LockToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockToken")(js.undefined)
        ret
    }
    @scala.inline
    def withWebACL(value: WebACL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACL")(js.undefined)
        ret
    }
  }
  
}

