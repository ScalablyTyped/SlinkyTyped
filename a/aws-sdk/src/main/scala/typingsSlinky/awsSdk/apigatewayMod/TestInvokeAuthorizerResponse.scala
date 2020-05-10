package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInvokeAuthorizerResponse extends js.Object {
  var authorization: js.UndefOr[MapOfStringToList] = js.native
  /**
    * The open identity claims, with any supported custom attributes, returned from the Cognito Your User Pool configured for the API.
    */
  var claims: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The HTTP status code that the client would have received. Value is 0 if the authorizer succeeded.
    */
  var clientStatus: js.UndefOr[Integer] = js.native
  /**
    * The execution latency of the test authorizer request.
    */
  var latency: js.UndefOr[Long] = js.native
  /**
    * The API Gateway execution log for the test authorizer request.
    */
  var log: js.UndefOr[String] = js.native
  /**
    * The JSON policy document returned by the Authorizer
    */
  var policy: js.UndefOr[String] = js.native
  /**
    * The principal identity returned by the Authorizer
    */
  var principalId: js.UndefOr[String] = js.native
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
    def withAuthorization(value: MapOfStringToList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withClaims(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(js.undefined)
        ret
    }
    @scala.inline
    def withClientStatus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalId(value: String): Self = {
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
  }
  
}

