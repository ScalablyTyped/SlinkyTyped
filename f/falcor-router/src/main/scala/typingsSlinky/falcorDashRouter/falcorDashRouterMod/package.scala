package typingsSlinky.falcorDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object falcorDashRouterMod {
  import typingsSlinky.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.InvalidPath
  import typingsSlinky.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONEnvelope
  import typingsSlinky.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONGraphEnvelope
  import typingsSlinky.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.PathSet
  import typingsSlinky.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.PathValue

  type CallRouteResult = PathValue | InvalidPath | (js.Array[PathValue | InvalidPath]) | JSONGraphEnvelope
  type RoutePathSet = PathSet
  type RouteResult = PathValue | js.Array[PathValue] | JSONEnvelope[js.Any]
}
