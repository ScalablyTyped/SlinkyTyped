package typingsSlinky.phosphorWidgets.mod

import typingsSlinky.phosphorWidgets.boxpanelMod.BoxPanel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "BoxPanel")
@js.native
/**
  * Construct a new box panel.
  *
  * @param options - The options for initializing the box panel.
  */
class BoxPanel ()
  extends typingsSlinky.phosphorWidgets.boxpanelMod.BoxPanel {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "BoxPanel")
@js.native
object BoxPanel extends js.Object {
  /**
    * Get the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel size basis for the widget.
    */
  def getSizeBasis(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget): Double = js.native
  /**
    * Get the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The box panel stretch factor for the widget.
    */
  def getStretch(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget): Double = js.native
  /**
    * Set the box panel size basis for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the size basis.
    */
  def setSizeBasis(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget, value: Double): Unit = js.native
  /**
    * Set the box panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget, value: Double): Unit = js.native
}

