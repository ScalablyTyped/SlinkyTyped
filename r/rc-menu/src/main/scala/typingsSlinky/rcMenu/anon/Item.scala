package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  var domEvent: SyntheticMouseEvent[HTMLElement] = js.native
  
  var item: ReactInstance = js.native
  
  var key: String | Double = js.native
  
  var keyPath: js.Array[String | Double] = js.native
}
object Item {
  
  @scala.inline
  def apply(
    domEvent: SyntheticMouseEvent[HTMLElement],
    item: ReactInstance,
    key: String | Double,
    keyPath: js.Array[String | Double]
  ): Item = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setDomEvent(value: SyntheticMouseEvent[HTMLElement]): Self = this.set("domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElement(value: Element): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemComponent(value: ReactComponentClass[js.Any]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ReactInstance): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathVarargs(value: (String | Double)*): Self = this.set("keyPath", js.Array(value :_*))
    
    @scala.inline
    def setKeyPath(value: js.Array[String | Double]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
  }
}
