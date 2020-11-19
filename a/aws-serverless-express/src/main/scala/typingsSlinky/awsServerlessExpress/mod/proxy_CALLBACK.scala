package typingsSlinky.awsServerlessExpress.mod

import typingsSlinky.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typingsSlinky.awsLambda.handlerMod.Context
import typingsSlinky.awsServerlessExpress.awsServerlessExpressStrings.CALLBACK
import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy_CALLBACK extends js.Object {
  
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CALLBACK): ProxyResult = js.native
  def apply(
    server: Server,
    event: APIGatewayProxyEvent,
    context: Context,
    resolutionMode: CALLBACK,
    callback: js.Function2[/* error */ js.Any, /* response */ Response, Unit]
  ): ProxyResult = js.native
}
