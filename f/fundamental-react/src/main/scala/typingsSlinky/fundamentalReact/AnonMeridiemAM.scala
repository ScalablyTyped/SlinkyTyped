package typingsSlinky.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMeridiemAM extends js.Object {
  var meridiemAM: js.UndefOr[String] = js.native
  var meridiemPM: js.UndefOr[String] = js.native
}

object AnonMeridiemAM {
  @scala.inline
  def apply(): AnonMeridiemAM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMeridiemAM]
  }
  @scala.inline
  implicit class AnonMeridiemAMOps[Self <: AnonMeridiemAM] (val x: Self) extends AnyVal {
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
    def withoutMeridiemAM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemAM")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiemPM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemPM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiemPM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemPM")(js.undefined)
        ret
    }
  }
  
}

