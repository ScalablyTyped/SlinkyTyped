package typingsSlinky.rbx.fileMod

import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var boxed: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var hasName: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object FileModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    boxed: js.UndefOr[Boolean] = js.undefined,
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    hasName: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): FileModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(boxed)) __obj.updateDynamic("boxed")(boxed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasName)) __obj.updateDynamic("hasName")(hasName.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileModifierProps]
  }
}

