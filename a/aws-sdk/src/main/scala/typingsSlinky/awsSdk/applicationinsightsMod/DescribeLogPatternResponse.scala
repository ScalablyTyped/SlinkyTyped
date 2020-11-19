package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLogPatternResponse extends js.Object {
  
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LogPattern] = js.native
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}
object DescribeLogPatternResponse {
  
  @scala.inline
  def apply(): DescribeLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogPatternResponse]
  }
  
  @scala.inline
  implicit class DescribeLogPatternResponseOps[Self <: DescribeLogPatternResponse] (val x: Self) extends AnyVal {
    
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
    def setLogPattern(value: LogPattern): Self = this.set("LogPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogPattern: Self = this.set("LogPattern", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroupName: Self = this.set("ResourceGroupName", js.undefined)
  }
}
