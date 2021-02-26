package typingsSlinky.octokitPluginPaginateRest

import typingsSlinky.octokitCore.mod.Octokit
import typingsSlinky.octokitPluginPaginateRest.typesMod.MapFunction
import typingsSlinky.octokitPluginPaginateRest.typesMod.PaginationResults
import typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginateMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(octokit: Octokit, route: RequestInterface[js.Object]): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(
    octokit: Octokit,
    route: RequestInterface[js.Object],
    parameters: js.UndefOr[scala.Nothing],
    mapFn: MapFunction[_, _]
  ): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(
    octokit: Octokit,
    route: RequestInterface[js.Object],
    parameters: RequestParameters,
    mapFn: MapFunction[_, _]
  ): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(octokit: Octokit, route: Route): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(octokit: Octokit, route: Route, parameters: js.UndefOr[scala.Nothing], mapFn: MapFunction[_, _]): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(octokit: Octokit, route: Route, parameters: RequestParameters): js.Promise[PaginationResults[_]] = js.native
  @JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", "paginate")
  @js.native
  def paginate(octokit: Octokit, route: Route, parameters: RequestParameters, mapFn: MapFunction[_, _]): js.Promise[PaginationResults[_]] = js.native
}
