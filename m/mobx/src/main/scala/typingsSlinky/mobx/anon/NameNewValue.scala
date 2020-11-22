package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.mobxStrings.update
import typingsSlinky.mobx.observableobjectMod.IObjectWillChange
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameNewValue[T] extends IObjectWillChange[T] {
  
  var name: PropertyKey = js.native
  
  var newValue: js.Any = js.native
  
  var `object`: T = js.native
  
  var `type`: update | add = js.native
}
object NameNewValue {
  
  @scala.inline
  def apply[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: update | add): NameNewValue[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameNewValue[T]]
  }
  
  @scala.inline
  implicit class NameNewValueOps[Self <: NameNewValue[_], T] (val x: Self with NameNewValue[T]) extends AnyVal {
    
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
    def setObject(value: T): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update | add): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
