package typingsSlinky.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object that contains options to use while creation of nw.Menu. example: new nw.Menu(MenuOption)
  */
@js.native
trait MenuOption extends StObject {
  
  /**
    * {string} (Optional) two types are accepted by this method: "menubar" or "contextmenu". The value is set to "contextmenu" by default.
    */
  var `type`: String = js.native
}
object MenuOption {
  
  @scala.inline
  def apply(`type`: String): MenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOption]
  }
  
  @scala.inline
  implicit class MenuOptionMutableBuilder[Self <: MenuOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
