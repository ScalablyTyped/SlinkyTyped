package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.base.IToggleState> */
@js.native
trait PartialIToggleState extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
}

object PartialIToggleState {
  @scala.inline
  def apply(): PartialIToggleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIToggleState]
  }
  @scala.inline
  implicit class PartialIToggleStateOps[Self <: PartialIToggleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
  }
  
}

