package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexTokenizerOptions extends js.Object {
  var discardEmpty: js.UndefOr[Boolean] = js.undefined
  var pattern: js.RegExp
}

object RegexTokenizerOptions {
  @scala.inline
  def apply(pattern: js.RegExp, discardEmpty: js.UndefOr[Boolean] = js.undefined): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(discardEmpty)) __obj.updateDynamic("discardEmpty")(discardEmpty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
}

