package typingsSlinky.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonControllerId extends js.Object {
  var controllerId: Double = js.native
}

object AnonControllerId {
  @scala.inline
  def apply(controllerId: Double): AnonControllerId = {
    val __obj = js.Dynamic.literal(controllerId = controllerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControllerId]
  }
  @scala.inline
  implicit class AnonControllerIdOps[Self <: AnonControllerId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

