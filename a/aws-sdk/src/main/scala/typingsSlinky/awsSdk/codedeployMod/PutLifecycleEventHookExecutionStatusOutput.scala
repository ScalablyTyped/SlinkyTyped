package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
  
  /**
    * The execution ID of the lifecycle event hook. A hook is specified in the hooks section of the deployment's AppSpec file.
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.native
}
object PutLifecycleEventHookExecutionStatusOutput {
  
  @scala.inline
  def apply(): PutLifecycleEventHookExecutionStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusOutput]
  }
  
  @scala.inline
  implicit class PutLifecycleEventHookExecutionStatusOutputOps[Self <: PutLifecycleEventHookExecutionStatusOutput] (val x: Self) extends AnyVal {
    
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
    def setLifecycleEventHookExecutionId(value: LifecycleEventHookExecutionId): Self = this.set("lifecycleEventHookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleEventHookExecutionId: Self = this.set("lifecycleEventHookExecutionId", js.undefined)
  }
}
