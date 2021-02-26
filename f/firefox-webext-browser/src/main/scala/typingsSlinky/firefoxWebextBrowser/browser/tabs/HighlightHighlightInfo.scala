package typingsSlinky.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightHighlightInfo extends StObject {
  
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab` objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's manifest file includes the `"tabs"` permission. If false, the `windows.Window` won't have the `tabs` property.
    */
  var populate: js.UndefOr[Boolean] = js.native
  
  /** One or more tab indices to highlight. */
  var tabs: js.Array[Double] | Double = js.native
  
  /** The window that contains the tabs. */
  var windowId: js.UndefOr[Double] = js.native
}
object HighlightHighlightInfo {
  
  @scala.inline
  def apply(tabs: js.Array[Double] | Double): HighlightHighlightInfo = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightHighlightInfo]
  }
  
  @scala.inline
  implicit class HighlightHighlightInfoMutableBuilder[Self <: HighlightHighlightInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
    
    @scala.inline
    def setTabs(value: js.Array[Double] | Double): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: Double*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
