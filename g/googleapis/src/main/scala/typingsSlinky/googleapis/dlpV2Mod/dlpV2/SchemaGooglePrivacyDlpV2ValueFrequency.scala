package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a field, including its frequency.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ValueFrequency extends js.Object {
  /**
    * How many times the value is contained in the field.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * A value contained in the field in question.
    */
  var value: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}

object SchemaGooglePrivacyDlpV2ValueFrequency {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ValueFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ValueFrequency]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ValueFrequencyOps[Self <: SchemaGooglePrivacyDlpV2ValueFrequency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: SchemaGooglePrivacyDlpV2Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

