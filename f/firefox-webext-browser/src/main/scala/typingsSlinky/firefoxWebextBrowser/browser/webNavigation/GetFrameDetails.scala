package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the frame to retrieve information about. */
@js.native
trait GetFrameDetails extends StObject {
  
  /** The ID of the frame in the given tab. */
  var frameId: Double = js.native
  
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[Double] = js.native
  
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
}
object GetFrameDetails {
  
  @scala.inline
  def apply(frameId: Double, tabId: Double): GetFrameDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameDetails]
  }
  
  @scala.inline
  implicit class GetFrameDetailsMutableBuilder[Self <: GetFrameDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
  }
}
