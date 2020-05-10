package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderDataPointOptions extends js.Object {
  var fillOpacity: Double = js.native
  var radius: Double = js.native
  var strokeOpacity: Double = js.native
}

object RenderDataPointOptions {
  @scala.inline
  def apply(fillOpacity: Double, radius: Double, strokeOpacity: Double): RenderDataPointOptions = {
    val __obj = js.Dynamic.literal(fillOpacity = fillOpacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDataPointOptions]
  }
  @scala.inline
  implicit class RenderDataPointOptionsOps[Self <: RenderDataPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

