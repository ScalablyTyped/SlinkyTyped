package typingsSlinky.primereact.anon

import typingsSlinky.primereact.menuItemMod.MenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexItem extends StObject {
  
  var index: Double = js.native
  
  var item: MenuItem = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object IndexItem {
  
  @scala.inline
  def apply(index: Double, item: MenuItem, originalEvent: org.scalajs.dom.raw.Event): IndexItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexItem]
  }
  
  @scala.inline
  implicit class IndexItemMutableBuilder[Self <: IndexItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: MenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
