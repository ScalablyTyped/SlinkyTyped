package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A polymorphic targeting value used as part of Shared Targeting.
  */
@js.native
trait SchemaTargetingValue extends js.Object {
  /**
    * The creative size value to include/exclude. Filled in when key =
    * GOOG_CREATIVE_SIZE
    */
  var creativeSizeValue: js.UndefOr[SchemaCreativeSize] = js.native
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING. The definition of this targeting is derived from
    * the structure used by Ad Manager.
    */
  var dayPartTargetingValue: js.UndefOr[SchemaDayPartTargeting] = js.native
  /**
    * The long value to include/exclude.
    */
  var longValue: js.UndefOr[String] = js.native
  /**
    * The string value to include/exclude.
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
    def withCreativeSizeValue(value: SchemaCreativeSize): Self = {
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
    def withDayPartTargetingValue(value: SchemaDayPartTargeting): Self = {
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

