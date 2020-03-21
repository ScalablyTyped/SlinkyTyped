package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.EmptyParams
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  /**
    * Lists all the emojis available to use on GitHub.
    */
  @JSName("get")
  var get_Original: Anon89 = js.native
  /**
    * Lists all the emojis available to use on GitHub.
    */
  def get(): js.Promise[AnyResponse] = js.native
  def get(params: RequestOptions with EmptyParams): js.Promise[AnyResponse] = js.native
}

