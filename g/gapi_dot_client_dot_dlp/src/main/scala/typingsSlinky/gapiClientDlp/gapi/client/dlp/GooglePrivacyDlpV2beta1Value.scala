package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Value extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValue: js.UndefOr[GoogleTypeDate] = js.native
  var floatValue: js.UndefOr[Double] = js.native
  var integerValue: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var timeValue: js.UndefOr[GoogleTypeTimeOfDay] = js.native
  var timestampValue: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1Value {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Value]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ValueOps[Self <: GooglePrivacyDlpV2beta1Value] (val x: Self) extends AnyVal {
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
    def withDateValue(value: GoogleTypeDate): Self = {
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
    def withTimeValue(value: GoogleTypeTimeOfDay): Self = {
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

