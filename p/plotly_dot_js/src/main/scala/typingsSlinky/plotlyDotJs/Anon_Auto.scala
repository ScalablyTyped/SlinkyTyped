package typingsSlinky.plotlyDotJs

import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Font
import typingsSlinky.plotlyDotJs.plotlyDotJsMod.Padding
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.auto
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.bottom
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.center
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.container
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.left
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.middle
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.paper
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.right
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.top
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var font: Partial[Font]
  var pad: Partial[Padding]
  var text: String
  var x: Double
  var xanchor: auto | left | center | right
  var xref: container | paper
  var y: Double
  var yanchor: auto | top | middle | bottom
  var yref: container | paper
}

object Anon_Auto {
  @scala.inline
  def apply(
    font: Partial[Font],
    pad: Partial[Padding],
    text: String,
    x: Double,
    xanchor: auto | left | center | right,
    xref: container | paper,
    y: Double,
    yanchor: auto | top | middle | bottom,
    yref: container | paper
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Auto]
  }
}

