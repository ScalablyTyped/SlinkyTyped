package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountStatusItemLevelIssue extends js.Object {
  
  var attributeName: js.UndefOr[String] = js.native
  
  var code: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var documentation: js.UndefOr[String] = js.native
  
  var numItems: js.UndefOr[String] = js.native
  
  var resolution: js.UndefOr[String] = js.native
  
  var servability: js.UndefOr[String] = js.native
}
object AccountStatusItemLevelIssue {
  
  @scala.inline
  def apply(): AccountStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusItemLevelIssue]
  }
  
  @scala.inline
  implicit class AccountStatusItemLevelIssueOps[Self <: AccountStatusItemLevelIssue] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setNumItems(value: String): Self = this.set("numItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumItems: Self = this.set("numItems", js.undefined)
    
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setServability(value: String): Self = this.set("servability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServability: Self = this.set("servability", js.undefined)
  }
}
