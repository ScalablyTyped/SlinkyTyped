package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkingRouteResult extends js.Object {
  var city: String = js.native
  def getEnd(): LocalResultPoi = js.native
  def getNumPlans(): Double = js.native
  def getPlan(i: Double): RoutePlan = js.native
  def getStart(): LocalResultPoi = js.native
}

object WalkingRouteResult {
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => RoutePlan,
    getStart: () => LocalResultPoi
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart))
    __obj.asInstanceOf[WalkingRouteResult]
  }
  @scala.inline
  implicit class WalkingRouteResultOps[Self <: WalkingRouteResult] (val x: Self) extends AnyVal {
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
    def withGetPlan(value: Double => RoutePlan): Self = {
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
  }
  
}

