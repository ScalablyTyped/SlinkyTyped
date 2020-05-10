package typingsSlinky.officeUiFabricReact.keytipsCommandBarExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipsCommandBarExampleState extends js.Object {
  var showMessageBar: Boolean = js.native
  var showModal: Boolean = js.native
}

object IKeytipsCommandBarExampleState {
  @scala.inline
  def apply(showMessageBar: Boolean, showModal: Boolean): IKeytipsCommandBarExampleState = {
    val __obj = js.Dynamic.literal(showMessageBar = showMessageBar.asInstanceOf[js.Any], showModal = showModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipsCommandBarExampleState]
  }
  @scala.inline
  implicit class IKeytipsCommandBarExampleStateOps[Self <: IKeytipsCommandBarExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowMessageBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMessageBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showModal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

