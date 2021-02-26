package typingsSlinky.octokitPluginPaginateRest

import typingsSlinky.octokitCore.mod.Octokit
import typingsSlinky.octokitPluginPaginateRest.anon.AsyncIterator
import typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: Route): AsyncIterator = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", "iterator")
  @js.native
  def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = js.native
}
