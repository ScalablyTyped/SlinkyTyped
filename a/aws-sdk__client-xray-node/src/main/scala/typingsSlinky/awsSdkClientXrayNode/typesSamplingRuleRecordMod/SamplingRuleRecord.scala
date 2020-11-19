package typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleRecordMod

import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRuleRecord extends js.Object {
  
  /**
    * <p>When the rule was created.</p>
    */
  var CreatedAt: js.UndefOr[js.Date | String | Double] = js.native
  
  /**
    * <p>When the rule was last modified.</p>
    */
  var ModifiedAt: js.UndefOr[js.Date | String | Double] = js.native
  
  /**
    * <p>The sampling rule.</p>
    */
  var SamplingRule: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule] = js.native
}
object SamplingRuleRecord {
  
  @scala.inline
  def apply(): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleRecord]
  }
  
  @scala.inline
  implicit class SamplingRuleRecordOps[Self <: SamplingRuleRecord] (val x: Self) extends AnyVal {
    
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
    def setCreatedAtDate(value: js.Date): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: js.Date | String | Double): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setModifiedAtDate(value: js.Date): Self = this.set("ModifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedAt(value: js.Date | String | Double): Self = this.set("ModifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedAt: Self = this.set("ModifiedAt", js.undefined)
    
    @scala.inline
    def setSamplingRule(value: SamplingRule): Self = this.set("SamplingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingRule: Self = this.set("SamplingRule", js.undefined)
  }
}
