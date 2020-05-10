package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitData extends js.Object {
  var displayName: String = js.native
  var long: LDMLPluralRuleMap[RawUnitPattern] = js.native
  var narrow: LDMLPluralRuleMap[RawUnitPattern] = js.native
  var short: LDMLPluralRuleMap[RawUnitPattern] = js.native
}

object UnitData {
  @scala.inline
  def apply(
    displayName: String,
    long: LDMLPluralRuleMap[RawUnitPattern],
    narrow: LDMLPluralRuleMap[RawUnitPattern],
    short: LDMLPluralRuleMap[RawUnitPattern]
  ): UnitData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitData]
  }
  @scala.inline
  implicit class UnitDataOps[Self <: UnitData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLong(value: LDMLPluralRuleMap[RawUnitPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNarrow(value: LDMLPluralRuleMap[RawUnitPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: LDMLPluralRuleMap[RawUnitPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

