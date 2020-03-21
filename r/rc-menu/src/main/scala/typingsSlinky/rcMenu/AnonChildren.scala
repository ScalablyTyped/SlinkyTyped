package typingsSlinky.rcMenu

import slinky.core.TagMod
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[Key] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    eventKey: Key = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

