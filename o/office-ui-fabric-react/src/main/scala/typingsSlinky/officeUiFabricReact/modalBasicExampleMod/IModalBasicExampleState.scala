package typingsSlinky.officeUiFabricReact.modalBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalBasicExampleState extends js.Object {
  var isDraggable: Boolean = js.native
  var showModal: Boolean = js.native
}

object IModalBasicExampleState {
  @scala.inline
  def apply(isDraggable: Boolean, showModal: Boolean): IModalBasicExampleState = {
    val __obj = js.Dynamic.literal(isDraggable = isDraggable.asInstanceOf[js.Any], showModal = showModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalBasicExampleState]
  }
  @scala.inline
  implicit class IModalBasicExampleStateOps[Self <: IModalBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(value.asInstanceOf[js.Any])
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

