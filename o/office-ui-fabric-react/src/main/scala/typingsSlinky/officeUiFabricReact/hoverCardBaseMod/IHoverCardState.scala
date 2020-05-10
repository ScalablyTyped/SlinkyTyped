package typingsSlinky.officeUiFabricReact.hoverCardBaseMod

import typingsSlinky.officeUiFabricReact.expandingCardTypesMod.ExpandingCardMode
import typingsSlinky.officeUiFabricReact.hoverCardTypesMod.OpenCardMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHoverCardState extends js.Object {
  var isHoverCardVisible: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[ExpandingCardMode] = js.native
  var openMode: js.UndefOr[OpenCardMode] = js.native
}

object IHoverCardState {
  @scala.inline
  def apply(): IHoverCardState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardState]
  }
  @scala.inline
  implicit class IHoverCardStateOps[Self <: IHoverCardState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsHoverCardVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHoverCardVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHoverCardVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHoverCardVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ExpandingCardMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMode(value: OpenCardMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMode")(js.undefined)
        ret
    }
  }
  
}

