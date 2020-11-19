package typingsSlinky.pulumiAws.trafficMirrorTargetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorTargetArgs extends js.Object {
  
  /**
    * A description of the traffic mirror session.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The network interface ID that is associated with the target.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
    */
  val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object TrafficMirrorTargetArgs {
  
  @scala.inline
  def apply(): TrafficMirrorTargetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorTargetArgs]
  }
  
  @scala.inline
  implicit class TrafficMirrorTargetArgsOps[Self <: TrafficMirrorTargetArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    
    @scala.inline
    def setNetworkLoadBalancerArn(value: Input[String]): Self = this.set("networkLoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkLoadBalancerArn: Self = this.set("networkLoadBalancerArn", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
