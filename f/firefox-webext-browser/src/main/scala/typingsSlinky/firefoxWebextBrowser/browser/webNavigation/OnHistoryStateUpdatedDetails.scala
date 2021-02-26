package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnHistoryStateUpdatedDetails extends StObject {
  
  /**
    * 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique within a tab.
    */
  var frameId: Double = js.native
  
  /**
    * The ID of the process runs the renderer for this tab.
    * @deprecated Unsupported on Firefox at this time.
    */
  var processId: js.UndefOr[Double] = js.native
  
  /** The ID of the tab in which the navigation occurs. */
  var tabId: Double = js.native
  
  /** The time when the navigation was committed, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
  
  /**
    * A list of transition qualifiers.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionQualifiers: js.UndefOr[js.Array[TransitionQualifier]] = js.native
  
  /**
    * Cause of the navigation.
    * @deprecated Unsupported on Firefox at this time.
    */
  var transitionType: js.UndefOr[TransitionType] = js.native
  
  var url: String = js.native
}
object OnHistoryStateUpdatedDetails {
  
  @scala.inline
  def apply(frameId: Double, tabId: Double, timeStamp: Double, url: String): OnHistoryStateUpdatedDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHistoryStateUpdatedDetails]
  }
  
  @scala.inline
  implicit class OnHistoryStateUpdatedDetailsMutableBuilder[Self <: OnHistoryStateUpdatedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionQualifiers(value: js.Array[TransitionQualifier]): Self = StObject.set(x, "transitionQualifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionQualifiersUndefined: Self = StObject.set(x, "transitionQualifiers", js.undefined)
    
    @scala.inline
    def setTransitionQualifiersVarargs(value: TransitionQualifier*): Self = StObject.set(x, "transitionQualifiers", js.Array(value :_*))
    
    @scala.inline
    def setTransitionType(value: TransitionType): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionTypeUndefined: Self = StObject.set(x, "transitionType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
