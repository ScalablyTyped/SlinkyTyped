package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitRouteResult extends js.Object {
  var city: String = js.native
  var moreResultsUrl: String = js.native
  var policy: TransitPolicy = js.native
  def getEnd(): LocalResultPoi = js.native
  def getNumPlans(): Double = js.native
  def getPlan(i: Double): TransitRoutePlan = js.native
  def getStart(): LocalResultPoi = js.native
}

object TransitRouteResult {
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => TransitRoutePlan,
    getStart: () => LocalResultPoi,
    moreResultsUrl: String,
    policy: TransitPolicy
  ): TransitRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart), moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitRouteResult]
  }
  @scala.inline
  implicit class TransitRouteResultOps[Self <: TransitRouteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEnd(value: () => LocalResultPoi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumPlans(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumPlans")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlan(value: Double => TransitRoutePlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => LocalResultPoi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoreResultsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreResultsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: TransitPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

