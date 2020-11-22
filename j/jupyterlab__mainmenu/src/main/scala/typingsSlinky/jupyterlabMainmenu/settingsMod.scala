package typingsSlinky.jupyterlabMainmenu

import typingsSlinky.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsSlinky.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsSlinky.luminoWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/mainmenu/lib/settings", JSImport.Namespace)
@js.native
object settingsMod extends js.Object {
  
  @js.native
  class SettingsMenu protected () extends JupyterLabMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ISettingsMenu = IJupyterLabMenu
}
