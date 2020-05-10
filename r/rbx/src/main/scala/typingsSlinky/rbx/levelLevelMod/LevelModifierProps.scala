package typingsSlinky.rbx.levelLevelMod

import typingsSlinky.rbx.rbxStrings.desktop
import typingsSlinky.rbx.rbxStrings.fullhd
import typingsSlinky.rbx.rbxStrings.mobile
import typingsSlinky.rbx.rbxStrings.tablet
import typingsSlinky.rbx.rbxStrings.touch
import typingsSlinky.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.native
}

object LevelModifierProps {
  @scala.inline
  def apply(): LevelModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelModifierProps]
  }
  @scala.inline
  implicit class LevelModifierPropsOps[Self <: LevelModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(js.undefined)
        ret
    }
  }
  
}

