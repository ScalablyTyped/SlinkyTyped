package typingsSlinky.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogSelectConfigItem extends StObject {
  
  var image: js.UndefOr[String] = js.native
  
  var isSelected: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var value: js.UndefOr[String] = js.native
}
object DialogSelectConfigItem {
  
  @scala.inline
  def apply(name: String): DialogSelectConfigItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectConfigItem]
  }
  
  @scala.inline
  implicit class DialogSelectConfigItemMutableBuilder[Self <: DialogSelectConfigItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
