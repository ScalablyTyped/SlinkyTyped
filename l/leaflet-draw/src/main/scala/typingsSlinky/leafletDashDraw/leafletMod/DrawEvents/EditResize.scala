package typingsSlinky.leafletDashDraw.leafletMod.DrawEvents

import typingsSlinky.leaflet.leafletMod.Layer
import typingsSlinky.leaflet.leafletMod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditResize extends LeafletEvent {
  /**
    * Layer that was just resized.
    */
  @JSName("layer")
  var layer_EditResize: Layer
}

object EditResize {
  @scala.inline
  def apply(layer: Layer, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): EditResize = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditResize]
  }
}

