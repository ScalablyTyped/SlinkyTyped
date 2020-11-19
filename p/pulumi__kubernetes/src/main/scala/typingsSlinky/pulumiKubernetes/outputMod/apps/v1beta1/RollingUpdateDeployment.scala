package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Spec to control the desired behavior of rolling update.
  */
@js.native
trait RollingUpdateDeployment extends js.Object {
  
  /**
    * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
    */
  var maxSurge: Double | String = js.native
  
  /**
    * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
    */
  var maxUnavailable: Double | String = js.native
}
object RollingUpdateDeployment {
  
  @scala.inline
  def apply(maxSurge: Double | String, maxUnavailable: Double | String): RollingUpdateDeployment = {
    val __obj = js.Dynamic.literal(maxSurge = maxSurge.asInstanceOf[js.Any], maxUnavailable = maxUnavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateDeployment]
  }
  
  @scala.inline
  implicit class RollingUpdateDeploymentOps[Self <: RollingUpdateDeployment] (val x: Self) extends AnyVal {
    
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
    def setMaxSurge(value: Double | String): Self = this.set("maxSurge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnavailable(value: Double | String): Self = this.set("maxUnavailable", value.asInstanceOf[js.Any])
  }
}
