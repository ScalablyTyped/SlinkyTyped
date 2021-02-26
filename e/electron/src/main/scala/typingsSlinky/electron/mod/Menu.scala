package typingsSlinky.electron.mod

import typingsSlinky.electron.Electron.MenuItemConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "Menu")
@js.native
/**
  * Menu
  */
class Menu ()
  extends typingsSlinky.electron.Electron.Menu
object Menu {
  
  /**
    * Generally, the `template` is an array of `options` for constructing a MenuItem.
    * The usage can be referenced above.
    *
    * You can also attach other fields to the element of the `template` and they will
    * become properties of the constructed menu items.
    */
  /* static member */
  @JSImport("electron", "Menu.buildFromTemplate")
  @js.native
  def buildFromTemplate(template: js.Array[MenuItemConstructorOptions | typingsSlinky.electron.Electron.MenuItem]): typingsSlinky.electron.Electron.Menu = js.native
  
  /**
    * The application menu, if set, or `null`, if not set.
    *
    * **Note:** The returned `Menu` instance doesn't support dynamic addition or
    * removal of menu items. Instance properties can still be dynamically modified.
    */
  /* static member */
  @JSImport("electron", "Menu.getApplicationMenu")
  @js.native
  def getApplicationMenu(): typingsSlinky.electron.Electron.Menu | Null = js.native
  
  /**
    * Sends the `action` to the first responder of application. This is used for
    * emulating default macOS menu behaviors. Usually you would use the `role`
    * property of a `MenuItem`.
    *
    * See the macOS Cocoa Event Handling Guide for more information on macOS' native
    * actions.
    *
    * @platform darwin
    */
  /* static member */
  @JSImport("electron", "Menu.sendActionToFirstResponder")
  @js.native
  def sendActionToFirstResponder(action: String): Unit = js.native
  
  /**
    * Sets `menu` as the application menu on macOS. On Windows and Linux, the `menu`
    * will be set as each window's top menu.
    *
    * Also on Windows and Linux, you can use a `&` in the top-level item name to
    * indicate which letter should get a generated accelerator. For example, using
    * `&File` for the file menu would result in a generated `Alt-F` accelerator that
    * opens the associated menu. The indicated character in the button label gets an
    * underline. The `&` character is not displayed on the button label.
    *
    * Passing `null` will suppress the default menu. On Windows and Linux, this has
    * the additional effect of removing the menu bar from the window.
    *
    * **Note:** The default menu will be created automatically if the app does not set
    * one. It contains standard items such as `File`, `Edit`, `View`, `Window` and
    * `Help`.
    */
  /* static member */
  @JSImport("electron", "Menu.setApplicationMenu")
  @js.native
  def setApplicationMenu(): Unit = js.native
  @JSImport("electron", "Menu.setApplicationMenu")
  @js.native
  def setApplicationMenu(menu: typingsSlinky.electron.Electron.Menu): Unit = js.native
}
