package typingsSlinky.falcorRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallRouteResult = typingsSlinky.falcorJsonGraph.mod.PathValue_ | typingsSlinky.falcorJsonGraph.mod.InvalidPath | (js.Array[
    typingsSlinky.falcorJsonGraph.mod.PathValue_ | typingsSlinky.falcorJsonGraph.mod.InvalidPath
  ]) | typingsSlinky.falcorJsonGraph.mod.JSONGraphEnvelope
  
  type RoutePathSet = typingsSlinky.falcorJsonGraph.mod.PathSet
  
  type RouteResult = typingsSlinky.falcorJsonGraph.mod.PathValue_ | js.Array[typingsSlinky.falcorJsonGraph.mod.PathValue_] | typingsSlinky.falcorJsonGraph.mod.JSONEnvelope[js.Any]
}
