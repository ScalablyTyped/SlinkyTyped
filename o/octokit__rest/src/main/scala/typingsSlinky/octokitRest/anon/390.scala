package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitParamsDeprecatedCommitSha
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitParamsDeprecatedSha
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `390` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[ReposGetCommitResponse]] = js.native
  def apply(
    params: RequestOptions with ReposGetCommitParamsDeprecatedSha with ReposGetCommitParamsDeprecatedCommitSha with ReposGetCommitParams
  ): js.Promise[Response[ReposGetCommitResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

