package typingsSlinky.fabric

import typingsSlinky.fabric.fabricImplMod.IGradientOptionsColorStops
import typingsSlinky.fabric.fabricImplMod.IGradientOptionsCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColorStops extends js.Object {
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.native
  var coords: js.UndefOr[IGradientOptionsCoords] = js.native
  var gradientUnits: js.UndefOr[js.Any] = js.native
  var offsetX: js.UndefOr[js.Any] = js.native
  var offsetY: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonColorStops {
  @scala.inline
  def apply(): AnonColorStops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColorStops]
  }
  @scala.inline
  implicit class AnonColorStopsOps[Self <: AnonColorStops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorStops(value: IGradientOptionsColorStops): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStops")(js.undefined)
        ret
    }
    @scala.inline
    def withCoords(value: IGradientOptionsCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientUnits(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

