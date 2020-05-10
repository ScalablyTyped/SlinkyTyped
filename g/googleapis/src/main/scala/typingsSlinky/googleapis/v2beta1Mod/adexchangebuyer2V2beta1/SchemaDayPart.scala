package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Daypart targeting message that specifies if the ad can be shown only during
  * certain parts of a day/week.
  */
@js.native
trait SchemaDayPart extends js.Object {
  /**
    * The day of the week to target. If unspecified, applicable to all days.
    */
  var dayOfWeek: js.UndefOr[String] = js.native
  /**
    * The ending time of the day for the ad to show (minute level granularity).
    * The end time is exclusive. This field is not available for filtering in
    * PQL queries.
    */
  var endTime: js.UndefOr[SchemaTimeOfDay] = js.native
  /**
    * The starting time of day for the ad to show (minute level granularity).
    * The start time is inclusive. This field is not available for filtering in
    * PQL queries.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.native
}

object SchemaDayPart {
  @scala.inline
  def apply(): SchemaDayPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDayPart]
  }
  @scala.inline
  implicit class SchemaDayPartOps[Self <: SchemaDayPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: SchemaTimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: SchemaTimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

