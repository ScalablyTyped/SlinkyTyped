package typingsSlinky.eslint.anon

import typingsSlinky.eslint.eslintStrings.TDZ
import typingsSlinky.eslint.mod.Scope.DefinitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeAny extends DefinitionType {
  
  var node: js.Any = js.native
  
  var parent: Null = js.native
  
  var `type`: TDZ = js.native
}
object NodeAny {
  
  @scala.inline
  def apply(node: js.Any, parent: Null, `type`: TDZ): NodeAny = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAny]
  }
  
  @scala.inline
  implicit class NodeAnyOps[Self <: NodeAny] (val x: Self) extends AnyVal {
    
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
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TDZ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
