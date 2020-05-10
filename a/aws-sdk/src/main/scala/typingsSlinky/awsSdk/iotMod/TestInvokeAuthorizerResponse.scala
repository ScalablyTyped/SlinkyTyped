package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeAuthorizerResponse extends js.Object {
  /**
    * The number of seconds after which the connection is terminated.
    */
  var disconnectAfterInSeconds: js.UndefOr[Seconds] = js.native
  /**
    * True if the token is authenticated, otherwise false.
    */
  var isAuthenticated: js.UndefOr[IsAuthenticated] = js.native
  /**
    * IAM policy documents.
    */
  var policyDocuments: js.UndefOr[PolicyDocuments] = js.native
  /**
    * The principal ID.
    */
  var principalId: js.UndefOr[PrincipalId] = js.native
  /**
    * The number of seconds after which the temporary credentials are refreshed.
    */
  var refreshAfterInSeconds: js.UndefOr[Seconds] = js.native
}

object TestInvokeAuthorizerResponse {
  @scala.inline
  def apply(): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
  @scala.inline
  implicit class TestInvokeAuthorizerResponseOps[Self <: TestInvokeAuthorizerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnectAfterInSeconds(value: Seconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectAfterInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisconnectAfterInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectAfterInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAuthenticated(value: IsAuthenticated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAuthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDocuments(value: PolicyDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocuments")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalId(value: PrincipalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshAfterInSeconds(value: Seconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshAfterInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshAfterInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshAfterInSeconds")(js.undefined)
        ret
    }
  }
  
}

