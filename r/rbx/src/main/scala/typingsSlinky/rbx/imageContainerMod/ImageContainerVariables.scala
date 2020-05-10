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

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/image/image-container.ImageContainerVariablesOverrides, rbx.rbx/elements/image/image-container.ImageContainerVariablesDefaults> */
@js.native
trait ImageContainerVariables extends js.Object {
  var sizes: `16` | `24` | `32` | `48` | `64` | `96` | `128` | `16by9` | `1by1` | `1by2` | `1by3` | `2by1` | `2by3` | `3by1` | `3by2` | `3by4` | `3by5` | `4by3` | `4by5` | `5by3` | `5by4` | `9by16` | square = js.native
}

object ImageContainerVariables {
  @scala.inline
  def apply(
    sizes: `16` | `24` | `32` | `48` | `64` | `96` | `128` | `16by9` | `1by1` | `1by2` | `1by3` | `2by1` | `2by3` | `3by1` | `3by2` | `3by4` | `3by5` | `4by3` | `4by5` | `5by3` | `5by4` | `9by16` | square
  ): ImageContainerVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageContainerVariables]
  }
  @scala.inline
  implicit class ImageContainerVariablesOps[Self <: ImageContainerVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizes(
      value: `16` | `24` | `32` | `48` | `64` | `96` | `128` | `16by9` | `1by1` | `1by2` | `1by3` | `2by1` | `2by3` | `3by1` | `3by2` | `3by4` | `3by5` | `4by3` | `4by5` | `5by3` | `5by4` | `9by16` | square
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

