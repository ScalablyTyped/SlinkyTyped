package typingsSlinky.phosphorWidgets.mod

import typingsSlinky.phosphorWidgets.PartialICellConfig
import typingsSlinky.phosphorWidgets.gridlayoutMod.GridLayout.ICellConfig
import typingsSlinky.phosphorWidgets.gridlayoutMod.GridLayout.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/widgets", "GridLayout")
@js.native
/**
  * Construct a new grid layout.
  *
  * @param options - The options for initializing the layout.
  */
class GridLayout ()
  extends typingsSlinky.phosphorWidgets.gridlayoutMod.GridLayout {
  def this(options: IOptions) = this()
}

@JSImport("@phosphor/widgets", "GridLayout")
@js.native
object GridLayout extends js.Object {
  /**
    * Get the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The cell config for the widget.
    */
  def getCellConfig(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget): ICellConfig = js.native
  /**
    * Set the cell config for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the cell config.
    */
  def setCellConfig(widget: typingsSlinky.phosphorWidgets.widgetMod.Widget, value: PartialICellConfig): Unit = js.native
}

