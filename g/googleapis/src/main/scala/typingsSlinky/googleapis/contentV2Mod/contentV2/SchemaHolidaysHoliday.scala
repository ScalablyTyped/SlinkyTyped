package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHolidaysHoliday extends js.Object {
  /**
    * The CLDR territory code of the country in which the holiday is available.
    * E.g. &quot;US&quot;, &quot;DE&quot;, &quot;GB&quot;. A holiday cutoff can
    * only be configured in a shipping settings service with matching delivery
    * country. Always present.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Date of the holiday, in ISO 8601 format. E.g. &quot;2016-12-25&quot; for
    * Christmas 2016. Always present.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Date on which the order has to arrive at the customer&#39;s, in ISO 8601
    * format. E.g. &quot;2016-12-24&quot; for 24th December 2016. Always
    * present.
    */
  var deliveryGuaranteeDate: js.UndefOr[String] = js.native
  /**
    * Hour of the day in the delivery location&#39;s timezone on the guaranteed
    * delivery date by which the order has to arrive at the customer&#39;s.
    * Possible values are: 0 (midnight), 1, ..., 12 (noon), 13, ..., 23. Always
    * present.
    */
  var deliveryGuaranteeHour: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the holiday to be used when configuring holiday
    * cutoffs. Always present.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The holiday type. Always present.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaHolidaysHoliday {
  @scala.inline
  def apply(): SchemaHolidaysHoliday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHolidaysHoliday]
  }
  @scala.inline
  implicit class SchemaHolidaysHolidayOps[Self <: SchemaHolidaysHoliday] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryGuaranteeDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryGuaranteeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryGuaranteeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryGuaranteeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryGuaranteeHour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryGuaranteeHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryGuaranteeHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryGuaranteeHour")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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

