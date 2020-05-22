package typingsSlinky.autolinker.autolinkerMod

import typingsSlinky.autolinker.autolinkerStrings.end
import typingsSlinky.autolinker.autolinkerStrings.middle
import typingsSlinky.autolinker.autolinkerStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateConfigObj extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[end | middle | smart] = js.undefined
}

object TruncateConfigObj {
  @scala.inline
  def apply(length: js.UndefOr[Double] = js.undefined, location: end | middle | smart = null): TruncateConfigObj = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateConfigObj]
  }
}

