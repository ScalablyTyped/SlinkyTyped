package typingsSlinky.openseadragon.anon

import typingsSlinky.openseadragon.mod.Button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buttons extends StObject {
  
  var buttons: js.Array[Button] = js.native
  
  var element: js.UndefOr[org.scalajs.dom.raw.Element] = js.native
}
object Buttons {
  
  @scala.inline
  def apply(buttons: js.Array[Button]): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
