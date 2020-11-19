package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpandedMonarchLanguageRule extends js.Object {
  
  /**
    * action to take on match
    */
  var action: js.UndefOr[IMonarchLanguageAction] = js.native
  
  /**
    * or an include rule. include all rules from the included state
    */
  var include: js.UndefOr[String] = js.native
  
  /**
    * match tokens
    */
  var regex: js.UndefOr[String | js.RegExp] = js.native
}
object IExpandedMonarchLanguageRule {
  
  @scala.inline
  def apply(): IExpandedMonarchLanguageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedMonarchLanguageRule]
  }
  
  @scala.inline
  implicit class IExpandedMonarchLanguageRuleOps[Self <: IExpandedMonarchLanguageRule] (val x: Self) extends AnyVal {
    
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
    def setActionVarargs(value: (IExpandedMonarchLanguageAction | IShortMonarchLanguageAction)*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: IMonarchLanguageAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setRegexRegExp(value: js.RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: String | js.RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
