package typingsSlinky.falcorRouter.mod

import typingsSlinky.falcorJsonGraph.mod.InvalidPath
import typingsSlinky.falcorJsonGraph.mod.JSONGraphEnvelope
import typingsSlinky.falcorJsonGraph.mod.PathValue_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.falcorJsonGraph.mod.PathValue_
  - typingsSlinky.falcorJsonGraph.mod.InvalidPath
  - js.Array[
typingsSlinky.falcorJsonGraph.mod.PathValue_ | typingsSlinky.falcorJsonGraph.mod.InvalidPath]
  - typingsSlinky.falcorJsonGraph.mod.JSONGraphEnvelope
*/
trait CallRouteResult extends js.Object

object CallRouteResult {
  @scala.inline
  implicit def apply(value: js.Array[PathValue_ | InvalidPath]): CallRouteResult = value.asInstanceOf[CallRouteResult]
  @scala.inline
  implicit def apply(value: InvalidPath): CallRouteResult = value.asInstanceOf[CallRouteResult]
  @scala.inline
  implicit def apply(value: JSONGraphEnvelope): CallRouteResult = value.asInstanceOf[CallRouteResult]
  @scala.inline
  implicit def apply(value: PathValue_): CallRouteResult = value.asInstanceOf[CallRouteResult]
}

