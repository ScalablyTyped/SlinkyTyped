package typingsSlinky.primereact.tooltipOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var event: js.UndefOr[String] = js.undefined
  var hideDelay: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showDelay: js.UndefOr[Double] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    event: String = null,
    hideDelay: js.UndefOr[Double] = js.undefined,
    position: String = null,
    showDelay: js.UndefOr[Double] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showDelay)) __obj.updateDynamic("showDelay")(showDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

