package typingsSlinky.ol.projMod

import typingsSlinky.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", "addEquivalentTransforms")
@js.native
object addEquivalentTransforms extends js.Object {
  def apply(
    projections1: js.Array[default],
    projections2: js.Array[default],
    forwardTransform: TransformFunction,
    inverseTransform: TransformFunction
  ): Unit = js.native
}

