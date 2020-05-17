package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import typingsSlinky.octokitRest.mod.Octokit.UsersGetGpgKeyParams
import typingsSlinky.octokitRest.mod.Octokit.UsersGetGpgKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `606` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  def apply(params: RequestOptions with UsersGetGpgKeyParams): js.Promise[Response[UsersGetGpgKeyResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

