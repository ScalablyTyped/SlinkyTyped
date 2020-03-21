package typingsSlinky.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSideVertexIndices extends js.Object {
  var `class`: String
  var sideVertexIndices: scala.scalajs.js.typedarray.Uint32Array
  var vertexData: scala.scalajs.js.typedarray.Float64Array
}

object AnonSideVertexIndices {
  @scala.inline
  def apply(
    `class`: String,
    sideVertexIndices: scala.scalajs.js.typedarray.Uint32Array,
    vertexData: scala.scalajs.js.typedarray.Float64Array
  ): AnonSideVertexIndices = {
    val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSideVertexIndices]
  }
}

