package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQDiscriminator extends js.Object {
  var qDiscriminator: String = js.native
}

object AnonQDiscriminator {
  @scala.inline
  def apply(qDiscriminator: String): AnonQDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQDiscriminator]
  }
  @scala.inline
  implicit class AnonQDiscriminatorOps[Self <: AnonQDiscriminator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDiscriminator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDiscriminator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

