package typingsSlinky.rcMenu.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[typingsSlinky.react.mod.Key] = js.undefined
}

object Children {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    eventKey: typingsSlinky.react.mod.Key = null
  ): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.get.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

