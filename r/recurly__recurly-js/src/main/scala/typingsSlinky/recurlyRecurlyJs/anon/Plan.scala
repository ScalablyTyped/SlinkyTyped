package typingsSlinky.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plan extends js.Object {
  var addons: StringDictionary[String] = js.native
  var plan: Setupfee = js.native
}

object Plan {
  @scala.inline
  def apply(addons: StringDictionary[String], plan: Setupfee): Plan = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  @scala.inline
  implicit class PlanOps[Self <: Plan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddons(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: Setupfee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

