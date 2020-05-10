package typingsSlinky.formatjsIntlUtils

import typingsSlinky.formatjsIntlUtils.numberTypesMod.LDMLPluralRuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnitName extends js.Object {
  var unitName: LDMLPluralRuleMap[js.Array[String]] = js.native
  var unitNarrowSymbol: LDMLPluralRuleMap[js.Array[String]] = js.native
  var unitSymbol: LDMLPluralRuleMap[js.Array[String]] = js.native
}

object AnonUnitName {
  @scala.inline
  def apply(
    unitName: LDMLPluralRuleMap[js.Array[String]],
    unitNarrowSymbol: LDMLPluralRuleMap[js.Array[String]],
    unitSymbol: LDMLPluralRuleMap[js.Array[String]]
  ): AnonUnitName = {
    val __obj = js.Dynamic.literal(unitName = unitName.asInstanceOf[js.Any], unitNarrowSymbol = unitNarrowSymbol.asInstanceOf[js.Any], unitSymbol = unitSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnitName]
  }
  @scala.inline
  implicit class AnonUnitNameOps[Self <: AnonUnitName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnitName(value: LDMLPluralRuleMap[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitNarrowSymbol(value: LDMLPluralRuleMap[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitNarrowSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnitSymbol(value: LDMLPluralRuleMap[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitSymbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

