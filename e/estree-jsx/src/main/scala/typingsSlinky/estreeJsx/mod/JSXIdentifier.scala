package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXIdentifier
  extends BaseNode
     with _Node {
  
  var name: String = js.native
  
  @JSName("type")
  var type_JSXIdentifier: typingsSlinky.estreeJsx.estreeJsxStrings.JSXIdentifier = js.native
}
object JSXIdentifier {
  
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXIdentifier): JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier]
  }
  
  @scala.inline
  implicit class JSXIdentifierOps[Self <: JSXIdentifier] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXIdentifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
