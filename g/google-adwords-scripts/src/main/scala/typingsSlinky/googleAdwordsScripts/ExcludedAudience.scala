package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedAudience extends isAdGroupChild {
  def getAudienceId(): Double = js.native
  def getAudienceType(): AudienceType = js.native
  def getId(): Double = js.native
  def remove(): Unit = js.native
}

object ExcludedAudience {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getAudienceId: () => Double,
    getAudienceType: () => AudienceType,
    getCampaign: () => Campaign,
    getId: () => Double,
    remove: () => Unit
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getAudienceType = js.Any.fromFunction0(getAudienceType), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedAudience]
  }
  @scala.inline
  implicit class ExcludedAudienceOps[Self <: ExcludedAudience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAudienceId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAudienceId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAudienceType(value: () => AudienceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAudienceType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

