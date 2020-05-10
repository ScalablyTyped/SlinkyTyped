package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryTime extends js.Object {
  var cutoffTime: js.UndefOr[CutoffTime] = js.native
  var holidayCutoffs: js.UndefOr[js.Array[HolidayCutoff]] = js.native
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.native
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  var minHandlingTimeInDays: js.UndefOr[Double] = js.native
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
  var transitTimeTable: js.UndefOr[TransitTable] = js.native
}

object DeliveryTime {
  @scala.inline
  def apply(): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryTime]
  }
  @scala.inline
  implicit class DeliveryTimeOps[Self <: DeliveryTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCutoffTime(value: CutoffTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoffTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutoffTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoffTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHolidayCutoffs(value: js.Array[HolidayCutoff]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidayCutoffs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidayCutoffs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidayCutoffs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHandlingTimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHandlingTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHandlingTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHandlingTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTransitTimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransitTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTransitTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransitTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHandlingTimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHandlingTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHandlingTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHandlingTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTransitTimeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTransitTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTransitTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTransitTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitTimeTable(value: TransitTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTimeTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitTimeTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitTimeTable")(js.undefined)
        ret
    }
  }
  
}

