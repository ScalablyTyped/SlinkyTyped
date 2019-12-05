package typingsSlinky.atJupyterlabMainmenuDashExtension

import typingsSlinky.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typingsSlinky.atJupyterlabApplication.libShellMod.ILabShell
import typingsSlinky.atJupyterlabApplication.libTokensMod.IRouter
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.EditMenu
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.FileMenu
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.KernelMenu
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.RunMenu
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.SettingsMenu
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.TabsMenu
import typingsSlinky.atJupyterlabMainmenu.atJupyterlabMainmenuMod.ViewMenu
import typingsSlinky.atJupyterlabMainmenu.libTokensMod.IMainMenu
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:clear-all`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:clear-current`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:find`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:go-to-line`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:redo`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenu:undo`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenu:close-and-cleanup`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenu:create-console`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenu:logout`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenu:shutdown`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`helpmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:change`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:interrupt`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:restart-and-clear`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:restart`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:shutdownAll`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenu:shutdown`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`mainmenu:open-first`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenu:restart-and-run-all`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenu:run-above`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenu:run-all`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenu:run-below`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenu:run`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`settingsmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenu:activate-by-id`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenu:activate-previously-used-tab`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenu:line-numbering`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenu:match-brackets`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenu:open`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenu:word-wrap`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
@js.native
object atJupyterlabMainmenuDashExtensionMod extends js.Object {
  /**
    * A service providing an interface to the main menu.
    */
  val default: JupyterFrontEndPlugin[IMainMenu] = js.native
  def createEditMenu(app: JupyterFrontEnd[IShell], menu: EditMenu): Unit = js.native
  def createFileMenu(app: JupyterFrontEnd[IShell], menu: FileMenu, router: IRouter): Unit = js.native
  def createKernelMenu(app: JupyterFrontEnd[IShell], menu: KernelMenu): Unit = js.native
  def createRunMenu(app: JupyterFrontEnd[IShell], menu: RunMenu): Unit = js.native
  def createSettingsMenu(`_`: JupyterFrontEnd[IShell], menu: SettingsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu, labShell: ILabShell): Unit = js.native
  def createViewMenu(app: JupyterFrontEnd[IShell], menu: ViewMenu): Unit = js.native
  @js.native
  object CommandIDs extends js.Object {
    val activateById: `tabsmenu:activate-by-id` = js.native
    val activatePreviouslyUsedTab: `tabsmenu:activate-previously-used-tab` = js.native
    val changeKernel: `kernelmenu:change` = js.native
    val clearAll: `editmenu:clear-all` = js.native
    val clearCurrent: `editmenu:clear-current` = js.native
    val closeAndCleanup: `filemenu:close-and-cleanup` = js.native
    val createConsole: `filemenu:create-console` = js.native
    val find: `editmenu:find` = js.native
    val goToLine: `editmenu:go-to-line` = js.native
    val interruptKernel: `kernelmenu:interrupt` = js.native
    val lineNumbering: `viewmenu:line-numbering` = js.native
    val logout: `filemenu:logout` = js.native
    val matchBrackets: `viewmenu:match-brackets` = js.native
    val openEdit: `editmenu:open` = js.native
    val openFile: `filemenu:open` = js.native
    val openFirst: `mainmenu:open-first` = js.native
    val openHelp: `helpmenu:open` = js.native
    val openKernel: `kernelmenu:open` = js.native
    val openRun: `runmenu:open` = js.native
    val openSettings: `settingsmenu:open` = js.native
    val openTabs: `tabsmenu:open` = js.native
    val openView: `viewmenu:open` = js.native
    val redo: `editmenu:redo` = js.native
    val restartAndRunAll: `runmenu:restart-and-run-all` = js.native
    val restartKernel: `kernelmenu:restart` = js.native
    val restartKernelAndClear: `kernelmenu:restart-and-clear` = js.native
    val run: `runmenu:run` = js.native
    val runAbove: `runmenu:run-above` = js.native
    val runAll: `runmenu:run-all` = js.native
    val runBelow: `runmenu:run-below` = js.native
    val shutdown: `filemenu:shutdown` = js.native
    val shutdownAllKernels: `kernelmenu:shutdownAll` = js.native
    val shutdownKernel: `kernelmenu:shutdown` = js.native
    val undo: `editmenu:undo` = js.native
    val wordWrap: `viewmenu:word-wrap` = js.native
  }
  
}

