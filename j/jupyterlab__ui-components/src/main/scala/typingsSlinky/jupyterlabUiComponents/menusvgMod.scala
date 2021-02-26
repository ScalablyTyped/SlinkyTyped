package typingsSlinky.jupyterlabUiComponents

import typingsSlinky.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typingsSlinky.luminoWidgets.mod.ContextMenu
import typingsSlinky.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menusvgMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "ContextMenuSvg")
  @js.native
  class ContextMenuSvg protected () extends ContextMenu {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
    
    @JSName("menu")
    val menu_ContextMenuSvg: MenuSvg = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg")
  @js.native
  class MenuSvg protected () extends Menu {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsSlinky.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typingsSlinky.luminoWidgets.mod.Menu.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.overrideDefaultRenderer")
    @js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
  }
}
