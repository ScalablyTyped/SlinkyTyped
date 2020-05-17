package typingsSlinky.bitcoreLib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevHash extends js.Object {
  var prevHash: String = js.native
  var time: Double = js.native
}

object PrevHash {
  @scala.inline
  def apply(prevHash: String, time: Double): PrevHash = {
    val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevHash]
  }
  @scala.inline
  implicit class PrevHashOps[Self <: PrevHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrevHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

