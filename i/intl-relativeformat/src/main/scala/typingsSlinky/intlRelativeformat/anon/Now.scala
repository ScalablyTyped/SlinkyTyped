package typingsSlinky.intlRelativeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Now extends js.Object {
  var now: js.UndefOr[js.Date | Double | Null] = js.undefined
}

object Now {
  @scala.inline
  def apply(now: js.UndefOr[Null | js.Date | Double] = js.undefined): Now = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(now)) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[Now]
  }
}

