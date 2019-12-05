package typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.atPhosphorWidgets.libTabbarMod.TabBar
import typingsSlinky.atPhosphorWidgets.libWidgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IRenderer`.
  */
@JSImport("@phosphor/widgets/lib/dockpanel", "DockPanel.Renderer")
@js.native
class Renderer ()
  extends typingsSlinky.atPhosphorWidgets.libDocklayoutMod.DockLayout.IRenderer {
  /**
    * Create a new handle node for use with a dock layout.
    *
    * @returns A new handle node for a dock layout.
    */
  /* CompleteClass */
  override def createHandle(): HTMLDivElement = js.native
  /**
    * Create a new tab bar for use with a dock layout.
    *
    * @returns A new tab bar for a dock layout.
    */
  /* CompleteClass */
  override def createTabBar(): TabBar[Widget] = js.native
}

