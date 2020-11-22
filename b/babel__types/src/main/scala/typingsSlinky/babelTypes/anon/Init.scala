package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.babelTypesStrings.`var`
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.LVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Init extends js.Object {
  
  var id: LVal = js.native
  
  var init: js.UndefOr[Expression] = js.native
  
  var kind: `var` = js.native
}
object Init {
  
  @scala.inline
  def apply(id: LVal, kind: `var`): Init = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
  
  @scala.inline
  implicit class InitOps[Self <: Init] (val x: Self) extends AnyVal {
    
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
    def setId(value: LVal): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: `var`): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
}
