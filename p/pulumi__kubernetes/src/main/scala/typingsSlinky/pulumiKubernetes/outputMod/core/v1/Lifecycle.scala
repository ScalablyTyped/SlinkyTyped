package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
  */
@js.native
trait Lifecycle extends js.Object {
  
  /**
    * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var postStart: Handler = js.native
  
  /**
    * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The reason for termination is passed to the handler. The Pod's termination grace period countdown begins before the PreStop hooked is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period. Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
    */
  var preStop: Handler = js.native
}
object Lifecycle {
  
  @scala.inline
  def apply(postStart: Handler, preStop: Handler): Lifecycle = {
    val __obj = js.Dynamic.literal(postStart = postStart.asInstanceOf[js.Any], preStop = preStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycle]
  }
  
  @scala.inline
  implicit class LifecycleOps[Self <: Lifecycle] (val x: Self) extends AnyVal {
    
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
    def setPostStart(value: Handler): Self = this.set("postStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreStop(value: Handler): Self = this.set("preStop", value.asInstanceOf[js.Any])
  }
}
