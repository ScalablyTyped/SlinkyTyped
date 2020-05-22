package typingsSlinky.javascriptObfuscator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalReturn extends js.Object {
  var globalReturn: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object GlobalReturn {
  @scala.inline
  def apply(
    globalReturn: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    jsx: js.UndefOr[Boolean] = js.undefined
  ): GlobalReturn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(globalReturn)) __obj.updateDynamic("globalReturn")(globalReturn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalReturn]
  }
}

