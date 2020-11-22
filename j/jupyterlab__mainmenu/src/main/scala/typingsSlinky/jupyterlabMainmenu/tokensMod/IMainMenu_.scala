package typingsSlinky.jupyterlabMainmenu.tokensMod

import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu
import typingsSlinky.jupyterlabMainmenu.fileMod.IFileMenu
import typingsSlinky.jupyterlabMainmenu.helpMod.IHelpMenu
import typingsSlinky.jupyterlabMainmenu.kernelMod.IKernelMenu
import typingsSlinky.jupyterlabMainmenu.runMod.IRunMenu
import typingsSlinky.jupyterlabMainmenu.settingsMod.ISettingsMenu
import typingsSlinky.jupyterlabMainmenu.tabsMod.ITabsMenu
import typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu.IAddOptions
import typingsSlinky.jupyterlabMainmenu.viewMod.IViewMenu
import typingsSlinky.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMainMenu_ extends js.Object {
  
  /**
    * Add a new menu to the main menu bar.
    */
  def addMenu(menu: Menu): Unit = js.native
  def addMenu(menu: Menu, options: IAddOptions): Unit = js.native
  
  /**
    * The application "Edit" menu.
    */
  val editMenu: IEditMenu = js.native
  
  /**
    * The application "File" menu.
    */
  val fileMenu: IFileMenu = js.native
  
  /**
    * The application "Help" menu.
    */
  val helpMenu: IHelpMenu = js.native
  
  /**
    * The application "Kernel" menu.
    */
  val kernelMenu: IKernelMenu = js.native
  
  /**
    * The application "Run" menu.
    */
  val runMenu: IRunMenu = js.native
  
  /**
    * The application "Settings" menu.
    */
  val settingsMenu: ISettingsMenu = js.native
  
  /**
    * The application "Tabs" menu.
    */
  val tabsMenu: ITabsMenu = js.native
  
  /**
    * The application "View" menu.
    */
  val viewMenu: IViewMenu = js.native
}
