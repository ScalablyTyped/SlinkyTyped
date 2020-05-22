package typingsSlinky.openjscad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideVertexIndices extends js.Object {
  var `class`: String
  var sideVertexIndices: js.typedarray.Uint32Array
  var vertexData: js.typedarray.Float64Array
}

object SideVertexIndices {
  @scala.inline
  def apply(
    `class`: String,
    sideVertexIndices: js.typedarray.Uint32Array,
    vertexData: js.typedarray.Float64Array
  ): SideVertexIndices = {
    val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideVertexIndices]
  }
}

