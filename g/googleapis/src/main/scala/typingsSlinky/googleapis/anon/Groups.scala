package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends js.Object {
  
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  var localizedRuleName: js.UndefOr[String] = js.native
  
  var ruleImpact: js.UndefOr[Double] = js.native
  
  var summary: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
  
  var urlBlocks: js.UndefOr[js.Array[Urls]] = js.native
}
object Groups {
  
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setLocalizedRuleName(value: String): Self = this.set("localizedRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizedRuleName: Self = this.set("localizedRuleName", js.undefined)
    
    @scala.inline
    def setRuleImpact(value: Double): Self = this.set("ruleImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleImpact: Self = this.set("ruleImpact", js.undefined)
    
    @scala.inline
    def setSummary(value: SchemaPagespeedApiFormatStringV2): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setUrlBlocksVarargs(value: Urls*): Self = this.set("urlBlocks", js.Array(value :_*))
    
    @scala.inline
    def setUrlBlocks(value: js.Array[Urls]): Self = this.set("urlBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlBlocks: Self = this.set("urlBlocks", js.undefined)
  }
}
