package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.ReposUploadReleaseAssetParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUploadReleaseAssetParamsDeprecatedFile
import typingsSlinky.octokitRest.mod.Octokit.ReposUploadReleaseAssetResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `489` extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: typingsSlinky.octokitRest.mod.Octokit.Endpoint = js.native
  def apply(): js.Promise[Response[ReposUploadReleaseAssetResponse]] = js.native
  def apply(
    params: RequestOptions with ReposUploadReleaseAssetParamsDeprecatedFile with ReposUploadReleaseAssetParams
  ): js.Promise[Response[ReposUploadReleaseAssetResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

