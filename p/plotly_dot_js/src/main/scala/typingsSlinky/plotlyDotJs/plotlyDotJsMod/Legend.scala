package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.auto
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.bottom
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.center
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.grouped
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.h
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.left
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.middle
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.normal
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.reversed
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.right
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.top
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.v
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends Label {
  var borderwidth: Double
  var orientation: v | h
  var tracegroupgap: Double
  var traceorder: grouped | normal | reversed
  var x: Double
  var xanchor: auto | left | center | right
  var y: Double
  var yanchor: auto | top | middle | bottom
}

object Legend {
  @scala.inline
  def apply(
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    font: Partial[Font],
    orientation: v | h,
    tracegroupgap: Double,
    traceorder: grouped | normal | reversed,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Legend = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], tracegroupgap = tracegroupgap.asInstanceOf[js.Any], traceorder = traceorder.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Legend]
  }
}

