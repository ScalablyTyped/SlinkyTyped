package typingsSlinky.materialUi.MaterialUI

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogAction extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var text: String = js.native
}
object DialogAction {
  
  @scala.inline
  def apply(text: String): DialogAction = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit class DialogActionMutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
