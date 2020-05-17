package typingsSlinky.cathoQuantum.skeletonMod

import typingsSlinky.cathoQuantum.anon.BaseFontSizeNumber
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonTagProps extends js.Object {
  var size: xsmall | small | medium | large = js.native
  var theme: BaseFontSizeNumber = js.native
}

object SkeletonTagProps {
  @scala.inline
  def apply(size: xsmall | small | medium | large, theme: BaseFontSizeNumber): SkeletonTagProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonTagProps]
  }
  @scala.inline
  implicit class SkeletonTagPropsOps[Self <: SkeletonTagProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: xsmall | small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: BaseFontSizeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

