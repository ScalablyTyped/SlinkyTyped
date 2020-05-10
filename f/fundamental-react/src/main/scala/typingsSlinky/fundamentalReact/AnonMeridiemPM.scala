package typingsSlinky.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMeridiemPM extends js.Object {
  var meridiemAM: String = js.native
  var meridiemPM: String = js.native
}

object AnonMeridiemPM {
  @scala.inline
  def apply(meridiemAM: String, meridiemPM: String): AnonMeridiemPM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM.asInstanceOf[js.Any], meridiemPM = meridiemPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeridiemPM]
  }
  @scala.inline
  implicit class AnonMeridiemPMOps[Self <: AnonMeridiemPM] (val x: Self) extends AnyVal {
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

