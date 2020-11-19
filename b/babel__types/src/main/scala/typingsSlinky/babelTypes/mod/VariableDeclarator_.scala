package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarator_
  extends BaseNode
     with _Node {
  
  var definite: Boolean | Null = js.native
  
  var id: LVal = js.native
  
  var init: Expression | Null = js.native
  
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator = js.native
}
object VariableDeclarator_ {
  
  @scala.inline
  def apply(id: LVal, `type`: VariableDeclarator): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator_]
  }
  
  @scala.inline
  implicit class VariableDeclarator_Ops[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
    
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
    def setType(value: VariableDeclarator): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinite(value: Boolean): Self = this.set("definite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefiniteNull: Self = this.set("definite", null)
    
    @scala.inline
    def setInit(value: Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = this.set("init", null)
  }
}
