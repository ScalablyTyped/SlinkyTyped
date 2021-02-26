package typingsSlinky.jupyterlabMainmenu

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabMainmenu.editMod.IEditMenu
import typingsSlinky.jupyterlabMainmenu.fileMod.IFileMenu
import typingsSlinky.jupyterlabMainmenu.helpMod.IHelpMenu
import typingsSlinky.jupyterlabMainmenu.kernelMod.IKernelMenu
import typingsSlinky.jupyterlabMainmenu.runMod.IRunMenu
import typingsSlinky.jupyterlabMainmenu.settingsMod.ISettingsMenu
import typingsSlinky.jupyterlabMainmenu.tabsMod.ITabsMenu
import typingsSlinky.jupyterlabMainmenu.tokensMod.IMainMenu.IAddOptions
import typingsSlinky.jupyterlabMainmenu.viewMod.IViewMenu
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait IMainMenu extends StObject {
    
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
  object IMainMenu extends Shortcut {
    
    @JSImport("@jupyterlab/mainmenu/lib/tokens", "IMainMenu")
    @js.native
    val ^ : Token[IMainMenu] = js.native
    
    /**
      * The options used to add a menu to the main menu.
      */
    @js.native
    trait IAddOptions extends StObject {
      
      /**
        * The rank order of the menu among its siblings.
        */
      var rank: js.UndefOr[Double] = js.native
    }
    object IAddOptions {
      
      @scala.inline
      def apply(): IAddOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAddOptions]
      }
      
      @scala.inline
      implicit class IAddOptionsMutableBuilder[Self <: IAddOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    type _To = Token[IMainMenu]
    
    /* This means you don't have to write `^`, but can instead just say `IMainMenu.foo` */
    override def _to: Token[IMainMenu] = ^
  }
}
