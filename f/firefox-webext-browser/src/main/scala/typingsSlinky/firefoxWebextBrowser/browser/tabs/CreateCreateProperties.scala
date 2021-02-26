package typingsSlinky.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCreateProperties extends StObject {
  
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /** The CookieStoreId for the tab that opened this tab. */
  var cookieStoreId: js.UndefOr[String] = js.native
  
  /** Whether the tab is marked as 'discarded' when created. */
  var discarded: js.UndefOr[Boolean] = js.native
  
  /**
    * The position the tab should take in the window. The provided value will be clamped to between zero and the number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.native
  
  /** Whether the document in the tab should be opened in reader mode. */
  var openInReaderMode: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly created tab.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  
  /** Whether the tab should be pinned. Defaults to `false` */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tab should become the selected tab in the window. Defaults to `true`
    * @deprecated Please use _active_.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** The title used for display if the tab is created in discarded mode. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String] = js.native
  
  /** The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.native
}
object CreateCreateProperties {
  
  @scala.inline
  def apply(): CreateCreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCreateProperties]
  }
  
  @scala.inline
  implicit class CreateCreatePropertiesMutableBuilder[Self <: CreateCreateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setOpenInReaderMode(value: Boolean): Self = StObject.set(x, "openInReaderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenInReaderModeUndefined: Self = StObject.set(x, "openInReaderMode", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = StObject.set(x, "openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenerTabIdUndefined: Self = StObject.set(x, "openerTabId", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
