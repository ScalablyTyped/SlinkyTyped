package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait isCampaignChild extends js.Object {
  def getCampaign(): Campaign = js.native
}

object isCampaignChild {
  @scala.inline
  def apply(getCampaign: () => Campaign): isCampaignChild = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign))
    __obj.asInstanceOf[isCampaignChild]
  }
  @scala.inline
  implicit class isCampaignChildOps[Self <: isCampaignChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCampaign(value: () => Campaign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCampaign")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

