package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatepickerCellArgs extends StObject {
  
  var date: js.Date = js.native
  
  var mode: DatepickerMode = js.native
}
object IDatepickerCellArgs {
  
  @scala.inline
  def apply(date: js.Date, mode: DatepickerMode): IDatepickerCellArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerCellArgs]
  }
  
  @scala.inline
  implicit class IDatepickerCellArgsMutableBuilder[Self <: IDatepickerCellArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: DatepickerMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
