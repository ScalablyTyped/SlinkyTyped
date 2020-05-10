package typingsSlinky.dockerode

import typingsSlinky.dockerode.mod.MountPropagation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPropagation extends js.Object {
  var Propagation: MountPropagation = js.native
}

object AnonPropagation {
  @scala.inline
  def apply(Propagation: MountPropagation): AnonPropagation = {
    val __obj = js.Dynamic.literal(Propagation = Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropagation]
  }
  @scala.inline
  implicit class AnonPropagationOps[Self <: AnonPropagation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropagation(value: MountPropagation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Propagation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

