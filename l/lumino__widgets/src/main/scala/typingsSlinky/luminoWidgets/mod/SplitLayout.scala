package typingsSlinky.luminoWidgets.mod

import typingsSlinky.luminoWidgets.splitlayoutMod.SplitLayout.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "SplitLayout")
@js.native
class SplitLayout protected ()
  extends typingsSlinky.luminoWidgets.splitlayoutMod.SplitLayout {
  /**
    * Construct a new split layout.
    *
    * @param options - The options for initializing the layout.
    */
  def this(options: IOptions) = this()
}
@JSImport("@lumino/widgets", "SplitLayout")
@js.native
object SplitLayout extends js.Object {
  
  /**
    * Get the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split layout stretch factor for the widget.
    */
  def getStretch(widget: typingsSlinky.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Set the split layout stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typingsSlinky.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
}
