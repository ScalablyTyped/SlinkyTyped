package typingsSlinky.jupyterlabMainmenuExtension

import org.scalablytyped.runtime.Shortcut
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A service providing an interface to the main menu.
    */
  @JSImport("@jupyterlab/mainmenu-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IMainMenu] = js.native
  
  object CommandIDs {
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.activateById")
    @js.native
    val activateById: /* "tabsmenu:activate-by-id" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.activatePreviouslyUsedTab")
    @js.native
    val activatePreviouslyUsedTab: /* "tabsmenu:activate-previously-used-tab" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.changeKernel")
    @js.native
    val changeKernel: /* "kernelmenu:change" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.clearAll")
    @js.native
    val clearAll: /* "editmenu:clear-all" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.clearCurrent")
    @js.native
    val clearCurrent: /* "editmenu:clear-current" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.closeAndCleanup")
    @js.native
    val closeAndCleanup: /* "filemenu:close-and-cleanup" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.createConsole")
    @js.native
    val createConsole: /* "filemenu:create-console" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.find")
    @js.native
    val find: /* "editmenu:find" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.goToLine")
    @js.native
    val goToLine: /* "editmenu:go-to-line" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.interruptKernel")
    @js.native
    val interruptKernel: /* "kernelmenu:interrupt" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.lineNumbering")
    @js.native
    val lineNumbering: /* "viewmenu:line-numbering" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.logout")
    @js.native
    val logout: /* "filemenu:logout" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.matchBrackets")
    @js.native
    val matchBrackets: /* "viewmenu:match-brackets" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openEdit")
    @js.native
    val openEdit: /* "editmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openFile")
    @js.native
    val openFile: /* "filemenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openFirst")
    @js.native
    val openFirst: /* "mainmenu:open-first" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openHelp")
    @js.native
    val openHelp: /* "helpmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openKernel")
    @js.native
    val openKernel: /* "kernelmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openRun")
    @js.native
    val openRun: /* "runmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openSettings")
    @js.native
    val openSettings: /* "settingsmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openTabs")
    @js.native
    val openTabs: /* "tabsmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openView")
    @js.native
    val openView: /* "viewmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.redo")
    @js.native
    val redo: /* "editmenu:redo" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartAndRunAll")
    @js.native
    val restartAndRunAll: /* "runmenu:restart-and-run-all" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartAndRunToSelected")
    @js.native
    val restartAndRunToSelected: /* "notebook:restart-and-run-to-selected" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartKernel")
    @js.native
    val restartKernel: /* "kernelmenu:restart" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartKernelAndClear")
    @js.native
    val restartKernelAndClear: /* "kernelmenu:restart-and-clear" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.run")
    @js.native
    val run: /* "runmenu:run" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.runAbove")
    @js.native
    val runAbove: /* "runmenu:run-above" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.runAll")
    @js.native
    val runAll: /* "runmenu:run-all" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.runBelow")
    @js.native
    val runBelow: /* "runmenu:run-below" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.shutdown")
    @js.native
    val shutdown: /* "filemenu:shutdown" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.shutdownAllKernels")
    @js.native
    val shutdownAllKernels: /* "kernelmenu:shutdownAll" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.shutdownKernel")
    @js.native
    val shutdownKernel: /* "kernelmenu:shutdown" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.undo")
    @js.native
    val undo: /* "editmenu:undo" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.wordWrap")
    @js.native
    val wordWrap: /* "viewmenu:word-wrap" */ String = js.native
  }
  
  @JSImport("@jupyterlab/mainmenu-extension", "createEditMenu")
  @js.native
  def createEditMenu(app: JupyterFrontEnd[IShell], menu: EditMenu): Unit = js.native
  
  @JSImport("@jupyterlab/mainmenu-extension", "createFileMenu")
  @js.native
  def createFileMenu(app: JupyterFrontEnd[IShell], menu: FileMenu, router: IRouter): Unit = js.native
  
  @JSImport("@jupyterlab/mainmenu-extension", "createKernelMenu")
  @js.native
  def createKernelMenu(app: JupyterFrontEnd[IShell], menu: KernelMenu): Unit = js.native
  
  @JSImport("@jupyterlab/mainmenu-extension", "createRunMenu")
  @js.native
  def createRunMenu(app: JupyterFrontEnd[IShell], menu: RunMenu): Unit = js.native
  
  @JSImport("@jupyterlab/mainmenu-extension", "createSettingsMenu")
  @js.native
  def createSettingsMenu(_underscore: JupyterFrontEnd[IShell], menu: SettingsMenu): Unit = js.native
  
  @JSImport("@jupyterlab/mainmenu-extension", "createTabsMenu")
  @js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu): Unit = js.native
  @JSImport("@jupyterlab/mainmenu-extension", "createTabsMenu")
  @js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu, labShell: ILabShell): Unit = js.native
  
  @JSImport("@jupyterlab/mainmenu-extension", "createViewMenu")
  @js.native
  def createViewMenu(app: JupyterFrontEnd[IShell], menu: ViewMenu): Unit = js.native
  
  type _To = JupyterFrontEndPlugin[IMainMenu]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IMainMenu] = default
}
