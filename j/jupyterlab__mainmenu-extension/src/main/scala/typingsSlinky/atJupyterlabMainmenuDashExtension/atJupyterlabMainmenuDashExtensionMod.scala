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
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenuColonclear-all`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenuColonclear-current`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenuColongo-to-line`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenuColonclose-and-cleanup`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenuColoncreate-console`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenuColonrestart-and-clear`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`mainmenuColonopen-first`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrestart-and-run-all`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrun-above`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrun-all`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrun-below`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenuColonactivate-by-id`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenuColonactivate-previously-used-tab`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenuColonline-numbering`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenuColonmatch-brackets`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenuColonword-wrap`
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonfind
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonredo
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonundo
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.filemenuColonlogout
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.filemenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.filemenuColonshutdown
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.helpmenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonchange
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColoninterrupt
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonrestart
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonshutdown
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonshutdownAll
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.runmenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.runmenuColonrun
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.settingsmenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.tabsmenuColonopen
import typingsSlinky.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.viewmenuColonopen
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
  def createSettingsMenu(_underscore: JupyterFrontEnd[IShell], menu: SettingsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu, labShell: ILabShell): Unit = js.native
  def createViewMenu(app: JupyterFrontEnd[IShell], menu: ViewMenu): Unit = js.native
  @js.native
  object CommandIDs extends js.Object {
    val activateById: `tabsmenuColonactivate-by-id` = js.native
    val activatePreviouslyUsedTab: `tabsmenuColonactivate-previously-used-tab` = js.native
    val changeKernel: kernelmenuColonchange = js.native
    val clearAll: `editmenuColonclear-all` = js.native
    val clearCurrent: `editmenuColonclear-current` = js.native
    val closeAndCleanup: `filemenuColonclose-and-cleanup` = js.native
    val createConsole: `filemenuColoncreate-console` = js.native
    val find: editmenuColonfind = js.native
    val goToLine: `editmenuColongo-to-line` = js.native
    val interruptKernel: kernelmenuColoninterrupt = js.native
    val lineNumbering: `viewmenuColonline-numbering` = js.native
    val logout: filemenuColonlogout = js.native
    val matchBrackets: `viewmenuColonmatch-brackets` = js.native
    val openEdit: editmenuColonopen = js.native
    val openFile: filemenuColonopen = js.native
    val openFirst: `mainmenuColonopen-first` = js.native
    val openHelp: helpmenuColonopen = js.native
    val openKernel: kernelmenuColonopen = js.native
    val openRun: runmenuColonopen = js.native
    val openSettings: settingsmenuColonopen = js.native
    val openTabs: tabsmenuColonopen = js.native
    val openView: viewmenuColonopen = js.native
    val redo: editmenuColonredo = js.native
    val restartAndRunAll: `runmenuColonrestart-and-run-all` = js.native
    val restartKernel: kernelmenuColonrestart = js.native
    val restartKernelAndClear: `kernelmenuColonrestart-and-clear` = js.native
    val run: runmenuColonrun = js.native
    val runAbove: `runmenuColonrun-above` = js.native
    val runAll: `runmenuColonrun-all` = js.native
    val runBelow: `runmenuColonrun-below` = js.native
    val shutdown: filemenuColonshutdown = js.native
    val shutdownAllKernels: kernelmenuColonshutdownAll = js.native
    val shutdownKernel: kernelmenuColonshutdown = js.native
    val undo: editmenuColonundo = js.native
    val wordWrap: `viewmenuColonword-wrap` = js.native
  }
  
}

