package typingsSlinky.baseui.menuMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedMenuState extends StObject {
  
  var menus: js.Array[Ref[HTMLElement]] = js.native
}
object NestedMenuState {
  
  @scala.inline
  def apply(menus: js.Array[Ref[HTMLElement]]): NestedMenuState = {
    val __obj = js.Dynamic.literal(menus = menus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedMenuState]
  }
  
  @scala.inline
  implicit class NestedMenuStateMutableBuilder[Self <: NestedMenuState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenus(value: js.Array[Ref[HTMLElement]]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenusVarargs(value: Ref[HTMLElement]*): Self = StObject.set(x, "menus", js.Array(value :_*))
  }
}
