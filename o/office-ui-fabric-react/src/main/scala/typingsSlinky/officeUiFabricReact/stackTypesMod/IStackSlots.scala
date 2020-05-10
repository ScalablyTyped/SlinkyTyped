package typingsSlinky.officeUiFabricReact.stackTypesMod

import typingsSlinky.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackSlots extends js.Object {
  /**
    * Defines a slot that is placed inside the root slot in order to achieve wrapping. Only used when the wrap
    * property is set to true.
    */
  var inner: js.UndefOr[IHTMLSlot] = js.native
  /**
    * Defines root slot of the component.
    */
  var root: js.UndefOr[IHTMLSlot] = js.native
}

object IStackSlots {
  @scala.inline
  def apply(): IStackSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackSlots]
  }
  @scala.inline
  implicit class IStackSlotsOps[Self <: IStackSlots] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInner(value: IHTMLSlot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(js.undefined)
        ret
    }
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

