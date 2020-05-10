package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventConditions extends js.Object {
  var eventConditions: js.UndefOr[js.Array[AnonComparisonType]] = js.native
  var useEventValue: js.UndefOr[Boolean] = js.native
}

object AnonEventConditions {
  @scala.inline
  def apply(): AnonEventConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEventConditions]
  }
  @scala.inline
  implicit class AnonEventConditionsOps[Self <: AnonEventConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventConditions(value: js.Array[AnonComparisonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEventValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEventValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEventValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEventValue")(js.undefined)
        ret
    }
  }
  
}

