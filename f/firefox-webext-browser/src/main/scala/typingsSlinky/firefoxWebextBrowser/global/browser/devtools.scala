package typingsSlinky.firefoxWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.devtools.inspectedWindow.EvalOptions
import typingsSlinky.firefoxWebextBrowser.browser.devtools.inspectedWindow.ReloadReloadOptions
import typingsSlinky.firefoxWebextBrowser.browser.devtools.inspectedWindow.Resource
import typingsSlinky.firefoxWebextBrowser.browser.devtools.network.Request
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.ElementsPanel
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.ExtensionPanel
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.SourcesPanel
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `devtools_page`
  *
  * Allowed in: Devtools pages only
  */
object devtools {
  
  /**
    * Use the `browser.devtools.inspectedWindow` API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    *
    * Allowed in: Devtools pages only
    */
  object inspectedWindow {
    
    /* devtools.inspectedWindow functions */
    /**
      * Evaluates a JavaScript expression in the context of the main frame of the inspected page. The expression must evaluate to a JSON-compliant object, otherwise an exception is thrown. The eval function can report either a DevTools-side error or a JavaScript exception that occurs during evaluation. In either case, the `result` parameter of the callback is `undefined`. In the case of a DevTools-side error, the `isException` parameter is non-null and has `isError` set to true and `code` set to an error code. In the case of a JavaScript error, `isException` is set to true and `value` is set to the string value of thrown object.
      * @param expression An expression to evaluate.
      * @param [options] The options parameter can contain one or more options.
      */
    @JSGlobal("browser.devtools.inspectedWindow.eval")
    @js.native
    def eval(expression: String): js.Promise[js.Object] = js.native
    @JSGlobal("browser.devtools.inspectedWindow.eval")
    @js.native
    def eval(expression: String, options: EvalOptions): js.Promise[js.Object] = js.native
    
    /**
      * Retrieves the list of resources from the inspected page.
      * @deprecated Unsupported on Firefox at this time.
      */
    @JSGlobal("browser.devtools.inspectedWindow.getResources")
    @js.native
    def getResources(): js.Promise[js.Array[Resource]] = js.native
    
    /* devtools.inspectedWindow events */
    /**
      * Fired when a new resource is added to the inspected page.
      * @deprecated Unsupported on Firefox at this time.
      */
    @JSGlobal("browser.devtools.inspectedWindow.onResourceAdded")
    @js.native
    val onResourceAdded: js.UndefOr[WebExtEvent[js.Function1[/* resource */ Resource, Unit]]] = js.native
    
    /**
      * Fired when a new revision of the resource is committed (e.g. user saves an edited version of the resource in the Developer Tools).
      * @param content New content of the resource.
      * @deprecated Unsupported on Firefox at this time.
      */
    @JSGlobal("browser.devtools.inspectedWindow.onResourceContentCommitted")
    @js.native
    val onResourceContentCommitted: js.UndefOr[WebExtEvent[js.Function2[/* resource */ Resource, /* content */ String, Unit]]] = js.native
    
    /** Reloads the inspected page. */
    @JSGlobal("browser.devtools.inspectedWindow.reload")
    @js.native
    def reload(): Unit = js.native
    @JSGlobal("browser.devtools.inspectedWindow.reload")
    @js.native
    def reload(reloadOptions: ReloadReloadOptions): Unit = js.native
    
    /* devtools.inspectedWindow properties */
    /** The ID of the tab being inspected. This ID may be used with browser.tabs.* API. */
    @JSGlobal("browser.devtools.inspectedWindow.tabId")
    @js.native
    val tabId: Double = js.native
  }
  
  /**
    * Use the `browser.devtools.network` API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    *
    * Allowed in: Devtools pages only
    */
  object network {
    
    /* devtools.network functions */
    /** Returns HAR log that contains all known network requests. */
    @JSGlobal("browser.devtools.network.getHAR")
    @js.native
    def getHAR(): js.Promise[StringDictionary[_]] = js.native
    
    /**
      * Fired when the inspected window navigates to a new page.
      * @param url URL of the new page.
      */
    @JSGlobal("browser.devtools.network.onNavigated")
    @js.native
    val onNavigated: WebExtEvent[js.Function1[/* url */ String, Unit]] = js.native
    
    /* devtools.network events */
    /**
      * Fired when a network request is finished and all request data are available.
      * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
      */
    @JSGlobal("browser.devtools.network.onRequestFinished")
    @js.native
    val onRequestFinished: WebExtEvent[js.Function1[/* request */ Request, Unit]] = js.native
  }
  
  /**
    * Use the `browser.devtools.panels` API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    *
    * Allowed in: Devtools pages only
    */
  object panels {
    
    /* devtools.panels functions */
    /**
      * Creates an extension panel.
      * @param title Title that is displayed next to the extension icon in the Developer Tools toolbar.
      * @param iconPath Path of the panel's icon relative to the extension directory, or an empty string to use the default extension icon as the panel icon.
      * @param pagePath Path of the panel's HTML page relative to the extension directory.
      */
    @JSGlobal("browser.devtools.panels.create")
    @js.native
    def create(title: String, iconPath: ExtensionURL, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
    @JSGlobal("browser.devtools.panels.create")
    @js.native
    def create(title: String, iconPath: _empty, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
    
    /* devtools.panels properties */
    /** Elements panel. */
    @JSGlobal("browser.devtools.panels.elements")
    @js.native
    val elements: ElementsPanel = js.native
    
    /* devtools.panels events */
    /**
      * Fired when the devtools theme changes.
      * @param themeName The name of the current devtools theme.
      */
    @JSGlobal("browser.devtools.panels.onThemeChanged")
    @js.native
    val onThemeChanged: WebExtEvent[js.Function1[/* themeName */ String, Unit]] = js.native
    
    /**
      * Requests DevTools to open a URL in a Developer Tools panel.
      * @param url The URL of the resource to open.
      * @param lineNumber Specifies the line number to scroll to when the resource is loaded.
      * @deprecated Unsupported on Firefox at this time.
      */
    @JSGlobal("browser.devtools.panels.openResource")
    @js.native
    def openResource(url: String, lineNumber: Double): js.Promise[Unit] = js.native
    
    /**
      * Specifies the function to be called when the user clicks a resource link in the Developer Tools window. To unset the handler, either call the method with no parameters or pass null as the parameter.
      * @deprecated Unsupported on Firefox at this time.
      */
    @JSGlobal("browser.devtools.panels.setOpenResourceHandler")
    @js.native
    def setOpenResourceHandler(): js.Promise[Resource] = js.native
    
    /** Sources panel. */
    @JSGlobal("browser.devtools.panels.sources")
    @js.native
    val sources: SourcesPanel = js.native
    
    /** The name of the current devtools theme. */
    @JSGlobal("browser.devtools.panels.themeName")
    @js.native
    val themeName: String = js.native
  }
}
