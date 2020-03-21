package typingsSlinky.phosphorWidgets.mod

import typingsSlinky.phosphorWidgets.splitlayoutMod.SplitLayout.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "SplitLayout")
@js.native
class SplitLayout protected ()
  extends typingsSlinky.phosphorWidgets.splitlayoutMod.SplitLayout {
  /**
    * Construct a new split layout.
    *
    * @param options - The options for initializing the layout.
    */
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "SplitLayout")
@js.native
object SplitLayout extends js.Object {
  /**
    * Get the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split layout stretch factor for the widget.
    */
  def getStretch(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget): Double = js.native
  /**
    * Set the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget, value: Double): Unit = js.native
}

