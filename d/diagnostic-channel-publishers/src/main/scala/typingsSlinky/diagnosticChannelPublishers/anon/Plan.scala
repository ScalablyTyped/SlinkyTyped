package typingsSlinky.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plan extends js.Object {
  var plan: js.UndefOr[String] = js.native
  var preparable: js.UndefOr[Args] = js.native
  var text: js.UndefOr[String] = js.native
}

object Plan {
  @scala.inline
  def apply(): Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plan]
  }
  @scala.inline
  implicit class PlanOps[Self <: Plan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withPreparable(value: Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preparable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreparable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preparable")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

