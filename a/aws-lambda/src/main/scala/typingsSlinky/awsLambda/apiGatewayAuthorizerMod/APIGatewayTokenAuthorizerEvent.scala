package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import typingsSlinky.awsLambda.awsLambdaStrings.TOKEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIGatewayTokenAuthorizerEvent extends APIGatewayAuthorizerEvent {
  var authorizationToken: String = js.native
  var methodArn: String = js.native
  var `type`: TOKEN = js.native
}

object APIGatewayTokenAuthorizerEvent {
  @scala.inline
  def apply(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayTokenAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayTokenAuthorizerEvent]
  }
  @scala.inline
  implicit class APIGatewayTokenAuthorizerEventOps[Self <: APIGatewayTokenAuthorizerEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TOKEN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

