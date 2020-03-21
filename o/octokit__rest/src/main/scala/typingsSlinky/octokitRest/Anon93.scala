package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.ChecksGetSuiteParams
import typingsSlinky.octokitRest.mod.Octokit.ChecksGetSuiteResponse
import typingsSlinky.octokitRest.mod.Octokit.Endpoint
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon93 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ChecksGetSuiteResponse]] = js.native
  def apply(params: RequestOptions with ChecksGetSuiteParams): js.Promise[Response[ChecksGetSuiteResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

