package typingsSlinky.firefoxWebextBrowser.browser

import typingsSlinky.firefoxWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object windows {
  
  @js.native
  trait CreateCreateData extends StObject {
    
    /** Allow scripts to close the window. */
    var allowScriptsToClose: js.UndefOr[Boolean] = js.native
    
    /** The CookieStoreId to use for all tabs that were created when the window is opened. */
    var cookieStoreId: js.UndefOr[String] = js.native
    
    /**
      * If true, opens an active window. If false, opens an inactive window.
      * @deprecated Unsupported on Firefox at this time.
      */
    var focused: js.UndefOr[Boolean] = js.native
    
    /**
      * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Whether the new window should be an incognito window. */
    var incognito: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of pixels to position the new window from the left edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      */
    var state: js.UndefOr[WindowState] = js.native
    
    /** The id of the tab for which you want to adopt to the new window. */
    var tabId: js.UndefOr[Double] = js.native
    
    /** A string to add to the beginning of the window title. */
    var titlePreface: js.UndefOr[String] = js.native
    
    /**
      * The number of pixels to position the new window from the top edge of the screen. If not specified, the new window is offset naturally from the last focused window. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.native
    
    /**
      * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
      */
    var `type`: js.UndefOr[CreateType] = js.native
    
    /**
      * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e. 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within the extension. Defaults to the New Tab Page.
      */
    var url: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object CreateCreateData {
    
    @scala.inline
    def apply(): CreateCreateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateCreateData]
    }
    
    @scala.inline
    implicit class CreateCreateDataMutableBuilder[Self <: CreateCreateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowScriptsToClose(value: Boolean): Self = StObject.set(x, "allowScriptsToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowScriptsToCloseUndefined: Self = StObject.set(x, "allowScriptsToClose", js.undefined)
      
      @scala.inline
      def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setTitlePreface(value: String): Self = StObject.set(x, "titlePreface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePrefaceUndefined: Self = StObject.set(x, "titlePreface", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: CreateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String | js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless the '--enable-panels' flag is set.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel
  */
  trait CreateType extends StObject
  object CreateType {
    
    @scala.inline
    def detached_panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel = "detached_panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.detached_panel]
    
    @scala.inline
    def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    @scala.inline
    def panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
    
    @scala.inline
    def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
  }
  
  /**
    * Specifies properties used to filter the `windows.Window` returned and to determine whether they should contain a list of the `tabs.Tab` objects.
    */
  @js.native
  trait GetAllGetInfo extends StObject {
    
    /**
      * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab` objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's manifest file includes the `"tabs"` permission.
      */
    var populate: js.UndefOr[Boolean] = js.native
    
    /**
      * If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's own windows.
      * @deprecated If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's own windows.
      */
    var windowTypes: js.UndefOr[js.Array[WindowType]] = js.native
  }
  object GetAllGetInfo {
    
    @scala.inline
    def apply(): GetAllGetInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAllGetInfo]
    }
    
    @scala.inline
    implicit class GetAllGetInfoMutableBuilder[Self <: GetAllGetInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      @scala.inline
      def setWindowTypes(value: js.Array[WindowType]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      @scala.inline
      def setWindowTypesVarargs(value: WindowType*): Self = StObject.set(x, "windowTypes", js.Array(value :_*))
    }
  }
  
  /** Specifies whether the `windows.Window` returned should contain a list of the `tabs.Tab` objects. */
  @js.native
  trait GetInfo extends StObject {
    
    /**
      * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab` objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's manifest file includes the `"tabs"` permission.
      */
    var populate: js.UndefOr[Boolean] = js.native
    
    /**
      * `windowTypes` is deprecated and ignored on Firefox.
      * @deprecated `windowTypes` is deprecated and ignored on Firefox.
      */
    var windowTypes: js.UndefOr[js.Array[WindowType]] = js.native
  }
  object GetInfo {
    
    @scala.inline
    def apply(): GetInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInfo]
    }
    
    @scala.inline
    implicit class GetInfoMutableBuilder[Self <: GetInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopulate(value: Boolean): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      @scala.inline
      def setWindowTypes(value: js.Array[WindowType]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
      
      @scala.inline
      def setWindowTypesVarargs(value: WindowType*): Self = StObject.set(x, "windowTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateUpdateInfo extends StObject {
    
    /**
      * If true, causes the window to be displayed in a manner that draws the user's attention to the window, without changing the focused window. The effect lasts until the user changes focus to the window. This option has no effect if the window already has focus. Set to false to cancel a previous draw attention request.
      */
    var drawAttention: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
      */
    var focused: js.UndefOr[Boolean] = js.native
    
    /** The height to resize the window to in pixels. This value is ignored for panels. */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for panels.
      */
    var left: js.UndefOr[Double] = js.native
    
    /**
      * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with 'left', 'top', 'width' or 'height'.
      */
    var state: js.UndefOr[WindowState] = js.native
    
    /** A string to add to the beginning of the window title. */
    var titlePreface: js.UndefOr[String] = js.native
    
    /**
      * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
      */
    var top: js.UndefOr[Double] = js.native
    
    /** The width to resize the window to in pixels. This value is ignored for panels. */
    var width: js.UndefOr[Double] = js.native
  }
  object UpdateUpdateInfo {
    
    @scala.inline
    def apply(): UpdateUpdateInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUpdateInfo]
    }
    
    @scala.inline
    implicit class UpdateUpdateInfoMutableBuilder[Self <: UpdateUpdateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawAttention(value: Boolean): Self = StObject.set(x, "drawAttention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawAttentionUndefined: Self = StObject.set(x, "drawAttention", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTitlePreface(value: String): Self = StObject.set(x, "titlePreface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePrefaceUndefined: Self = StObject.set(x, "titlePreface", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    /** Whether the window is set to be always on top. */
    var alwaysOnTop: Boolean = js.native
    
    /** Whether the window is currently the focused window. */
    var focused: Boolean = js.native
    
    /**
      * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned height property, for example when querying closed windows from the `sessions` API.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may not be assigned an ID, for example when querying windows using the `sessions` API, in which case a session ID may be present.
      */
    var id: js.UndefOr[Double] = js.native
    
    /** Whether the window is incognito. */
    var incognito: Boolean = js.native
    
    /**
      * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may not be assigned left property, for example when querying closed windows from the `sessions` API.
      */
    var left: js.UndefOr[Double] = js.native
    
    /** The session ID used to uniquely identify a Window obtained from the `sessions` API. */
    var sessionId: js.UndefOr[String] = js.native
    
    /** The state of this browser window. */
    var state: js.UndefOr[WindowState] = js.native
    
    /** Array of `tabs.Tab` objects representing the current tabs in the window. */
    var tabs: js.UndefOr[js.Array[Tab]] = js.native
    
    /** The title of the window. Read-only. */
    var title: js.UndefOr[String] = js.native
    
    /**
      * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may not be assigned top property, for example when querying closed windows from the `sessions` API.
      */
    var top: js.UndefOr[Double] = js.native
    
    /** The type of browser window this is. */
    var `type`: js.UndefOr[WindowType] = js.native
    
    /**
      * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be assigned width property, for example when querying closed windows from the `sessions` API.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Window {
    
    @scala.inline
    def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
      val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      @scala.inline
      def setState(value: WindowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      @scala.inline
      def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: WindowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * The state of this browser window. Under some circumstances a Window may not be assigned state property, for example when querying closed windows from the `sessions` API.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked
  */
  trait WindowState extends StObject
  object WindowState {
    
    @scala.inline
    def docked: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = "docked".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked]
    
    @scala.inline
    def fullscreen: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = "fullscreen".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen]
    
    @scala.inline
    def maximized: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = "maximized".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized]
    
    @scala.inline
    def minimized: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = "minimized".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized]
    
    @scala.inline
    def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
  }
  
  /* windows types */
  /**
    * The type of browser window this is. Under some circumstances a Window may not be assigned type property, for example when querying closed windows from the `sessions` API.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools
  */
  trait WindowType extends StObject
  object WindowType {
    
    @scala.inline
    def app: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app = "app".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.app]
    
    @scala.inline
    def devtools: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools = "devtools".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.devtools]
    
    @scala.inline
    def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    @scala.inline
    def panel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel = "panel".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.panel]
    
    @scala.inline
    def popup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
  }
}
