package typingsSlinky.rbx.cardHeaderTitleMod

import typingsSlinky.rbx.rbxStrings.centered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardHeaderTitleModifierProps extends js.Object {
  var align: js.UndefOr[centered] = js.native
}

object CardHeaderTitleModifierProps {
  @scala.inline
  def apply(): CardHeaderTitleModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardHeaderTitleModifierProps]
  }
  @scala.inline
  implicit class CardHeaderTitleModifierPropsOps[Self <: CardHeaderTitleModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: centered): Self = {
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

