package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllFramesReturnDetails extends StObject {
  
  /**
    * True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired.
    */
  var errorOccurred: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe.
    */
  var frameId: Double = js.native
  
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double = js.native
  
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.native
  
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
  
  /** The URL currently associated with this frame. */
  var url: String = js.native
}
object GetAllFramesReturnDetails {
  
  @scala.inline
  def apply(frameId: Double, parentFrameId: Double, tabId: Double, url: String): GetAllFramesReturnDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFramesReturnDetails]
  }
  
  @scala.inline
  implicit class GetAllFramesReturnDetailsMutableBuilder[Self <: GetAllFramesReturnDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorOccurred(value: Boolean): Self = StObject.set(x, "errorOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOccurredUndefined: Self = StObject.set(x, "errorOccurred", js.undefined)
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
