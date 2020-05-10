package typingsSlinky.rbx.tagGroupMod

import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagGroupModifierProps extends js.Object {
  var gapless: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[medium | large] = js.native
}

object TagGroupModifierProps {
  @scala.inline
  def apply(): TagGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagGroupModifierProps]
  }
  @scala.inline
  implicit class TagGroupModifierPropsOps[Self <: TagGroupModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGapless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapless")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

