package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Open extends StObject {
  
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
  implicit class OpenMutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElement(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
