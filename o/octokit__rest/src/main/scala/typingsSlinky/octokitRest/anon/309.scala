package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.PullsListCommitsParams
import typingsSlinky.octokitRest.mod.Octokit.PullsListCommitsParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.PullsListCommitsResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `309` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[PullsListCommitsResponse]] = js.native
  def apply(params: RequestOptions with PullsListCommitsParamsDeprecatedNumber with PullsListCommitsParams): js.Promise[Response[PullsListCommitsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

