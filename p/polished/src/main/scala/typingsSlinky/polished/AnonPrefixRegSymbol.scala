package typingsSlinky.polished

import typingsSlinky.polished.polishedStrings.BackslashLeftparenthesis
import typingsSlinky.polished.polishedStrings.Leftparenthesis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefixRegSymbol extends js.Object {
  var prefix: AnonRightToLeftSymbol
  var regSymbol: BackslashLeftparenthesis
  var symbol: Leftparenthesis
}

object AnonPrefixRegSymbol {
  @scala.inline
  def apply(prefix: AnonRightToLeftSymbol, regSymbol: BackslashLeftparenthesis, symbol: Leftparenthesis): AnonPrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrefixRegSymbol]
  }
}

