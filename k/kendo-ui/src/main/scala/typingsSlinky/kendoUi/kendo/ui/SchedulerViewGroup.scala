package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerViewGroup extends StObject {
  
  var date: js.UndefOr[Boolean] = js.native
  
  var orientation: js.UndefOr[String] = js.native
}
object SchedulerViewGroup {
  
  @scala.inline
  def apply(): SchedulerViewGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerViewGroup]
  }
  
  @scala.inline
  implicit class SchedulerViewGroupMutableBuilder[Self <: SchedulerViewGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
