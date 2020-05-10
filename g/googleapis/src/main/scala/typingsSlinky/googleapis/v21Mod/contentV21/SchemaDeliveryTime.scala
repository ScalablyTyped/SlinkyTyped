package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryTime extends js.Object {
  /**
    * Business days cutoff time definition. If not configured the cutoff time
    * will be defaulted to 8AM PST.
    */
  var cutoffTime: js.UndefOr[SchemaCutoffTime] = js.native
  /**
    * Holiday cutoff definitions. If configured, they specify order cutoff
    * times for holiday-specific shipping.
    */
  var holidayCutoffs: js.UndefOr[js.Array[SchemaHolidayCutoff]] = js.native
  /**
    * Maximum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped. Must be greater than or equal
    * to minHandlingTimeInDays.
    */
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Maximum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Minimum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped.
    */
  var minHandlingTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Minimum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Either
    * {min,max}transitTimeInDays or transitTimeTable must be set, but not both.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Transit time table, number of business days spent in transit based on row
    * and column dimensions. Either {min,max}transitTimeInDays or
    * transitTimeTable can be set, but not both.
    */
  var transitTimeTable: js.UndefOr[SchemaTransitTable] = js.native
}

object SchemaDeliveryTime {
  @scala.inline
  def apply(): SchemaDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryTime]
  }
  @scala.inline
  implicit class SchemaDeliveryTimeOps[Self <: SchemaDeliveryTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCutoffTime(value: SchemaCutoffTime): Self = {
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
    def withHolidayCutoffs(value: js.Array[SchemaHolidayCutoff]): Self = {
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
    def withTransitTimeTable(value: SchemaTransitTable): Self = {
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

