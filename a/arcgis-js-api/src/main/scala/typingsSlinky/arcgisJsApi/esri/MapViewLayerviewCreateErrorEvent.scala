package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewLayerviewCreateErrorEvent extends js.Object {
  var error: Error = js.native
  var layer: Layer = js.native
}

object MapViewLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, layer: Layer): MapViewLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewLayerviewCreateErrorEvent]
  }
  @scala.inline
  implicit class MapViewLayerviewCreateErrorEventOps[Self <: MapViewLayerviewCreateErrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

