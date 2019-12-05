package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.above
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.below
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.bottom
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.center
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.contain
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.fill
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.left
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.middle
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.paper
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.right
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.stretch
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.top
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.x
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var layer: above | below
  var opacity: Double
  var sizex: Double
  var sizey: Double
  var sizing: fill | contain | stretch
  var source: String
  var visible: Boolean
  var x: Double | String
  var xanchor: left | center | right
  var xref: paper | x
  var y: Double | String
  var yanchor: top | middle | bottom
  var yref: paper | y
}

object Image {
  @scala.inline
  def apply(
    layer: above | below,
    opacity: Double,
    sizex: Double,
    sizey: Double,
    sizing: fill | contain | stretch,
    source: String,
    visible: Boolean,
    x: Double | String,
    xanchor: left | center | right,
    xref: paper | x,
    y: Double | String,
    yanchor: top | middle | bottom,
    yref: paper | y
  ): Image = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sizex = sizex.asInstanceOf[js.Any], sizey = sizey.asInstanceOf[js.Any], sizing = sizing.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Image]
  }
}

