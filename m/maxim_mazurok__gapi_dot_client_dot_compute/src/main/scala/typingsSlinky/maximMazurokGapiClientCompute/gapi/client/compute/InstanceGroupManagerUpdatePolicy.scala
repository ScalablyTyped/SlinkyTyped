package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagerUpdatePolicy extends js.Object {
  
  /**
    * The  instance redistribution policy for regional managed instance groups. Valid values are:
    * - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region.
    * - NONE: For non-autoscaled groups, proactive redistribution is disabled.
    */
  var instanceRedistributionType: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of instances that can be created above the specified targetSize during the update process. By default, a fixed value of 1 is used. This value can be either a
    * fixed number or a percentage if the instance group has 10 or more instances. If you set a percentage, the number of instances will be rounded up if necessary.
    *
    * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
    */
  var maxSurge: js.UndefOr[FixedOrPercent] = js.native
  
  /**
    * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied:
    *
    *
    * - The instance's status is RUNNING.
    * - If there is a health check on the instance group, the instance's liveness health check result must be HEALTHY at least once. If there is no health check on the group, then the
    * instance only needs to have a status of RUNNING to be considered available.  By default, a fixed value of 1 is used. This value can be either a fixed number or a percentage if the
    * instance group has 10 or more instances. If you set a percentage, the number of instances will be rounded up if necessary.
    *
    * At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
    */
  var maxUnavailable: js.UndefOr[FixedOrPercent] = js.native
  
  /**
    * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If
    * you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the
    * update, it might perform a more disruptive action.
    */
  var minimalAction: js.UndefOr[String] = js.native
  
  /** What action should be used to replace instances. See minimal_action.REPLACE */
  var replacementMethod: js.UndefOr[String] = js.native
  
  /**
    * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or
    * OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
    */
  var `type`: js.UndefOr[String] = js.native
}
object InstanceGroupManagerUpdatePolicy {
  
  @scala.inline
  def apply(): InstanceGroupManagerUpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerUpdatePolicy]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerUpdatePolicyOps[Self <: InstanceGroupManagerUpdatePolicy] (val x: Self) extends AnyVal {
    
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
    def setInstanceRedistributionType(value: String): Self = this.set("instanceRedistributionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceRedistributionType: Self = this.set("instanceRedistributionType", js.undefined)
    
    @scala.inline
    def setMaxSurge(value: FixedOrPercent): Self = this.set("maxSurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSurge: Self = this.set("maxSurge", js.undefined)
    
    @scala.inline
    def setMaxUnavailable(value: FixedOrPercent): Self = this.set("maxUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUnavailable: Self = this.set("maxUnavailable", js.undefined)
    
    @scala.inline
    def setMinimalAction(value: String): Self = this.set("minimalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimalAction: Self = this.set("minimalAction", js.undefined)
    
    @scala.inline
    def setReplacementMethod(value: String): Self = this.set("replacementMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementMethod: Self = this.set("replacementMethod", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
