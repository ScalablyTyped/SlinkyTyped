package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerFooter extends StObject {
  
  var command: js.UndefOr[String | Boolean] = js.native
}
object SchedulerFooter {
  
  @scala.inline
  def apply(): SchedulerFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerFooter]
  }
  
  @scala.inline
  implicit class SchedulerFooterMutableBuilder[Self <: SchedulerFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String | Boolean): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
  }
}
