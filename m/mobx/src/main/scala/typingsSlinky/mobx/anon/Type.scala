package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.observableobjectMod.IObjectDidChange
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends IObjectDidChange {
  
  var name: PropertyKey = js.native
  
  var newValue: js.Any = js.native
  
  var `object`: js.Any = js.native
  
  var `type`: add = js.native
}
object Type {
  
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: add): Type = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
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
    def setName(value: PropertyKey): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
