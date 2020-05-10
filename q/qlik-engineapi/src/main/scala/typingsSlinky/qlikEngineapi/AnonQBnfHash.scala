package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQBnfHash extends js.Object {
  var qBnfHash: String = js.native
}

object AnonQBnfHash {
  @scala.inline
  def apply(qBnfHash: String): AnonQBnfHash = {
    val __obj = js.Dynamic.literal(qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQBnfHash]
  }
  @scala.inline
  implicit class AnonQBnfHashOps[Self <: AnonQBnfHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBnfHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBnfHash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

