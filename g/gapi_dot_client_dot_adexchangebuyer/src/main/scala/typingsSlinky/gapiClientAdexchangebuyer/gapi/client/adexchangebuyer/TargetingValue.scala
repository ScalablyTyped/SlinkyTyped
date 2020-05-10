package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetingValue extends js.Object {
  /** The creative size value to exclude/include. */
  var creativeSizeValue: js.UndefOr[TargetingValueCreativeSize] = js.native
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. */
  var dayPartTargetingValue: js.UndefOr[TargetingValueDayPartTargeting] = js.native
  /** The long value to exclude/include. */
  var longValue: js.UndefOr[String] = js.native
  /** The string value to exclude/include. */
  var stringValue: js.UndefOr[String] = js.native
}

object TargetingValue {
  @scala.inline
  def apply(): TargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValue]
  }
  @scala.inline
  implicit class TargetingValueOps[Self <: TargetingValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeSizeValue(value: TargetingValueCreativeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSizeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeSizeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSizeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPartTargetingValue(value: TargetingValueDayPartTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPartTargetingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPartTargetingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPartTargetingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLongValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValue")(js.undefined)
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
  }
  
}

