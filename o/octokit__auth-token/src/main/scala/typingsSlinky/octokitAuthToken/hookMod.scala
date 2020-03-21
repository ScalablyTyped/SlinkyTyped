package typingsSlinky.octokitAuthToken

import typingsSlinky.octokitAuthToken.typesMod.AnyResponse
import typingsSlinky.octokitAuthToken.typesMod.EndpointOptions
import typingsSlinky.octokitAuthToken.typesMod.RequestInterface
import typingsSlinky.octokitAuthToken.typesMod.RequestParameters
import typingsSlinky.octokitAuthToken.typesMod.Route
import typingsSlinky.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/auth-token/dist-types/hook", JSImport.Namespace)
@js.native
object hookMod extends js.Object {
  def hook(token: Token, request: RequestInterface, route: EndpointOptions | Route): js.Promise[AnyResponse] = js.native
  def hook(
    token: Token,
    request: RequestInterface,
    route: EndpointOptions | Route,
    parameters: RequestParameters
  ): js.Promise[AnyResponse] = js.native
}

