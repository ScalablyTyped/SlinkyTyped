package typingsSlinky.amapJsApi.AMap.LabelsLayer

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelsLayerEvent[I] extends js.Object {
  var data: EventData = js.native
  var lnglat: LngLat = js.native
  var pixel: Pixel = js.native
  var target: I = js.native
}

object LabelsLayerEvent {
  @scala.inline
  def apply[I](data: EventData, lnglat: LngLat, pixel: Pixel, target: I): LabelsLayerEvent[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelsLayerEvent[I]]
  }
  @scala.inline
  implicit class LabelsLayerEventOps[Self[i] <: LabelsLayerEvent[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withData(value: EventData): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLnglat(value: LngLat): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lnglat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixel(value: Pixel): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: I): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

