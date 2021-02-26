package typingsSlinky.jupyterlabMainmenu

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mainmenu", "EditMenu")
  @js.native
  class EditMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.editMod.EditMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "FileMenu")
  @js.native
  class FileMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.fileMod.FileMenu {
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "HelpMenu")
  @js.native
  class HelpMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.helpMod.HelpMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
  }
  
  object IMainMenu extends Shortcut {
    
    @JSImport("@jupyterlab/mainmenu", "IMainMenu")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu]
    
    /* This means you don't have to write `^`, but can instead just say `IMainMenu.foo` */
    override def _to: Token[typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu] = ^
  }
  
  @JSImport("@jupyterlab/mainmenu", "JupyterLabMenu")
  @js.native
  class JupyterLabMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the phosphor menu.
      *
      * @param includeSeparators - whether to include separators between the
      *   groups that are added to the menu.
      */
    def this(options: IOptions) = this()
    def this(options: IOptions, includeSeparators: Boolean) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "KernelMenu")
  @js.native
  class KernelMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.kernelMod.KernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "MainMenu")
  @js.native
  class MainMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.mainmenuMod.MainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "RunMenu")
  @js.native
  class RunMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.runMod.RunMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "SettingsMenu")
  @js.native
  class SettingsMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.settingsMod.SettingsMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "TabsMenu")
  @js.native
  class TabsMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.tabsMod.TabsMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "ViewMenu")
  @js.native
  class ViewMenu protected ()
    extends typingsSlinky.jupyterlabMainmenu.viewMod.ViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
  }
}
