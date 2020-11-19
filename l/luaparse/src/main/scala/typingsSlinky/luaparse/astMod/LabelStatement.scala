package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.LabelStatement] {
  
  var label: Identifier = js.native
}
object LabelStatement {
  
  @scala.inline
  def apply(label: Identifier, `type`: typingsSlinky.luaparse.luaparseStrings.LabelStatement): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStatement]
  }
  
  @scala.inline
  implicit class LabelStatementOps[Self <: LabelStatement] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: Identifier): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
