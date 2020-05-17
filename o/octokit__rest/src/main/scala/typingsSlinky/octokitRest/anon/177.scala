package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `177` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[IssuesRemoveLabelResponse]] = js.native
  def apply(params: RequestOptions with IssuesRemoveLabelParamsDeprecatedNumber with IssuesRemoveLabelParams): js.Promise[Response[IssuesRemoveLabelResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

