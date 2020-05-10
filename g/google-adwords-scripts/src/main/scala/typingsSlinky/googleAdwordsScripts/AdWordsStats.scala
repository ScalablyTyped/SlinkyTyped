package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsStats extends js.Object {
  def getAverageCpc(): Double = js.native
  def getAverageCpm(): Double = js.native
  def getAverageCpv(): Double = js.native
  def getAveragePageviews(): Double = js.native
  def getAveragePosition(): Double = js.native
  def getAverageTimeOnSite(): Double = js.native
  def getBounceRage(): Double = js.native
  def getClicks(): Double = js.native
  def getConversionRate(): Double = js.native
  def getConversions(): Double = js.native
  def getCost(): Double = js.native
  def getCtr(): Double = js.native
  def getImpressions(): Double = js.native
  def getViewRate(): Double = js.native
  def getViews(): Double = js.native
}

object AdWordsStats {
  @scala.inline
  def apply(
    getAverageCpc: () => Double,
    getAverageCpm: () => Double,
    getAverageCpv: () => Double,
    getAveragePageviews: () => Double,
    getAveragePosition: () => Double,
    getAverageTimeOnSite: () => Double,
    getBounceRage: () => Double,
    getClicks: () => Double,
    getConversionRate: () => Double,
    getConversions: () => Double,
    getCost: () => Double,
    getCtr: () => Double,
    getImpressions: () => Double,
    getViewRate: () => Double,
    getViews: () => Double
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal(getAverageCpc = js.Any.fromFunction0(getAverageCpc), getAverageCpm = js.Any.fromFunction0(getAverageCpm), getAverageCpv = js.Any.fromFunction0(getAverageCpv), getAveragePageviews = js.Any.fromFunction0(getAveragePageviews), getAveragePosition = js.Any.fromFunction0(getAveragePosition), getAverageTimeOnSite = js.Any.fromFunction0(getAverageTimeOnSite), getBounceRage = js.Any.fromFunction0(getBounceRage), getClicks = js.Any.fromFunction0(getClicks), getConversionRate = js.Any.fromFunction0(getConversionRate), getConversions = js.Any.fromFunction0(getConversions), getCost = js.Any.fromFunction0(getCost), getCtr = js.Any.fromFunction0(getCtr), getImpressions = js.Any.fromFunction0(getImpressions), getViewRate = js.Any.fromFunction0(getViewRate), getViews = js.Any.fromFunction0(getViews))
    __obj.asInstanceOf[AdWordsStats]
  }
  @scala.inline
  implicit class AdWordsStatsOps[Self <: AdWordsStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAverageCpc(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAverageCpc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAverageCpm(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAverageCpm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAverageCpv(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAverageCpv")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAveragePageviews(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAveragePageviews")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAveragePosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAveragePosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAverageTimeOnSite(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAverageTimeOnSite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBounceRage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounceRage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClicks(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClicks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConversionRate(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConversionRate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConversions(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConversions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCost(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCost")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCtr(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCtr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImpressions(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImpressions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewRate(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewRate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViews(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViews")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

