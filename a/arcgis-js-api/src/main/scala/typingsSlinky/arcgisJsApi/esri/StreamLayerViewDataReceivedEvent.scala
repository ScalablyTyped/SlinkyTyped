package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayerViewDataReceivedEvent extends js.Object {
  var attributes: js.Any = js.native
  var geometry: js.Any = js.native
}

object StreamLayerViewDataReceivedEvent {
  @scala.inline
  def apply(attributes: js.Any, geometry: js.Any): StreamLayerViewDataReceivedEvent = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLayerViewDataReceivedEvent]
  }
  @scala.inline
  implicit class StreamLayerViewDataReceivedEventOps[Self <: StreamLayerViewDataReceivedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

