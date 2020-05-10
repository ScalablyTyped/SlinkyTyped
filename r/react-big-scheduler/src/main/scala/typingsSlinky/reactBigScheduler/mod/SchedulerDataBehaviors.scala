package typingsSlinky.reactBigScheduler.mod

import typingsSlinky.reactBigScheduler.AnonCellUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerDataBehaviors extends js.Object {
  var getCustomDateFunc: js.UndefOr[
    js.Function3[
      /* schedulerData */ SchedulerData, 
      /* num */ Double, 
      /* date */ js.UndefOr[String], 
      AnonCellUnit
    ]
  ] = js.native
  var isNonWorkingTimeFunc: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* time */ String, Boolean]] = js.native
}

object SchedulerDataBehaviors {
  @scala.inline
  def apply(): SchedulerDataBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerDataBehaviors]
  }
  @scala.inline
  implicit class SchedulerDataBehaviorsOps[Self <: SchedulerDataBehaviors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCustomDateFunc(
      value: (/* schedulerData */ SchedulerData, /* num */ Double, /* date */ js.UndefOr[String]) => AnonCellUnit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomDateFunc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetCustomDateFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomDateFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNonWorkingTimeFunc(value: (/* schedulerData */ SchedulerData, /* time */ String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNonWorkingTimeFunc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsNonWorkingTimeFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNonWorkingTimeFunc")(js.undefined)
        ret
    }
  }
  
}

