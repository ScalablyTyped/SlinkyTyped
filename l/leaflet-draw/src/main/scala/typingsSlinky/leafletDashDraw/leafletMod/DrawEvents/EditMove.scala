package typingsSlinky.leafletDashDraw.leafletMod.DrawEvents

import typingsSlinky.leaflet.leafletMod.Layer
import typingsSlinky.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMove extends LeafletEvent {
  /**
    * Layer that was just moved.
    */
  @JSName("layer")
  var layer_EditMove: Layer
}

object EditMove {
  @scala.inline
  def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditMove = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditMove]
  }
}

