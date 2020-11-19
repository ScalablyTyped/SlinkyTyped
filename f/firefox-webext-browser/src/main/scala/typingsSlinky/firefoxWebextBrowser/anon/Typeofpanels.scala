package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.devtools.inspectedWindow.Resource
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.Create
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.ElementsPanel
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.ExtensionPanel
import typingsSlinky.firefoxWebextBrowser.browser.devtools.panels.SourcesPanel
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpanels extends js.Object {
  
  def create(title: String, iconPath: Create, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
  /* devtools.panels functions */
  /**
    * Creates an extension panel.
    * @param title Title that is displayed next to the extension icon in the Developer Tools toolbar.
    * @param iconPath Path of the panel's icon relative to the extension directory, or an empty string to use the
    *     default extension icon as the panel icon.
    * @param pagePath Path of the panel's HTML page relative to the extension directory.
    */
  def create(title: String, iconPath: ExtensionURL, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
  
  /* devtools.panels properties */
  /** Elements panel. */
  val elements: ElementsPanel = js.native
  
  /* devtools.panels events */
  /**
    * Fired when the devtools theme changes.
    * @param themeName The name of the current devtools theme.
    */
  val onThemeChanged: WebExtEvent[js.Function1[/* themeName */ String, Unit]] = js.native
  
  /**
    * Requests DevTools to open a URL in a Developer Tools panel.
    * @param url The URL of the resource to open.
    * @param lineNumber Specifies the line number to scroll to when the resource is loaded.
    * @deprecated Unsupported on Firefox at this time.
    */
  def openResource(url: String, lineNumber: Double): js.Promise[Unit] = js.native
  
  /**
    * Specifies the function to be called when the user clicks a resource link in the Developer Tools window. To unset
    * the handler, either call the method with no parameters or pass null as the parameter.
    * @deprecated Unsupported on Firefox at this time.
    */
  def setOpenResourceHandler(): js.Promise[Resource] = js.native
  
  /** Sources panel. */
  val sources: SourcesPanel = js.native
  
  /** The name of the current devtools theme. */
  val themeName: String = js.native
}
