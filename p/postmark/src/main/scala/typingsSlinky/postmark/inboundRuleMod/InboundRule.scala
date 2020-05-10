package typingsSlinky.postmark.inboundRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundRule extends js.Object {
  var ID: Double = js.native
  var Rule: String = js.native
}

object InboundRule {
  @scala.inline
  def apply(ID: Double, Rule: String): InboundRule = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRule]
  }
  @scala.inline
  implicit class InboundRuleOps[Self <: InboundRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

