package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapViewLayerviewCreateEvent extends js.Object {
  var layer: Layer = js.native
  var layerView: LayerView = js.native
}

object MapViewLayerviewCreateEvent {
  @scala.inline
  def apply(layer: Layer, layerView: LayerView): MapViewLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerView = layerView.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewLayerviewCreateEvent]
  }
  @scala.inline
  implicit class MapViewLayerviewCreateEventOps[Self <: MapViewLayerviewCreateEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLayerView(value: LayerView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

