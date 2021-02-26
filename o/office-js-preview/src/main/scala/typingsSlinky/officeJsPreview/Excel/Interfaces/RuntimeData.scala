package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `runtime.toJSON()`. */
@js.native
trait RuntimeData extends StObject {
  
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.native
}
object RuntimeData {
  
  @scala.inline
  def apply(): RuntimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeData]
  }
  
  @scala.inline
  implicit class RuntimeDataMutableBuilder[Self <: RuntimeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableEvents(value: Boolean): Self = StObject.set(x, "enableEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEventsUndefined: Self = StObject.set(x, "enableEvents", js.undefined)
  }
}
