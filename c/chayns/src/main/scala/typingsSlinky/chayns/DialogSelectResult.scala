package typingsSlinky.chayns

import typingsSlinky.chayns.chayns.dialog.buttonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogSelectResult extends StObject {
  
  var buttonType: typingsSlinky.chayns.chayns.dialog.buttonType = js.native
  
  var selection: js.Array[DialogSelectResultItem] = js.native
}
object DialogSelectResult {
  
  @scala.inline
  def apply(buttonType: buttonType, selection: js.Array[DialogSelectResultItem]): DialogSelectResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResult]
  }
  
  @scala.inline
  implicit class DialogSelectResultMutableBuilder[Self <: DialogSelectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonType(value: buttonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: js.Array[DialogSelectResultItem]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionVarargs(value: DialogSelectResultItem*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
