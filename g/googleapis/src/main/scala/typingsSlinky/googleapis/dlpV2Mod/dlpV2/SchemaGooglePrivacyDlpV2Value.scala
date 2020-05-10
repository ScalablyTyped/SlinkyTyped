package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of primitive values supported by the system. Note that for the purposes
  * of inspection or transformation, the number of bytes considered to comprise
  * a &#39;Value&#39; is based on its representation as a UTF-8 encoded string.
  * For example, if &#39;integer_value&#39; is set to 123456789, the number of
  * bytes would be counted as 9, even though an int64 only holds up to 8 bytes
  * of data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Value extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValue: js.UndefOr[SchemaGoogleTypeDate] = js.native
  var dayOfWeekValue: js.UndefOr[String] = js.native
  var floatValue: js.UndefOr[Double] = js.native
  var integerValue: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var timeValue: js.UndefOr[SchemaGoogleTypeTimeOfDay] = js.native
  var timestampValue: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Value {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Value]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ValueOps[Self <: SchemaGooglePrivacyDlpV2Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDateValue(value: SchemaGoogleTypeDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfWeekValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeekValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeekValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeekValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeValue(value: SchemaGoogleTypeTimeOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampValue")(js.undefined)
        ret
    }
  }
  
}

