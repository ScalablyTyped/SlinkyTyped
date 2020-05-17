package typingsSlinky.leaflet.mod

import typingsSlinky.leaflet.mod.DomEvent.PropagableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeafletEvent extends PropagableEvent {
  /**
    * @deprecated The same as {@link LeafletEvent.propagatedFrom propagatedFrom}.
    */
  var layer: js.Any = js.native
  var propagatedFrom: js.Any = js.native
  var sourceTarget: js.Any = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object LeafletEvent {
  @scala.inline
  def apply(layer: js.Any, propagatedFrom: js.Any, sourceTarget: js.Any, target: js.Any, `type`: String): LeafletEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletEvent]
  }
  @scala.inline
  implicit class LeafletEventOps[Self <: LeafletEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagatedFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagatedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

