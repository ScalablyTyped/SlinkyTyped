package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringNode
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_StringNode: String = js.native
  
  var value: java.lang.String = js.native
}
object StringNode {
  
  @scala.inline
  def apply(`type`: String, value: java.lang.String): StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringNode]
  }
  
  @scala.inline
  implicit class StringNodeOps[Self <: StringNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: java.lang.String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
