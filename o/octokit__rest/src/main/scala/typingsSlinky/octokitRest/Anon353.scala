package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.Endpoint
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedLine
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedSha
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon353 extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def apply(
    params: RequestOptions with ReposCreateCommitCommentParamsDeprecatedSha with ReposCreateCommitCommentParamsDeprecatedLine with ReposCreateCommitCommentParams
  ): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

