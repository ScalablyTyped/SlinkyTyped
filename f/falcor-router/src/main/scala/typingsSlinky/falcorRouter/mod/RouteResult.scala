package typingsSlinky.falcorRouter.mod

import typingsSlinky.falcorJsonGraph.mod.JSONEnvelope
import typingsSlinky.falcorJsonGraph.mod.PathValue_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.falcorJsonGraph.mod.PathValue_
  - js.Array[typingsSlinky.falcorJsonGraph.mod.PathValue_]
  - typingsSlinky.falcorJsonGraph.mod.JSONEnvelope[js.Any]
*/
trait RouteResult extends js.Object

object RouteResult {
  @scala.inline
  implicit def apply(value: js.Array[PathValue_]): RouteResult = value.asInstanceOf[RouteResult]
  @scala.inline
  implicit def apply(value: JSONEnvelope[js.Any]): RouteResult = value.asInstanceOf[RouteResult]
  @scala.inline
  implicit def apply(value: PathValue_): RouteResult = value.asInstanceOf[RouteResult]
}

