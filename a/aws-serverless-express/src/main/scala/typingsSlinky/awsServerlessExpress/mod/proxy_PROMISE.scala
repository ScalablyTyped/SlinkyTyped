package typingsSlinky.awsServerlessExpress.mod

import typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typingsSlinky.awsLambda.handlerMod.Context
import typingsSlinky.awsServerlessExpress.awsServerlessExpressStrings.PROMISE
import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy_PROMISE extends js.Object {
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: PROMISE): ProxyResult = js.native
}

