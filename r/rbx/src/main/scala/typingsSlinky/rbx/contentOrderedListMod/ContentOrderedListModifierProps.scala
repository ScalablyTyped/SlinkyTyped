package typingsSlinky.rbx.contentOrderedListMod

import typingsSlinky.rbx.rbxStrings.`lower-alpha`
import typingsSlinky.rbx.rbxStrings.`lower-roman`
import typingsSlinky.rbx.rbxStrings.`upper-alpha`
import typingsSlinky.rbx.rbxStrings.`upper-roman`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentOrderedListModifierProps extends js.Object {
  var `type`: js.UndefOr[`lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`] = js.native
}

object ContentOrderedListModifierProps {
  @scala.inline
  def apply(): ContentOrderedListModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOrderedListModifierProps]
  }
  @scala.inline
  implicit class ContentOrderedListModifierPropsOps[Self <: ContentOrderedListModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

