package typingsSlinky.atJupyterlabUiDashComponents.libIconTabbarsvgMod.DockPanelSvg

import typingsSlinky.atJupyterlabUiDashComponents.libStyleIconMod.IconKindType
import typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel.IEdges
import typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel.IOverlay
import typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel.IRenderer
import typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typingsSlinky.atPhosphorWidgets.libDockpanelMod.DockPanel.IOptions {
  /**
    * The kind of icon this dock panel widget should render.
    * Adds preset styling to the icons.
    */
  var kind: js.UndefOr[IconKindType] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    edges: IEdges = null,
    kind: IconKindType = null,
    mode: Mode = null,
    overlay: IOverlay = null,
    renderer: IRenderer = null,
    spacing: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

