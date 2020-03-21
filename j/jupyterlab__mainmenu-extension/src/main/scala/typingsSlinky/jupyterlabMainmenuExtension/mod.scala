package typingsSlinky.jupyterlabMainmenuExtension

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsSlinky.jupyterlabApplication.mod.JupyterFrontEnd
import typingsSlinky.jupyterlabApplication.shellMod.ILabShell
import typingsSlinky.jupyterlabApplication.tokensMod.IRouter
import typingsSlinky.jupyterlabMainmenu.mod.EditMenu
import typingsSlinky.jupyterlabMainmenu.mod.FileMenu
import typingsSlinky.jupyterlabMainmenu.mod.KernelMenu
import typingsSlinky.jupyterlabMainmenu.mod.RunMenu
import typingsSlinky.jupyterlabMainmenu.mod.SettingsMenu
import typingsSlinky.jupyterlabMainmenu.mod.TabsMenu
import typingsSlinky.jupyterlabMainmenu.mod.ViewMenu
import typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColonclear-all`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColonclear-current`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColongo-to-line`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`filemenuColonclose-and-cleanup`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`filemenuColoncreate-console`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`kernelmenuColonrestart-and-clear`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`mainmenuColonopen-first`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrestart-and-run-all`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-above`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-all`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-below`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`tabsmenuColonactivate-by-id`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`tabsmenuColonactivate-previously-used-tab`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonline-numbering`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonmatch-brackets`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonword-wrap`
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonfind
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonredo
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonundo
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonlogout
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonshutdown
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.helpmenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonchange
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColoninterrupt
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonrestart
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonshutdown
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonshutdownAll
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.runmenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.runmenuColonrun
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.settingsmenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.tabsmenuColonopen
import typingsSlinky.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.viewmenuColonopen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

