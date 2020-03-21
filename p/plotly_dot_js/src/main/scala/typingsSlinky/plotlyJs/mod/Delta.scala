package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.AnonSymbol
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var decreasing: AnonSymbol
  var increasing: AnonSymbol
  var position: top | bottom | left | right
  var reference: Double
  var relative: Boolean
  var valueformat: String
}

object Delta {
  @scala.inline
  def apply(
    decreasing: AnonSymbol,
    increasing: AnonSymbol,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Delta = {
    val __obj = js.Dynamic.literal(decreasing = decreasing.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
}

