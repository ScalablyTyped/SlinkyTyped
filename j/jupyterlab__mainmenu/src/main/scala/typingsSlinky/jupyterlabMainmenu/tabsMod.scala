package typingsSlinky.jupyterlabMainmenu

import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/tabs", "TabsMenu")
  @js.native
  class TabsMenu protected () extends JupyterLabMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ITabsMenu = IJupyterLabMenu
}
