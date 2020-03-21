package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.Endpoint
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateMilestoneParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateMilestoneParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateMilestoneResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon184 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesUpdateMilestoneResponse]] = js.native
  def apply(
    params: RequestOptions with IssuesUpdateMilestoneParamsDeprecatedNumber with IssuesUpdateMilestoneParams
  ): js.Promise[Response[IssuesUpdateMilestoneResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

