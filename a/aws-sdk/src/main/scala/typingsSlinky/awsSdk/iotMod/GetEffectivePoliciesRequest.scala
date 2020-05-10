package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEffectivePoliciesRequest extends js.Object {
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  /**
    * The principal.
    */
  var principal: js.UndefOr[Principal] = js.native
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object GetEffectivePoliciesRequest {
  @scala.inline
  def apply(): GetEffectivePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePoliciesRequest]
  }
  @scala.inline
  implicit class GetEffectivePoliciesRequestOps[Self <: GetEffectivePoliciesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
  }
  
}

