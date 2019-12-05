package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.auto
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.bottom
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.center
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.left
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.middle
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.right
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.top
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelector extends Label {
  var activecolor: String
  var borderwidth: Double
  var buttons: js.Array[Partial[RangeSelectorButton]]
  var visible: Boolean
  var x: Double
  var xanchor: auto | left | center | right
  var y: Double
  var yanchor: auto | top | middle | bottom
}

object RangeSelector {
  @scala.inline
  def apply(
    activecolor: String,
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    buttons: js.Array[Partial[RangeSelectorButton]],
    font: Partial[Font],
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): RangeSelector = {
    val __obj = js.Dynamic.literal(activecolor = activecolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelector]
  }
}

