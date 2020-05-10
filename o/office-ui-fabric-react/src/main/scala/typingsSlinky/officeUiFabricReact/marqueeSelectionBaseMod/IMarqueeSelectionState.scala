package typingsSlinky.officeUiFabricReact.marqueeSelectionBaseMod

import typingsSlinky.uifabricUtilities.ipointMod.IPoint
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionState extends js.Object {
  var dragOrigin: js.UndefOr[IPoint] = js.native
  var dragRect: js.UndefOr[IRectangle] = js.native
}

object IMarqueeSelectionState {
  @scala.inline
  def apply(): IMarqueeSelectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarqueeSelectionState]
  }
  @scala.inline
  implicit class IMarqueeSelectionStateOps[Self <: IMarqueeSelectionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragOrigin(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDragRect(value: IRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRect")(js.undefined)
        ret
    }
  }
  
}

