package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedLocation
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType = js.native
  def getCountryCode(): String = js.native
  def getId(): Double = js.native
  def getName(): String = js.native
  def getTargetType(): TargetType = js.native
  def getTargetingStatus(): TargetingStatus = js.native
  def getVideoCampaign(): Campaign = js.native
   // TODO: VideoCampaign
  def remove(): Unit = js.native
}

object ExcludedLocation {
  @scala.inline
  def apply(
    getCampaign: () => Campaign,
    getCampaignType: () => CampaignType,
    getCountryCode: () => String,
    getId: () => Double,
    getName: () => String,
    getTargetType: () => TargetType,
    getTargetingStatus: () => TargetingStatus,
    getVideoCampaign: () => Campaign,
    remove: () => Unit
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign), getCampaignType = js.Any.fromFunction0(getCampaignType), getCountryCode = js.Any.fromFunction0(getCountryCode), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getTargetType = js.Any.fromFunction0(getTargetType), getTargetingStatus = js.Any.fromFunction0(getTargetingStatus), getVideoCampaign = js.Any.fromFunction0(getVideoCampaign), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ExcludedLocation]
  }
  @scala.inline
  implicit class ExcludedLocationOps[Self <: ExcludedLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCampaignType(value: () => CampaignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCampaignType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCountryCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCountryCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetType(value: () => TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetingStatus(value: () => TargetingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetingStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVideoCampaign(value: () => Campaign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVideoCampaign")(js.Any.fromFunction0(value))
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

