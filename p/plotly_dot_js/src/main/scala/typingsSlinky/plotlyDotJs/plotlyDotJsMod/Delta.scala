package typingsSlinky.plotlyDotJs.plotlyDotJsMod

import typingsSlinky.plotlyDotJs.Anon_ColorSymbol
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.bottom
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.left
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.right
import typingsSlinky.plotlyDotJs.plotlyDotJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var decreasing: Anon_ColorSymbol
  var increasing: Anon_ColorSymbol
  var position: top | bottom | left | right
  var reference: Double
  var relative: Boolean
  var valueformat: String
}

object Delta {
  @scala.inline
  def apply(
    decreasing: Anon_ColorSymbol,
    increasing: Anon_ColorSymbol,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Delta = {
    val __obj = js.Dynamic.literal(decreasing = decreasing.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
}

