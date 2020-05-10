package typingsSlinky.postmark.inboundRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundRules extends js.Object {
  var InboundRules: js.Array[InboundRule] = js.native
  var TotalCount: Double = js.native
}

object InboundRules {
  @scala.inline
  def apply(InboundRules: js.Array[InboundRule], TotalCount: Double): InboundRules = {
    val __obj = js.Dynamic.literal(InboundRules = InboundRules.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRules]
  }
  @scala.inline
  implicit class InboundRulesOps[Self <: InboundRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundRules(value: js.Array[InboundRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

