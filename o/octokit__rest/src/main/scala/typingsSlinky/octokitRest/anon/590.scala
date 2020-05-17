package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import typingsSlinky.octokitRest.mod.Octokit.TeamsUpdateInOrgParams
import typingsSlinky.octokitRest.mod.Octokit.TeamsUpdateInOrgParamsDeprecatedPermission
import typingsSlinky.octokitRest.mod.Octokit.TeamsUpdateInOrgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `590` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[TeamsUpdateInOrgResponse]] = js.native
  def apply(params: RequestOptions with TeamsUpdateInOrgParamsDeprecatedPermission with TeamsUpdateInOrgParams): js.Promise[Response[TeamsUpdateInOrgResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

