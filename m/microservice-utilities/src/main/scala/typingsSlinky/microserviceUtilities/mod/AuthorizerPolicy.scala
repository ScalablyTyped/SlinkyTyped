package typingsSlinky.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerPolicy extends js.Object {
  var policyDocument: js.Object = js.native
  var principalId: String = js.native
}

object AuthorizerPolicy {
  @scala.inline
  def apply(policyDocument: js.Object, principalId: String): AuthorizerPolicy = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerPolicy]
  }
  @scala.inline
  implicit class AuthorizerPolicyOps[Self <: AuthorizerPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDocument(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

