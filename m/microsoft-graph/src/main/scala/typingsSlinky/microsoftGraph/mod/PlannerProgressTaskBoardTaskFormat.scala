package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerProgressTaskBoardTaskFormat extends Entity {
  
  // Hint value used to order the task on the Progress view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[NullableOption[String]] = js.native
}
object PlannerProgressTaskBoardTaskFormat {
  
  @scala.inline
  def apply(): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
  
  @scala.inline
  implicit class PlannerProgressTaskBoardTaskFormatMutableBuilder[Self <: PlannerProgressTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderHint(value: NullableOption[String]): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHintNull: Self = StObject.set(x, "orderHint", null)
    
    @scala.inline
    def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
  }
}
