package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AppsGetRepoInstallationParams
import typingsSlinky.octokitRest.mod.Octokit.AppsGetRepoInstallationResponse
import typingsSlinky.octokitRest.mod.Octokit.Endpoint
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon72 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[AppsGetRepoInstallationResponse]] = js.native
  def apply(params: RequestOptions with AppsGetRepoInstallationParams): js.Promise[Response[AppsGetRepoInstallationResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

