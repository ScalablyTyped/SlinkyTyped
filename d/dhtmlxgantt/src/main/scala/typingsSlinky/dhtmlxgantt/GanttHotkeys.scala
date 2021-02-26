package typingsSlinky.dhtmlxgantt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttHotkeys extends StObject {
  
  var edit_cancel: Double = js.native
  
  var edit_save: Double = js.native
}
object GanttHotkeys {
  
  @scala.inline
  def apply(edit_cancel: Double, edit_save: Double): GanttHotkeys = {
    val __obj = js.Dynamic.literal(edit_cancel = edit_cancel.asInstanceOf[js.Any], edit_save = edit_save.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttHotkeys]
  }
  
  @scala.inline
  implicit class GanttHotkeysMutableBuilder[Self <: GanttHotkeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdit_cancel(value: Double): Self = StObject.set(x, "edit_cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_save(value: Double): Self = StObject.set(x, "edit_save", value.asInstanceOf[js.Any])
  }
}
