package typingsSlinky.phosphorWidgets.stackedpanelMod

import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.panelMod.Panel
import typingsSlinky.phosphorWidgets.stackedpanelMod.StackedPanel.IOptions
import typingsSlinky.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets/lib/stackedpanel", "StackedPanel")
@js.native
/**
  * Construct a new stacked panel.
  *
  * @param options - The options for initializing the panel.
  */
class StackedPanel_ () extends Panel {
  def this(options: IOptions) = this()
  var _widgetRemoved: js.Any = js.native
  /**
    * A signal emitted when a widget is removed from a stacked panel.
    */
  val widgetRemoved: ISignal[this.type, Widget] = js.native
}

