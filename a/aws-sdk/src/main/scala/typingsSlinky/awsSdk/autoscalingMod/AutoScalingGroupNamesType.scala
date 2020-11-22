package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroupNamesType extends js.Object {
  
  /**
    * The names of the Auto Scaling groups. By default, you can only specify up to 50 names. You can optionally increase this limit using the MaxRecords parameter. If you omit this parameter, all Auto Scaling groups are described.
    */
  var AutoScalingGroupNames: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.AutoScalingGroupNames] = js.native
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxRecords] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}
object AutoScalingGroupNamesType {
  
  @scala.inline
  def apply(): AutoScalingGroupNamesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupNamesType]
  }
  
  @scala.inline
  implicit class AutoScalingGroupNamesTypeOps[Self <: AutoScalingGroupNamesType] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupNamesVarargs(value: ResourceName*): Self = this.set("AutoScalingGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setAutoScalingGroupNames(value: AutoScalingGroupNames): Self = this.set("AutoScalingGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupNames: Self = this.set("AutoScalingGroupNames", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
