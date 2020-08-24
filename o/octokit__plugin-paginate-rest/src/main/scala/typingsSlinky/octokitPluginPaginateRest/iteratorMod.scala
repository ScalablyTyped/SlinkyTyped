package typingsSlinky.octokitPluginPaginateRest

import typingsSlinky.octokitCore.mod.Octokit
import typingsSlinky.octokitPluginPaginateRest.anon.AsyncIterator
import typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = js.native
  def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = js.native
  def iterator(octokit: Octokit, route: Route): AsyncIterator = js.native
  def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = js.native
}

