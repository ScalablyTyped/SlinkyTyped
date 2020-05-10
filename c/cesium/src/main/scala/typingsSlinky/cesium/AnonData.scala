package typingsSlinky.cesium

import typingsSlinky.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonData extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var isStartIncluded: js.UndefOr[Boolean] = js.native
  var isStopIncluded: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[JulianDate] = js.native
  var stop: js.UndefOr[JulianDate] = js.native
}

object AnonData {
  @scala.inline
  def apply(): AnonData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonData]
  }
  @scala.inline
  implicit class AnonDataOps[Self <: AnonData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStartIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStartIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStartIncluded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStopIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopIncluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStopIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopIncluded")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: JulianDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: JulianDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

