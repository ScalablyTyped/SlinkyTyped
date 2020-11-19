package typingsSlinky.pulumiKubernetes.inputMod.node.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.Toleration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
  */
@js.native
trait Scheduling extends js.Object {
  
  /**
    * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
    */
  var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
    */
  var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.native
}
object Scheduling {
  
  @scala.inline
  def apply(): Scheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheduling]
  }
  
  @scala.inline
  implicit class SchedulingOps[Self <: Scheduling] (val x: Self) extends AnyVal {
    
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
    def setNodeSelector(value: Input[StringDictionary[Input[String]]]): Self = this.set("nodeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeSelector: Self = this.set("nodeSelector", js.undefined)
    
    @scala.inline
    def setTolerationsVarargs(value: Input[Toleration]*): Self = this.set("tolerations", js.Array(value :_*))
    
    @scala.inline
    def setTolerations(value: Input[js.Array[Input[Toleration]]]): Self = this.set("tolerations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerations: Self = this.set("tolerations", js.undefined)
  }
}
