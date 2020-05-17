package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EmptyParams
import typingsSlinky.octokitRest.mod.Octokit.MetaGetResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get191 extends js.Object {
  /**
    * This endpoint provides a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://help.github.com/articles/about-github-s-ip-addresses/)."
    */
  @JSName("get")
  var get_Original: `191` = js.native
  /**
    * This endpoint provides a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://help.github.com/articles/about-github-s-ip-addresses/)."
    */
  def get(): js.Promise[Response[MetaGetResponse]] = js.native
  def get(params: RequestOptions with EmptyParams): js.Promise[Response[MetaGetResponse]] = js.native
}

