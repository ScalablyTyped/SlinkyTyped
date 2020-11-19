package typingsSlinky.pulumiAws.ec2RouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.RouteTableRoute
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteTableArgs extends js.Object {
  
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of route objects. Their keys are documented below.
    */
  val routes: js.UndefOr[Input[js.Array[Input[RouteTableRoute]]]] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The VPC ID.
    */
  val vpcId: Input[String] = js.native
}
object RouteTableArgs {
  
  @scala.inline
  def apply(vpcId: Input[String]): RouteTableArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableArgs]
  }
  
  @scala.inline
  implicit class RouteTableArgsOps[Self <: RouteTableArgs] (val x: Self) extends AnyVal {
    
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagatingVgwsVarargs(value: Input[String]*): Self = this.set("propagatingVgws", js.Array(value :_*))
    
    @scala.inline
    def setPropagatingVgws(value: Input[js.Array[Input[String]]]): Self = this.set("propagatingVgws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagatingVgws: Self = this.set("propagatingVgws", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: Input[RouteTableRoute]*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: Input[js.Array[Input[RouteTableRoute]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
