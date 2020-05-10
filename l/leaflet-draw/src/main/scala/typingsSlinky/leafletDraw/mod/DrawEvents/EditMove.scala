package typingsSlinky.leafletDraw.mod.DrawEvents

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditMove extends LeafletEvent {
  /**
    * Layer that was just moved.
    */
  @JSName("layer")
  var layer_EditMove: Layer = js.native
}

object EditMove {
  @scala.inline
  def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditMove = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditMove]
  }
  @scala.inline
  implicit class EditMoveOps[Self <: EditMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

