package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.IOptions
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
@JSImport("@lumino/widgets", "DockPanel")
@js.native
object DockPanel extends js.Object {
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.Renderer = js.native
  
  /**
    * A concrete implementation of `IOverlay`.
    *
    * This is the default overlay implementation for a dock panel.
    */
  @js.native
  /**
    * Construct a new overlay.
    */
  class Overlay ()
    extends typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.Overlay
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typingsSlinky.luminoWidgets.dockpanelMod.DockPanel.Renderer
}
