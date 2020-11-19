package typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnectionAccepterArgs extends js.Object {
  
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
    */
  val accepter: js.UndefOr[Input[VpcPeeringConnectionAccepterAccepter]] = js.native
  
  /**
    * Whether or not to accept the peering request. Defaults to `false`.
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
    */
  val requester: js.UndefOr[Input[VpcPeeringConnectionAccepterRequester]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The VPC Peering Connection ID to manage.
    */
  val vpcPeeringConnectionId: Input[String] = js.native
}
object VpcPeeringConnectionAccepterArgs {
  
  @scala.inline
  def apply(vpcPeeringConnectionId: Input[String]): VpcPeeringConnectionAccepterArgs = {
    val __obj = js.Dynamic.literal(vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionAccepterArgs]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionAccepterArgsOps[Self <: VpcPeeringConnectionAccepterArgs] (val x: Self) extends AnyVal {
    
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
    def setVpcPeeringConnectionId(value: Input[String]): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepter(value: Input[VpcPeeringConnectionAccepterAccepter]): Self = this.set("accepter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccepter: Self = this.set("accepter", js.undefined)
    
    @scala.inline
    def setAutoAccept(value: Input[Boolean]): Self = this.set("autoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAccept: Self = this.set("autoAccept", js.undefined)
    
    @scala.inline
    def setRequester(value: Input[VpcPeeringConnectionAccepterRequester]): Self = this.set("requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
