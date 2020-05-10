package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] extends js.Object {
  var context: TAuthorizerContext = js.native
  var policyDocument: PolicyDocument = js.native
  var principalId: String = js.native
  var usageIdentifierKey: js.UndefOr[String | Null] = js.native
}

object APIGatewayAuthorizerWithContextResult {
  @scala.inline
  def apply[TAuthorizerContext](context: TAuthorizerContext, policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  }
  @scala.inline
  implicit class APIGatewayAuthorizerWithContextResultOps[Self[tauthorizercontext] <: APIGatewayAuthorizerWithContextResult[tauthorizercontext], TAuthorizerContext] (val x: Self[TAuthorizerContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAuthorizerContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAuthorizerContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TAuthorizerContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TAuthorizerContext] with Other]
    @scala.inline
    def withContext(value: TAuthorizerContext): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyDocument(value: PolicyDocument): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipalId(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsageIdentifierKey(value: String): Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageIdentifierKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageIdentifierKey: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageIdentifierKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageIdentifierKeyNull: Self[TAuthorizerContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageIdentifierKey")(null)
        ret
    }
  }
  
}

