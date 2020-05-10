package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMasterData extends js.Object {
  var masterData: js.UndefOr[Double] = js.native
}

object AnonMasterData {
  @scala.inline
  def apply(): AnonMasterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMasterData]
  }
  @scala.inline
  implicit class AnonMasterDataOps[Self <: AnonMasterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasterData(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterData")(js.undefined)
        ret
    }
  }
  
}

