package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.^
import typingsSlinky.polished.polishedStrings.`Backslash^`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Infix extends js.Object {
  var infix: F
  var regSymbol: `Backslash^`
  var symbol: ^
}

object Infix {
  @scala.inline
  def apply(infix: F, regSymbol: `Backslash^`, symbol: ^): Infix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infix]
  }
}

