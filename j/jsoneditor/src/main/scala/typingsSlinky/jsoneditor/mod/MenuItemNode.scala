package typingsSlinky.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemNode extends js.Object {
  
  var path: js.Array[String] = js.native
  
  var paths: js.Array[js.Array[String]] = js.native
  
  var `type`: MenuItemNodeType = js.native
}
object MenuItemNode {
  
  @scala.inline
  def apply(path: js.Array[String], paths: js.Array[js.Array[String]], `type`: MenuItemNodeType): MenuItemNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemNode]
  }
  
  @scala.inline
  implicit class MenuItemNodeOps[Self <: MenuItemNode] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: js.Array[String]*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[js.Array[String]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MenuItemNodeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
