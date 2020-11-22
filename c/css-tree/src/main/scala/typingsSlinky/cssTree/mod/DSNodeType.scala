package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeType
  extends DSNode
     with DSNodeMultiplied {
  
  var name: String = js.native
  
  var opts: DSNodeTypeOpts | Null = js.native
  
  var `type`: Type = js.native
}
object DSNodeType {
  
  @scala.inline
  def apply(name: String, `type`: Type): DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeType]
  }
  
  @scala.inline
  implicit class DSNodeTypeOps[Self <: DSNodeType] (val x: Self) extends AnyVal {
    
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
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: DSNodeTypeOpts): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptsNull: Self = this.set("opts", null)
  }
}
