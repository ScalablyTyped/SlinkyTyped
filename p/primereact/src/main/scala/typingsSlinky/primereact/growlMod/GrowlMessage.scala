package typingsSlinky.primereact.growlMod

import slinky.core.TagMod
import typingsSlinky.primereact.primereactStrings.error
import typingsSlinky.primereact.primereactStrings.info
import typingsSlinky.primereact.primereactStrings.success
import typingsSlinky.primereact.primereactStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrowlMessage extends js.Object {
  var closable: js.UndefOr[Boolean] = js.undefined
  var detail: js.UndefOr[TagMod[Any]] = js.undefined
  var life: js.UndefOr[Double] = js.undefined
  var severity: js.UndefOr[success | info | warn | error] = js.undefined
  var sticky: js.UndefOr[Boolean] = js.undefined
  var summary: js.UndefOr[TagMod[Any]] = js.undefined
}

object GrowlMessage {
  @scala.inline
  def apply(
    closable: js.UndefOr[Boolean] = js.undefined,
    detail: TagMod[Any] = null,
    life: js.UndefOr[Double] = js.undefined,
    severity: success | info | warn | error = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    summary: TagMod[Any] = null
  ): GrowlMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(life)) __obj.updateDynamic("life")(life.get.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.get.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrowlMessage]
  }
}

