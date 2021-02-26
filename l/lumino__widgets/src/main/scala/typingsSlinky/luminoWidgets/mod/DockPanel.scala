package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "DockPanel")
@js.native
/**
  * Construct a new dock panel.
  *
  * @param options - The options for initializing the panel.
  */
class DockPanel ()
  extends typingsSlinky.luminoWidgets.dockpanelMod.DockPanel {
  def this(options: IOptions) = this()
}
object DockPanel {
  
  /**
    * A concrete implementation of `IOverlay`.
    *
    * This is the default overlay implementation for a dock panel.
    */
  @JSImport("@lumino/widgets", "DockPanel.Overlay")
  @js.native
  /**
    * Construct a new overlay.
    */
  class Overlay ()
    extends typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.Overlay
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "DockPanel.Renderer")
  @js.native
  class Renderer ()
    extends typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "DockPanel.defaultRenderer")
  @js.native
  val defaultRenderer: typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.Renderer = js.native
}
