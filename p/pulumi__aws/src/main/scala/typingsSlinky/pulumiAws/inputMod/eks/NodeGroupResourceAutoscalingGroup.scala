package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupResourceAutoscalingGroup extends js.Object {
  
  /**
    * Name of the AutoScaling Group.
    */
  var name: js.UndefOr[Input[String]] = js.native
}
object NodeGroupResourceAutoscalingGroup {
  
  @scala.inline
  def apply(): NodeGroupResourceAutoscalingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
  }
  
  @scala.inline
  implicit class NodeGroupResourceAutoscalingGroupOps[Self <: NodeGroupResourceAutoscalingGroup] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
