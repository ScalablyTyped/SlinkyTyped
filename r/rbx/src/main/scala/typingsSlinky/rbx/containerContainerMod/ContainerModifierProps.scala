package typingsSlinky.rbx.containerContainerMod

import typingsSlinky.rbx.rbxStrings.desktop
import typingsSlinky.rbx.rbxStrings.fullhd
import typingsSlinky.rbx.rbxStrings.mobile
import typingsSlinky.rbx.rbxStrings.tablet
import typingsSlinky.rbx.rbxStrings.touch
import typingsSlinky.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
}

object ContainerModifierProps {
  @scala.inline
  def apply(
    breakpoint: mobile | tablet | desktop | widescreen | fullhd | touch = null,
    fluid: js.UndefOr[Boolean] = js.undefined
  ): ContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerModifierProps]
  }
}

