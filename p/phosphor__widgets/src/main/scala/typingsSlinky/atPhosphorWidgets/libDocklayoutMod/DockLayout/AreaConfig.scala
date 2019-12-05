package typingsSlinky.atPhosphorWidgets.libDocklayoutMod.DockLayout

import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsStrings.`split-area`
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsStrings.`tab-area`
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsStrings.horizontal
import typingsSlinky.atPhosphorWidgets.atPhosphorWidgetsStrings.vertical
import typingsSlinky.atPhosphorWidgets.libWidgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a general area config.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorWidgets.libDocklayoutMod.DockLayout.ITabAreaConfig
  - typings.atPhosphorWidgets.libDocklayoutMod.DockLayout.ISplitAreaConfig
*/
trait AreaConfig extends js.Object

object AreaConfig {
  @scala.inline
  def ITabAreaConfig(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): AreaConfig = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaConfig]
  }
  @scala.inline
  def ISplitAreaConfig(
    children: js.Array[AreaConfig],
    orientation: horizontal | vertical,
    sizes: js.Array[Double],
    `type`: `split-area`
  ): AreaConfig = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaConfig]
  }
}

