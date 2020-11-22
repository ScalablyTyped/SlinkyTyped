package typingsSlinky.jupyterlabUiComponents

import typingsSlinky.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typingsSlinky.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/ui-components/lib/icon/widgets", JSImport.Namespace)
@js.native
object widgetsMod extends js.Object {
  
  @js.native
  object CommandPaletteSvg extends js.Object {
    
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer
  }
  
  @js.native
  class ContextMenuSvg protected ()
    extends typingsSlinky.jupyterlabUiComponents.menusvgMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg ()
    extends typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg {
    def this(options: typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.IOptions) = this()
  }
  @js.native
  object DockPanelSvg extends js.Object {
    
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer = js.native
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer
  }
  
  @js.native
  class MenuSvg protected ()
    extends typingsSlinky.jupyterlabUiComponents.menusvgMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typingsSlinky.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  @js.native
  object MenuSvg extends js.Object {
    
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer = js.native
    
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer
  }
  
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] ()
    extends typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg[T] {
    def this(options: typingsSlinky.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  @js.native
  object TabBarSvg extends js.Object {
    
    val defaultRenderer: typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer
  }
}
