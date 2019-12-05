package typingsSlinky.atJupyterlabMainmenu

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.atPhosphorWidgets.libMenuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu", JSImport.Namespace)
@js.native
object atJupyterlabMainmenuMod extends js.Object {
  @js.native
  class EditMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libEditMod.EditMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libFileMod.FileMenu {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class HelpMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libHelpMod.HelpMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class JupyterLabMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libLabmenuMod.JupyterLabMenu {
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
  
  @js.native
  class KernelMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libKernelMod.KernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class MainMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libMainmenuMod.MainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
  }
  
  @js.native
  class RunMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libRunMod.RunMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class SettingsMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libSettingsMod.SettingsMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class TabsMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libTabsMod.TabsMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class ViewMenu protected ()
    extends typingsSlinky.atJupyterlabMainmenu.libViewMod.ViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object IMainMenu
    extends TopLevel[Token[typingsSlinky.atJupyterlabMainmenu.libTokensMod.IMainMenu]]
  
}

