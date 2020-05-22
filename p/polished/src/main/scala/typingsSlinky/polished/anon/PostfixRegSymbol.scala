package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedStrings.BackslashRightparenthesis
import typingsSlinky.polished.polishedStrings.Rightparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostfixRegSymbol extends js.Object {
  var postfix: ArgCountFNotation
  var regSymbol: BackslashRightparenthesis
  var symbol: Rightparenthesis
}

object PostfixRegSymbol {
  @scala.inline
  def apply(postfix: ArgCountFNotation, regSymbol: BackslashRightparenthesis, symbol: Rightparenthesis): PostfixRegSymbol = {
    val __obj = js.Dynamic.literal(postfix = postfix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostfixRegSymbol]
  }
}

