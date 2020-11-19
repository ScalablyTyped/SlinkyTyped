package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTargetGroupOutput extends js.Object {
  
  /**
    * Information about the modified target group.
    */
  var TargetGroups: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroups] = js.native
}
object ModifyTargetGroupOutput {
  
  @scala.inline
  def apply(): ModifyTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTargetGroupOutput]
  }
  
  @scala.inline
  implicit class ModifyTargetGroupOutputOps[Self <: ModifyTargetGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetGroupsVarargs(value: TargetGroup*): Self = this.set("TargetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroups(value: TargetGroups): Self = this.set("TargetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroups: Self = this.set("TargetGroups", js.undefined)
  }
}
