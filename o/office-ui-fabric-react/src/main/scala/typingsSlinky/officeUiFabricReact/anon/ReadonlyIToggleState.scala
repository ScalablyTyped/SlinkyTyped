package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.base.IToggleState> */
@js.native
trait ReadonlyIToggleState extends js.Object {
  val checked: Boolean = js.native
}

object ReadonlyIToggleState {
  @scala.inline
  def apply(checked: Boolean): ReadonlyIToggleState = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIToggleState]
  }
  @scala.inline
  implicit class ReadonlyIToggleStateOps[Self <: ReadonlyIToggleState] (val x: Self) extends AnyVal {
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
  }
  
}

