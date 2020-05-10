package typingsSlinky.rbx.mediaItemMod

import typingsSlinky.rbx.rbxStrings.content
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaItemModifierProps extends js.Object {
  var align: js.UndefOr[content | left | right] = js.native
}

object MediaItemModifierProps {
  @scala.inline
  def apply(): MediaItemModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaItemModifierProps]
  }
  @scala.inline
  implicit class MediaItemModifierPropsOps[Self <: MediaItemModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: content | left | right): Self = {
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
  }
  
}

