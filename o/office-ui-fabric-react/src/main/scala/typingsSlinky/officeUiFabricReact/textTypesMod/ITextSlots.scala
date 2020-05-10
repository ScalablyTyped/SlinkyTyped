package typingsSlinky.officeUiFabricReact.textTypesMod

import typingsSlinky.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextSlots extends js.Object {
  var root: js.UndefOr[IHTMLSlot] = js.native
}

object ITextSlots {
  @scala.inline
  def apply(): ITextSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextSlots]
  }
  @scala.inline
  implicit class ITextSlotsOps[Self <: ITextSlots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: IHTMLSlot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

