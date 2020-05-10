package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a whole or partial calendar date, e.g. a birthday. The time of
  * day and time zone are either specified elsewhere or are not significant.
  * The date is relative to the Proleptic Gregorian Calendar. This can
  * represent:  * A full date, with non-zero year, month and day values * A
  * month and day value, with a zero year, e.g. an anniversary * A year on its
  * own, with zero month and day values * A year and month value, with a zero
  * day, e.g. a credit card expiration date  Related types are
  * google.type.TimeOfDay and `google.protobuf.Timestamp`.
  */
@js.native
trait SchemaDate extends js.Object {
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
    * if specifying a year by itself or a year and month where the day is not
    * significant.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * Month of year. Must be from 1 to 12, or 0 if specifying a year without a
    * month and day.
    */
  var month: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a
    * year.
    */
  var year: js.UndefOr[Double] = js.native
}

object SchemaDate {
  @scala.inline
  def apply(): SchemaDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDate]
  }
  @scala.inline
  implicit class SchemaDateOps[Self <: SchemaDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

