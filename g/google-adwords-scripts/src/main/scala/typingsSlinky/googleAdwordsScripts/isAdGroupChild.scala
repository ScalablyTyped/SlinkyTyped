package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait isAdGroupChild extends isCampaignChild {
  def getAdGroup(): AdGroup = js.native
}

object isAdGroupChild {
  @scala.inline
  def apply(getAdGroup: () => AdGroup, getCampaign: () => Campaign): isAdGroupChild = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign))
    __obj.asInstanceOf[isAdGroupChild]
  }
  @scala.inline
  implicit class isAdGroupChildOps[Self <: isAdGroupChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAdGroup(value: () => AdGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdGroup")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

