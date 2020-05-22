package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialFont
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`line-center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top right`
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxSymbol extends js.Object {
  var icon: String
  var iconsize: Double
  var placement: point | line | `line-center`
  var text: String
  var textfont: PartialFont
  var textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
}

object MapboxSymbol {
  @scala.inline
  def apply(
    icon: String,
    iconsize: Double,
    placement: point | line | `line-center`,
    text: String,
    textfont: PartialFont,
    textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ): MapboxSymbol = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], iconsize = iconsize.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxSymbol]
  }
}

