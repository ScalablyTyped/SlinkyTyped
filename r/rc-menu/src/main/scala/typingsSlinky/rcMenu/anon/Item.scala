package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
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
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElement(value: Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPath(value: js.Array[String | Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathVarargs(value: (String | Double)*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
  }
}
