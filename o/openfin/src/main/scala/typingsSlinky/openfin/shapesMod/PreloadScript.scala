package typingsSlinky.openfin.shapesMod

import typingsSlinky.openfin.openfinStrings.`load-failed`
import typingsSlinky.openfin.openfinStrings.`load-started`
import typingsSlinky.openfin.openfinStrings.`load-succeeded`
import typingsSlinky.openfin.openfinStrings.failed
import typingsSlinky.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreloadScript extends js.Object {
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[`load-started` | `load-failed` | `load-succeeded` | failed | succeeded] = js.undefined
  var url: String
}

object PreloadScript {
  @scala.inline
  def apply(
    url: String,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded = null
  ): PreloadScript = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScript]
  }
}

