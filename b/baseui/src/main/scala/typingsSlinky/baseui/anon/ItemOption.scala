package typingsSlinky.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemOption extends StObject {
  
  var item: typingsSlinky.baseui.selectMod.Option = js.native
}
object ItemOption {
  
  @scala.inline
  def apply(item: typingsSlinky.baseui.selectMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
  
  @scala.inline
  implicit class ItemOptionMutableBuilder[Self <: ItemOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: typingsSlinky.baseui.selectMod.Option): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
