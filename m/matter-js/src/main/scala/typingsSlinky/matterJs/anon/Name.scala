package typingsSlinky.matterJs.anon

import typingsSlinky.matterJs.mod._Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends _Dependency {
  
  var name: String = js.native
  
  var range: String = js.native
}
object Name {
  
  @scala.inline
  def apply(name: String, range: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    
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
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
