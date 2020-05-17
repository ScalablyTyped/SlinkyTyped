package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import typingsSlinky.octokitRest.mod.Octokit.TeamsReviewProjectInOrgParams
import typingsSlinky.octokitRest.mod.Octokit.TeamsReviewProjectInOrgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `581` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[TeamsReviewProjectInOrgResponse]] = js.native
  def apply(params: RequestOptions with TeamsReviewProjectInOrgParams): js.Promise[Response[TeamsReviewProjectInOrgResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

