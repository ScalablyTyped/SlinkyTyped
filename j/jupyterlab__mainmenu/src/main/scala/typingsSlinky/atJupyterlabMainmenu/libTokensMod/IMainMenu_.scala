package typingsSlinky.atJupyterlabMainmenu.libTokensMod

import typingsSlinky.atJupyterlabMainmenu.libEditMod.IEditMenu
import typingsSlinky.atJupyterlabMainmenu.libFileMod.IFileMenu
import typingsSlinky.atJupyterlabMainmenu.libHelpMod.IHelpMenu
import typingsSlinky.atJupyterlabMainmenu.libKernelMod.IKernelMenu
import typingsSlinky.atJupyterlabMainmenu.libRunMod.IRunMenu
import typingsSlinky.atJupyterlabMainmenu.libSettingsMod.ISettingsMenu
import typingsSlinky.atJupyterlabMainmenu.libTabsMod.ITabsMenu
import typingsSlinky.atJupyterlabMainmenu.libTokensMod.IMainMenu.IAddOptions
import typingsSlinky.atJupyterlabMainmenu.libViewMod.IViewMenu
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsMod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IMainMenu")
@js.native
trait IMainMenu_ extends js.Object {
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
  /**
    * Add a new menu to the main menu bar.
    */
  def addMenu(menu: Menu): Unit = js.native
  def addMenu(menu: Menu, options: IAddOptions): Unit = js.native
}

