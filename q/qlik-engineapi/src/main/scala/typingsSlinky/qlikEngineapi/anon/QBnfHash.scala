package typingsSlinky.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QBnfHash extends js.Object {
  var qBnfHash: String = js.native
}

object QBnfHash {
  @scala.inline
  def apply(qBnfHash: String): QBnfHash = {
    val __obj = js.Dynamic.literal(qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfHash]
  }
  @scala.inline
  implicit class QBnfHashOps[Self <: QBnfHash] (val x: Self) extends AnyVal {
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

