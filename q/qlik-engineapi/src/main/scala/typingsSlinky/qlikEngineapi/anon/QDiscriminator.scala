package typingsSlinky.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QDiscriminator extends js.Object {
  var qDiscriminator: String = js.native
}

object QDiscriminator {
  @scala.inline
  def apply(qDiscriminator: String): QDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDiscriminator]
  }
  @scala.inline
  implicit class QDiscriminatorOps[Self <: QDiscriminator] (val x: Self) extends AnyVal {
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

