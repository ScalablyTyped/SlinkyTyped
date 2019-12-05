package typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod

import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends ClassAttributes[System] {
  var allowHTML: js.UndefOr[Boolean] = js.undefined
  var noAnimation: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Style | Boolean] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    noAnimation: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[System] = null,
    style: Style | Boolean = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

