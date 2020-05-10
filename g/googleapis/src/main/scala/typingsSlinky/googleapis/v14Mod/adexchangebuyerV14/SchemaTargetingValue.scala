package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValue extends js.Object {
  /**
    * The creative size value to exclude/include.
    */
  var creativeSizeValue: js.UndefOr[SchemaTargetingValueCreativeSize] = js.native
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING.
    */
  var dayPartTargetingValue: js.UndefOr[SchemaTargetingValueDayPartTargeting] = js.native
  var demogAgeCriteriaValue: js.UndefOr[SchemaTargetingValueDemogAgeCriteria] = js.native
  var demogGenderCriteriaValue: js.UndefOr[SchemaTargetingValueDemogGenderCriteria] = js.native
  /**
    * The long value to exclude/include.
    */
  var longValue: js.UndefOr[String] = js.native
  /**
    * The string value to exclude/include.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object SchemaTargetingValue {
  @scala.inline
  def apply(): SchemaTargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValue]
  }
  @scala.inline
  implicit class SchemaTargetingValueOps[Self <: SchemaTargetingValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeSizeValue(value: SchemaTargetingValueCreativeSize): Self = {
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
    def withDayPartTargetingValue(value: SchemaTargetingValueDayPartTargeting): Self = {
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
    def withDemogAgeCriteriaValue(value: SchemaTargetingValueDemogAgeCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demogAgeCriteriaValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemogAgeCriteriaValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demogAgeCriteriaValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDemogGenderCriteriaValue(value: SchemaTargetingValueDemogGenderCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demogGenderCriteriaValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemogGenderCriteriaValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demogGenderCriteriaValue")(js.undefined)
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

