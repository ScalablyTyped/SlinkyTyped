package typingsSlinky.pulumiAws.inputMod.workspaces

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpGroupRule extends js.Object {
  
  /**
    * The description.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IP address range, in CIDR notation, e.g. `10.0.0.0/16`
    */
  var source: Input[String] = js.native
}
object IpGroupRule {
  
  @scala.inline
  def apply(source: Input[String]): IpGroupRule = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpGroupRule]
  }
  
  @scala.inline
  implicit class IpGroupRuleOps[Self <: IpGroupRule] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Input[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
