package typingsSlinky.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetGeometryEvent extends js.Object {
  var feature: Feature = js.native
  var newGeometry: Geometry = js.native
  var oldGeometry: Geometry = js.native
}

object SetGeometryEvent {
  @scala.inline
  def apply(feature: Feature, newGeometry: Geometry, oldGeometry: Geometry): SetGeometryEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], newGeometry = newGeometry.asInstanceOf[js.Any], oldGeometry = oldGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetGeometryEvent]
  }
  @scala.inline
  implicit class SetGeometryEventOps[Self <: SetGeometryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewGeometry(value: Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldGeometry(value: Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldGeometry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

