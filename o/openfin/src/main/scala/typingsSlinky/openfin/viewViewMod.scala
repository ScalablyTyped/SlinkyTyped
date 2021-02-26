package typingsSlinky.openfin

import typingsSlinky.openfin.anon.PartialViewOptions
import typingsSlinky.openfin.baseMod.Base
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.preloadScriptMod.PreloadScript
import typingsSlinky.openfin.shapesMod.ContextMenuSettings
import typingsSlinky.openfin.shapesMod.Hotkey
import typingsSlinky.openfin.shapesMod.ViewBounds
import typingsSlinky.openfin.viewMod.ViewEvents
import typingsSlinky.openfin.webcontentsWebcontentsMod.WebContents
import typingsSlinky.openfin.windowOptionMod.Api
import typingsSlinky.openfin.windowOptionMod.ContentNavigation
import typingsSlinky.openfin.windowOptionMod.CustomRequestHeaders
import typingsSlinky.openfin.windowOptionMod.WindowOption
import typingsSlinky.openfin.windowWindowMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewViewMod {
  
  @JSImport("openfin/_v2/api/view/view", JSImport.Default)
  @js.native
  class default protected () extends ViewModule {
    def this(wire: typingsSlinky.openfin.transportMod.default) = this()
  }
  
  @JSImport("openfin/_v2/api/view/view", "View")
  @js.native
  class View protected () extends WebContents[ViewEvents] {
    def this(wire: typingsSlinky.openfin.transportMod.default, identity: Identity) = this()
    
    /**
      * Returns the zoom level of the view.
      * @function getZoomLevel
      * @memberOf View
      * @instance
      * @return {Promise.<number>}
      * @tutorial View.getZoomLevel
      */
    /**
      * Sets the zoom level of the view.
      * @param { number } level The zoom level
      * @function setZoomLevel
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.setZoomLevel
      */
    /**
      * Find and highlight text on a page.
      * @param { string } searchTerm Term to find in page
      * @param { FindInPageOptions } options Search options
      * @function findInPage
      * @memberOf View
      * @instance
      * @return {Promise.<number>}
      * @tutorial View.findInPage
      */
    /**
      * Stops any findInPage call with the provided action.
      * @param {string} action
      * Action to execute when stopping a find in page:<br>
      * "clearSelection" - Clear the selection.<br>
      * "keepSelection" - Translate the selection into a normal selection.<br>
      * "activateSelection" - Focus and click the selection node.<br>
      * @function stopFindInPage
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.stopFindInPage
      */
    /**
      * Navigates the view to a specified URL. The url must contain the protocol prefix such as http:// or https://.
      * @param { string } url - The URL to navigate the view to.
      * @return {Promise.<void>}
      * @function navigate
      * @memberof View
      * @instance
      * @tutorial View.navigate
      * @experimental
      */
    /**
      * Navigates the view back one page.
      * @function navigateBack
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.navigateBack
      */
    /**
      * Navigates the view forward one page.
      * @function navigateForward
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.navigateForward
      */
    /**
      * Stops any current navigation the view is performing.
      * @function stopNavigation
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.stopNavigation
      */
    /**
      * Reloads the view current page
      * @function reload
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.reload
      */
    /**
      * Prints the view's web page
      * @param { PrintOptions } [options] Printer Options
      * @function print
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.print
      */
    /**
      * Returns an array with all system printers
      * @function getPrinters
      * @memberOf View
      * @instance
      * @return { Promise.Array.<PrinterInfo> }
      * @tutorial View.getPrinters
      */
    /**
      * Shows the Chromium Developer Tools
      * @function showDeveloperTools
      * @memberOf View
      * @instance
      * @return {Promise.<void>}
      * @tutorial View.showDeveloperTools
      */
    /**
      * Attaches the current view to a the given window identity.
      * Identity must be the identity of a window in the same application.
      * This detaches the view from its current window, and sets the view to be destroyed when its new window closes.
      * @param target {Identity}
      * @return {Promise.<void>}
      * @tutorial View.attach
      * @experimental
      */
    def attach(target: Identity): js.Promise[Unit] = js.native
    
    /**
      * Destroys the current view
      * @return {Promise.<void>}
      * @tutorial View.destroy
      * @experimental
      */
    def destroy(): js.Promise[Unit] = js.native
    
    /**
      * Gets the bounds (top, left, width, height) of the view relative to its window.
      * @return {Promise.<Bounds>}
      * @tutorial View.getBounds
      * @experimental
      */
    def getBounds(): js.Promise[_] = js.native
    
    /**
      * Retrieves the window the view is currently attached to.
      * @return {Promise.<_Window>}
      * @experimental
      */
    def getCurrentWindow(): js.Promise[Window] = js.native
    
    /**
      * Gets the View's info.
      * @return {Promise.<ViewInfo>}
      * @tutorial View.getInfo
      * @experimental
      */
    def getInfo(): js.Promise[_] = js.native
    
    /**
      * Gets the View's options.
      * @return {Promise<ViewCreationOptions>}
      * @tutorial View.getOptions
      * @experimental
      */
    def getOptions(): js.Promise[ViewCreationOptions] = js.native
    
    /**
      * Hides the current view if it is currently visible.
      * @return {Promise.<void>}
      * @tutorial View.hide
      * @experimental
      */
    def hide(): js.Promise[Unit] = js.native
    
    /**
      * Sets the bounds (top, left, width, height) of the view relative to its window.
      * @param bounds {Bounds}
      * @return {Promise.<void>}
      * @tutorial View.setBounds
      * @experimental
      */
    def setBounds(bounds: ViewBounds): js.Promise[Unit] = js.native
    
    /**
      * Sets a custom window handler. Only works if experimental child windows are enabled for the view.
      * Takes a match pattern or array of match patterns for which to call the handler.
      * If multiple handlers are set that match a url, only the first set one will be called.
      * This can be used to "cascade" listeners.
      * Returns a function to unsubscribe this handler.
      * @tutorial View.setCustomWindowHandler
      * @param { string | string[] } urls Url match pattern or array of match patterns
      * see (https://developer.chrome.com/extensions/match_patterns)
      * @param {Function} handler function that will be called with the window options that match the url.
      * @return {Function}
      * @experimental
      */
    def setCustomWindowHandler(urls: String, handler: js.Function1[/* options */ WindowOption, Unit]): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
    def setCustomWindowHandler(urls: js.Array[String], handler: js.Function1[/* options */ WindowOption, Unit]): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
    
    /**
      * Shows the current view if it is currently hidden.
      * @return {Promise.<void>}
      * @tutorial View.show
      * @experimental
      */
    def show(): js.Promise[Unit] = js.native
    
    /**
      * Gets the view's info.
      * @param { Partial<ViewOptions> } options
      * @return {Promise.<void>}
      * @tutorial View.updateOptions
      * @experimental
      */
    def updateOptions(options: PartialViewOptions): js.Promise[_] = js.native
  }
  
  @js.native
  trait AutoResizeOptions extends StObject {
    
    /**
      * If true, the view's height will grow and shrink together with the window. false
      * by default.
      */
    var height: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the view's x position and width will grow and shrink proportionally with
      * the window. false by default.
      */
    var horizontal: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the view's y position and height will grow and shrink proportionally with
      * the window. false by default.
      */
    var vertical: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the view's width will grow and shrink together with the window. false
      * by default.
      */
    var width: js.UndefOr[Boolean] = js.native
  }
  object AutoResizeOptions {
    
    @scala.inline
    def apply(): AutoResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoResizeOptions]
    }
    
    @scala.inline
    implicit class AutoResizeOptionsMutableBuilder[Self <: AutoResizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ViewCreationOptions extends ViewOptions {
    
    var bounds: js.UndefOr[ViewBounds] = js.native
    
    var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
    
    var hotkeys: js.UndefOr[js.Array[Hotkey]] = js.native
    
    var name: String = js.native
    
    var preloadScripts: js.UndefOr[js.Array[PreloadScript]] = js.native
    
    var processAffinity: js.UndefOr[String] = js.native
    
    var target: Identity = js.native
    
    var url: String = js.native
  }
  object ViewCreationOptions {
    
    @scala.inline
    def apply(name: String, target: Identity, url: String): ViewCreationOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewCreationOptions]
    }
    
    @scala.inline
    implicit class ViewCreationOptionsMutableBuilder[Self <: ViewCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: ViewBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      @scala.inline
      def setCustomRequestHeadersVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "customRequestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setHotkeys(value: js.Array[Hotkey]): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      @scala.inline
      def setHotkeysVarargs(value: Hotkey*): Self = StObject.set(x, "hotkeys", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScripts(value: js.Array[PreloadScript]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      @scala.inline
      def setPreloadScriptsVarargs(value: PreloadScript*): Self = StObject.set(x, "preloadScripts", js.Array(value :_*))
      
      @scala.inline
      def setProcessAffinity(value: String): Self = StObject.set(x, "processAffinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessAffinityUndefined: Self = StObject.set(x, "processAffinity", js.undefined)
      
      @scala.inline
      def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewModule extends Base {
    
    /**
      * Creates a new View.
      * @param { View~options } options - View creation options
      * @return {Promise.<View>}
      * @tutorial View.create
      * @experimental
      * @static
      */
    def create(options: ViewCreationOptions): js.Promise[View] = js.native
    
    /**
      * Asynchronously returns a View object that represents the current view
      * @return {Promise.<View>}
      * @tutorial View.getCurrent
      * @experimental
      * @static
      */
    def getCurrent(): js.Promise[View] = js.native
    
    /**
      * Synchronously returns a View object that represents the current view
      * @return {View}
      * @tutorial View.getCurrentSync
      * @experimental
      * @static
      */
    def getCurrentSync(): View = js.native
    
    var onmessage: js.Any = js.native
    
    /**
      * Asynchronously returns a View object that represents an existing view.
      * @param { Identity } identity
      * @return {Promise.<View>}
      * @tutorial View.wrap
      * @experimental
      * @static
      */
    def wrap(identity: Identity): js.Promise[View] = js.native
    
    /**
      * Synchronously returns a View object that represents an existing view.
      * @param { Identity } identity
      * @return {View}
      * @tutorial View.wrapSync
      * @experimental
      * @static
      */
    def wrapSync(identity: Identity): View = js.native
  }
  
  @js.native
  trait ViewOptions extends StObject {
    
    var api: js.UndefOr[Api] = js.native
    
    var autoResize: js.UndefOr[AutoResizeOptions] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var contentNavigation: js.UndefOr[ContentNavigation] = js.native
    
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
    
    var customContext: js.UndefOr[js.Any] = js.native
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var experimental: js.UndefOr[js.Any] = js.native
  }
  object ViewOptions {
    
    @scala.inline
    def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setAutoResize(value: AutoResizeOptions): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setContentNavigation(value: ContentNavigation): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      @scala.inline
      def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setCustomContext(value: js.Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setExperimental(value: js.Any): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    }
  }
}
