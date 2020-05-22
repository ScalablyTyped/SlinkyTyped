package typingsSlinky.rbx.imageContainerMod

import typingsSlinky.rbx.rbxNumbers.`128`
import typingsSlinky.rbx.rbxNumbers.`16`
import typingsSlinky.rbx.rbxNumbers.`24`
import typingsSlinky.rbx.rbxNumbers.`32`
import typingsSlinky.rbx.rbxNumbers.`48`
import typingsSlinky.rbx.rbxNumbers.`64`
import typingsSlinky.rbx.rbxNumbers.`96`
import typingsSlinky.rbx.rbxStrings.`16by9`
import typingsSlinky.rbx.rbxStrings.`1by1`
import typingsSlinky.rbx.rbxStrings.`1by2`
import typingsSlinky.rbx.rbxStrings.`1by3`
import typingsSlinky.rbx.rbxStrings.`2by1`
import typingsSlinky.rbx.rbxStrings.`2by3`
import typingsSlinky.rbx.rbxStrings.`3by1`
import typingsSlinky.rbx.rbxStrings.`3by2`
import typingsSlinky.rbx.rbxStrings.`3by4`
import typingsSlinky.rbx.rbxStrings.`3by5`
import typingsSlinky.rbx.rbxStrings.`4by3`
import typingsSlinky.rbx.rbxStrings.`4by5`
import typingsSlinky.rbx.rbxStrings.`5by3`
import typingsSlinky.rbx.rbxStrings.`5by4`
import typingsSlinky.rbx.rbxStrings.`9by16`
import typingsSlinky.rbx.rbxStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageContainerModifierProps extends js.Object {
  var size: js.UndefOr[
    `16` | `24` | `32` | `48` | `64` | `96` | `128` | `16by9` | `1by1` | `1by2` | `1by3` | `2by1` | `2by3` | `3by1` | `3by2` | `3by4` | `3by5` | `4by3` | `4by5` | `5by3` | `5by4` | `9by16` | square
  ] = js.undefined
}

object ImageContainerModifierProps {
  @scala.inline
  def apply(
    size: `16` | `24` | `32` | `48` | `64` | `96` | `128` | `16by9` | `1by1` | `1by2` | `1by3` | `2by1` | `2by3` | `3by1` | `3by2` | `3by4` | `3by5` | `4by3` | `4by5` | `5by3` | `5by4` | `9by16` | square = null
  ): ImageContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageContainerModifierProps]
  }
}

