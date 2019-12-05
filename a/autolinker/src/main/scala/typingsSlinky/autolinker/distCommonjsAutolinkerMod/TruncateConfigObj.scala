package typingsSlinky.autolinker.distCommonjsAutolinkerMod

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
  def apply(length: Int | Double = null, location: end | middle | smart = null): TruncateConfigObj = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateConfigObj]
  }
}

