package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQLineage extends js.Object {
  var qLineage: js.Array[AnonQDiscriminator] = js.native
}

object AnonQLineage {
  @scala.inline
  def apply(qLineage: js.Array[AnonQDiscriminator]): AnonQLineage = {
    val __obj = js.Dynamic.literal(qLineage = qLineage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQLineage]
  }
  @scala.inline
  implicit class AnonQLineageOps[Self <: AnonQLineage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQLineage(value: js.Array[AnonQDiscriminator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLineage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

