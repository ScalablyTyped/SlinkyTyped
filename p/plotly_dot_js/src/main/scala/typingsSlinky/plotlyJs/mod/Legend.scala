package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialFont
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.grouped
import typingsSlinky.plotlyJs.plotlyJsStrings.h
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.normal
import typingsSlinky.plotlyJs.plotlyJsStrings.reversed
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.v
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
    font: PartialFont,
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

