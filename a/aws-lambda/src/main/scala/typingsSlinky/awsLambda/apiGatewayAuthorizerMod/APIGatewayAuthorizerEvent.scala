package typingsSlinky.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
  - typingsSlinky.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
*/
trait APIGatewayAuthorizerEvent extends js.Object

object APIGatewayAuthorizerEvent {
  @scala.inline
  implicit def apply(value: APIGatewayRequestAuthorizerEvent): APIGatewayAuthorizerEvent = value.asInstanceOf[APIGatewayAuthorizerEvent]
  @scala.inline
  implicit def apply(value: APIGatewayTokenAuthorizerEvent): APIGatewayAuthorizerEvent = value.asInstanceOf[APIGatewayAuthorizerEvent]
}

