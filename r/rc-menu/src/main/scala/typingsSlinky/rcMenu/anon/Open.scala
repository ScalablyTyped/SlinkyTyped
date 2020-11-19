package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Open extends js.Object {
  
  var item: ReactInstance = js.native
  
  var key: typingsSlinky.react.mod.Key = js.native
  
  var open: Boolean = js.native
  
  var trigger: String = js.native
}
object Open {
  
  @scala.inline
  def apply(item: ReactInstance, key: typingsSlinky.react.mod.Key, open: Boolean, trigger: String): Open = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit class OpenOps[Self <: Open] (val x: Self) extends AnyVal {
    
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
    def setItemElement(value: Element): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemComponent(value: ReactComponentClass[js.Any]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ReactInstance): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
}
