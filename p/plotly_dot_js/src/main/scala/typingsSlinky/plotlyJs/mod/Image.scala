package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.above
import typingsSlinky.plotlyJs.plotlyJsStrings.below
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.contain
import typingsSlinky.plotlyJs.plotlyJsStrings.fill
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.stretch
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.x
import typingsSlinky.plotlyJs.plotlyJsStrings.y
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

