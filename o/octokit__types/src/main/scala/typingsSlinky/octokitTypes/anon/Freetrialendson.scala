package typingsSlinky.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Freetrialendson extends js.Object {
  
  var account: Organizationbillingemail = js.native
  
  var billing_cycle: String = js.native
  
  var free_trial_ends_on: String = js.native
  
  var next_billing_date: String = js.native
  
  var on_free_trial: Boolean = js.native
  
  var plan: Bullets = js.native
  
  var unit_count: Double = js.native
  
  var updated_at: String = js.native
}
object Freetrialendson {
  
  @scala.inline
  def apply(
    account: Organizationbillingemail,
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: Bullets,
    unit_count: Double,
    updated_at: String
  ): Freetrialendson = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], free_trial_ends_on = free_trial_ends_on.asInstanceOf[js.Any], next_billing_date = next_billing_date.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Freetrialendson]
  }
  
  @scala.inline
  implicit class FreetrialendsonOps[Self <: Freetrialendson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: Organizationbillingemail): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_cycle(value: String): Self = this.set("billing_cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFree_trial_ends_on(value: String): Self = this.set("free_trial_ends_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_billing_date(value: String): Self = this.set("next_billing_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_free_trial(value: Boolean): Self = this.set("on_free_trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Bullets): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit_count(value: Double): Self = this.set("unit_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
}
