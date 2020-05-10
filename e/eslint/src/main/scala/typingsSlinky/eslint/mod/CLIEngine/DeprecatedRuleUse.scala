package typingsSlinky.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecatedRuleUse extends js.Object {
  var replacedBy: js.Array[String] = js.native
  var ruleId: String = js.native
}

object DeprecatedRuleUse {
  @scala.inline
  def apply(replacedBy: js.Array[String], ruleId: String): DeprecatedRuleUse = {
    val __obj = js.Dynamic.literal(replacedBy = replacedBy.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedRuleUse]
  }
  @scala.inline
  implicit class DeprecatedRuleUseOps[Self <: DeprecatedRuleUse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacedBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

