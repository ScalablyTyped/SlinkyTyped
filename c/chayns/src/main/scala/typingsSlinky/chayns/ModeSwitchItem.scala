package typingsSlinky.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeSwitchItem extends StObject {
  
  var default: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var value: Double = js.native
}
object ModeSwitchItem {
  
  @scala.inline
  def apply(name: String, value: Double): ModeSwitchItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchItem]
  }
  
  @scala.inline
  implicit class ModeSwitchItemMutableBuilder[Self <: ModeSwitchItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
