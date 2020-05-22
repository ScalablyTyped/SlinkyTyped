package typingsSlinky.rbx.pageLoaderPageLoaderMod

import typingsSlinky.rbx.rbxStrings.`left-to-right`
import typingsSlinky.rbx.rbxStrings.`right-to-left`
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageLoaderModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var direction: js.UndefOr[`right-to-left` | `left-to-right`] = js.undefined
}

object PageLoaderModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    direction: `right-to-left` | `left-to-right` = null
  ): PageLoaderModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLoaderModifierProps]
  }
}

