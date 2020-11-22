package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.windows.CreateCreateData
import typingsSlinky.firefoxWebextBrowser.browser.windows.GetAllGetInfo
import typingsSlinky.firefoxWebextBrowser.browser.windows.GetInfo
import typingsSlinky.firefoxWebextBrowser.browser.windows.UpdateUpdateInfo
import typingsSlinky.firefoxWebextBrowser.browser.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.windows")
@js.native
object windows extends js.Object {
  
  /** The windowId value that represents the current window. */
  val WINDOW_ID_CURRENT: Double = js.native
  
  /* windows properties */
  /** The windowId value that represents the absence of a browser window. */
  val WINDOW_ID_NONE: Double = js.native
  
  /** Creates (opens) a new browser with any optional sizing, position or default URL provided. */
  def create(): js.Promise[Window] = js.native
  def create(createData: CreateCreateData): js.Promise[Window] = js.native
  
  /* windows functions */
  /** Gets details about a window. */
  def get(windowId: Double): js.Promise[Window] = js.native
  def get(windowId: Double, getInfo: GetInfo): js.Promise[Window] = js.native
  
  /**
    * Gets all windows.
    * @param [getInfo] Specifies properties used to filter the `windows.Window` returned and to determine whether they should contain a list of the `tabs.Tab` objects.
    */
  def getAll(): js.Promise[js.Array[Window]] = js.native
  def getAll(getInfo: GetAllGetInfo): js.Promise[js.Array[Window]] = js.native
  
  /** Gets the current window. */
  def getCurrent(): js.Promise[Window] = js.native
  def getCurrent(getInfo: GetInfo): js.Promise[Window] = js.native
  
  /** Gets the window that was most recently focused — typically the window 'on top'. */
  def getLastFocused(): js.Promise[Window] = js.native
  def getLastFocused(getInfo: GetInfo): js.Promise[Window] = js.native
  
  /* windows events */
  /**
    * Fired when a window is created.
    * @param window Details of the window that was created.
    */
  val onCreated: WebExtEvent[js.Function1[/* window */ Window, Unit]] = js.native
  
  /**
    * Fired when the currently focused window changes. Will be `windows.WINDOW_ID_NONE` if all browser windows have lost focus. Note: On some Linux window managers, WINDOW_ID_NONE will always be sent immediately preceding a switch from one browser window to another.
    * @param windowId ID of the newly focused window.
    */
  val onFocusChanged: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  
  /**
    * Fired when a window is removed (closed).
    * @param windowId ID of the removed window.
    */
  val onRemoved: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
  
  /** Removes (closes) a window, and all the tabs inside it. */
  def remove(windowId: Double): js.Promise[Unit] = js.native
  
  /**
    * Updates the properties of a window. Specify only the properties that you want to change; unspecified properties will be left unchanged.
    */
  def update(windowId: Double, updateInfo: UpdateUpdateInfo): js.Promise[Window] = js.native
}
