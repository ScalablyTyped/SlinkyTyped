package typingsSlinky.officeUiFabricReact.withViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWithViewportState extends js.Object {
  var viewport: js.UndefOr[IViewport] = js.native
}

object IWithViewportState {
  @scala.inline
  def apply(): IWithViewportState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWithViewportState]
  }
  @scala.inline
  implicit class IWithViewportStateOps[Self <: IWithViewportState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewport(value: IViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

