package typingsSlinky.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeridiemPM extends js.Object {
  var meridiemAM: String = js.native
  var meridiemPM: String = js.native
}

object MeridiemPM {
  @scala.inline
  def apply(meridiemAM: String, meridiemPM: String): MeridiemPM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM.asInstanceOf[js.Any], meridiemPM = meridiemPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeridiemPM]
  }
  @scala.inline
  implicit class MeridiemPMOps[Self <: MeridiemPM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeridiemAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemAM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeridiemPM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemPM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

