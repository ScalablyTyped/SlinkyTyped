package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import typingsSlinky.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typingsSlinky.awsLambda.awsLambdaStrings.REQUEST
import typingsSlinky.awsLambda.awsLambdaStrings.TOKEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
  - typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
*/
trait APIGatewayAuthorizerEvent extends js.Object
object APIGatewayAuthorizerEvent {
  
  @scala.inline
  def APIGatewayTokenAuthorizerEvent(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerEvent]
  }
  
  @scala.inline
  def APIGatewayRequestAuthorizerEvent(
    httpMethod: String,
    methodArn: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
    resource: String,
    `type`: REQUEST
  ): APIGatewayAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerEvent]
  }
}
