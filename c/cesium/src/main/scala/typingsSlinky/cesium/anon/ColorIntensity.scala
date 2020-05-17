package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorIntensity extends js.Object {
  var color: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var intensity: js.UndefOr[Double] = js.native
}

object ColorIntensity {
  @scala.inline
  def apply(): ColorIntensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorIntensity]
  }
  @scala.inline
  implicit class ColorIntensityOps[Self <: ColorIntensity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: typingsSlinky.cesium.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(js.undefined)
        ret
    }
  }
  
}

