package typingsSlinky.rbx.tabGroupMod

import typingsSlinky.rbx.rbxStrings.`toggle-rounded`
import typingsSlinky.rbx.rbxStrings.boxed
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabGroupModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.native
  var fullwidth: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[boxed | toggle | `toggle-rounded`] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
}

object TabGroupModifierProps {
  @scala.inline
  def apply(): TabGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabGroupModifierProps]
  }
  @scala.inline
  implicit class TabGroupModifierPropsOps[Self <: TabGroupModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: centered | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withFullwidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: boxed | toggle | `toggle-rounded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large): Self = {
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

