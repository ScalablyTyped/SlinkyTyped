package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayAuthorizerResult extends js.Object {
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.native
  var policyDocument: PolicyDocument = js.native
  var principalId: String = js.native
  var usageIdentifierKey: js.UndefOr[String | Null] = js.native
}

object APIGatewayAuthorizerResult {
  @scala.inline
  def apply(policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerResult = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerResult]
  }
  @scala.inline
  implicit class APIGatewayAuthorizerResultOps[Self <: APIGatewayAuthorizerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDocument(value: PolicyDocument): Self = {
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
    @scala.inline
    def withContext(value: APIGatewayAuthorizerResultContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withUsageIdentifierKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageIdentifierKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageIdentifierKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageIdentifierKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageIdentifierKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageIdentifierKey")(null)
        ret
    }
  }
  
}

