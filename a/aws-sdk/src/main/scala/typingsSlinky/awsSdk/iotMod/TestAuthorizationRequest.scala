package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAuthorizationRequest extends js.Object {
  /**
    * A list of authorization info objects. Simulating authorization will create a response for each authInfo object in the list.
    */
  var authInfos: AuthInfos = js.native
  /**
    * The MQTT client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  /**
    * When testing custom authorization, the policies specified here are treated as if they are attached to the principal being authorized.
    */
  var policyNamesToAdd: js.UndefOr[PolicyNames] = js.native
  /**
    * When testing custom authorization, the policies specified here are treated as if they are not attached to the principal being authorized.
    */
  var policyNamesToSkip: js.UndefOr[PolicyNames] = js.native
  /**
    * The principal.
    */
  var principal: js.UndefOr[Principal] = js.native
}

object TestAuthorizationRequest {
  @scala.inline
  def apply(authInfos: AuthInfos): TestAuthorizationRequest = {
    val __obj = js.Dynamic.literal(authInfos = authInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAuthorizationRequest]
  }
  @scala.inline
  implicit class TestAuthorizationRequestOps[Self <: TestAuthorizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthInfos(value: AuthInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: ClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCognitoIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cognitoIdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyNamesToAdd(value: PolicyNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyNamesToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyNamesToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyNamesToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyNamesToSkip(value: PolicyNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyNamesToSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyNamesToSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyNamesToSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: Principal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(js.undefined)
        ret
    }
  }
  
}

