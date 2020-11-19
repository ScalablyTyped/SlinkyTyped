package typingsSlinky.eslint.anon

import typingsSlinky.eslint.eslintStrings.ClassName
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.ClassDeclaration
import typingsSlinky.estree.mod.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parent extends DefinitionType {
  
  var node: ClassDeclaration | ClassExpression = js.native
  
  var parent: Null = js.native
  
  var `type`: ClassName = js.native
}
object Parent {
  
  @scala.inline
  def apply(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): Parent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  @scala.inline
  implicit class ParentOps[Self <: Parent] (val x: Self) extends AnyVal {
    
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
    def setNode(value: ClassDeclaration | ClassExpression): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassName): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
