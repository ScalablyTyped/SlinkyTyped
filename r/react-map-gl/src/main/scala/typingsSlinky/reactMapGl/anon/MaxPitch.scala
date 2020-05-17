package typingsSlinky.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxPitch extends js.Object {
  var maxPitch: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minPitch: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
}

object MaxPitch {
  @scala.inline
  def apply(): MaxPitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPitch]
  }
  @scala.inline
  implicit class MaxPitchOps[Self <: MaxPitch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
  }
  
}

