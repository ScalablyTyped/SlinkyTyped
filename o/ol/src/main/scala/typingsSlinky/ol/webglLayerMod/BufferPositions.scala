package typingsSlinky.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferPositions extends js.Object {
  var indexPosition: Double = js.native
  var vertexPosition: Double = js.native
}

object BufferPositions {
  @scala.inline
  def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
    val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferPositions]
  }
  @scala.inline
  implicit class BufferPositionsOps[Self <: BufferPositions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

